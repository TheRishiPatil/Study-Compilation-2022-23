// 1. Write a program to print the address of a variable. Use this address to get the value of this variable.

#include<stdio.h>

int main()
{
    int a = 4;
    int *b = &a;
    printf("The value of a is %d \n", a);
    printf("The address of a is %u \n", b);
    printf("The value of a is %d \n", *b);
    return 0;
}