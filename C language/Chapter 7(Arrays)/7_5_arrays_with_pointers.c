#include<stdio.h>

int main()
{
    int marks[5];
    int *ptr;
    // ptr = &marks[0];
    ptr = marks;
    for (int i = 0; i < 5; i++)
    {
        printf("Enter the marks of student %d: ", i+1);
        scanf("%d", ptr);
        ptr++; // address change after entering marks. Eg.:- marks[0] address is 1234 then after taking input, address change by increasing 4 i.e marks[1] is 1238. marks[2] is 1242
    }
    for (int i = 0; i < 5; i++)
    {
        printf("The marks of %dth student is %d \n", i+1, marks[i]);
    }
    return 0;
}