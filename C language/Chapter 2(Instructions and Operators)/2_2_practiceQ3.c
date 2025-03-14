//Q3. Write a program to check whether a number is divisible  97 or not.

#include<stdio.h>

int main()
{
    int num;
    printf("Enter the No.\n");
    scanf("%d", &num);
    printf("divisibility no. returns %d", num%97);
    return 0;
}