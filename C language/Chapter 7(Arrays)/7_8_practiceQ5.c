// 5. Write a program containing a function that reverses the array passed to it.

#include<stdio.h>
void rev(int *a, int n);

int main()
{
    int a[] = {1,2,3,4,5,6,7,8,9,10};
    rev(a, 10);
    for (int i = 0; i < 10; i++)
    {
    printf("The reverse of a[%d] is: a[%d]\n", i+1, a[i]);
    }
    return 0;
}

void rev(int *a, int n)
{
    for (int i = 0; i < n/2; i++)
    {
        int temp;
        temp = a[i];
        a[i] = a[n-i-1]; // reverse formula
        a[n-i-1] = temp;
    /*
    n/2 <== because if we take n then code reverse 2 times 
    a[0] = a[9], a[1] = a[8], a[2] = a[7], a[3] = a[6], a[4] = a[5]
    a[5] = a[4], a[6] = a[3], a[7] = a[2], a[8] = a[1], a[9] = a[0]
    so the values back to normal position

    if we take n/2 then code reverse only one time
    a[0] = a[9], a[1] = a[8], a[2] = a[7], a[3] = a[6], a[4] = a[5]
    so the values can't back to normal position

    a[i] = a[n-i-1] 
    a[0] = a[10-0-1] = a[9]
    a[1] = a[10-1-1] = a[8]
    a[2] = a[10-2-1] = a[7]
    a[3] = a[10-3-1] = a[6]
    a[4] = a[10-4-1] = a[5]
    a[5] = a[10-5-1] = a[4]
    a[6] = a[10-6-1] = a[3]
    a[7] = a[10-7-1] = a[2]
    a[8] = a[10-8-1] = a[1]
    a[9] = a[10-9-1] = a[0]
    */

    }
}