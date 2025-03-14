#include<stdio.h>
void Array(int ptr[], int n)
{
    for (int i = 0; i < n; i++)
    {
        printf("Thr value of element %d is %d \n", i+1, ptr[i]);
    }
    ptr[2] = 5555; // this value will be changes in arr Array of main as well
}

int main()
{
    int arr[] = {10,20,30,40,50,60,70,80,90,100};
    Array(arr, 10);
    printf("%d", arr[2]);
    return 0;
}