// 5. Write a program to check whether a number is divisible  97 or not.

#include<stdio.h>

int main()
{
    int num;
    printf("Enter the number: ");
    scanf("%d", &num);
    if (num % 97 == 0)
    {
        printf("Number is divisible  97");
    }
    else
    {
        printf("Number is not divisible  97");
    }
    return 0;
}