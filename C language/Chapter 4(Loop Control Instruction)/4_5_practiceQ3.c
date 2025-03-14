// Write a program to print first n natural numbers using for loop.

#include<stdio.h>

int main()
{
    int a;
    printf("Enter the no ", a);
    scanf("%d", &a);

    for (a; a<10; a++)
    {
    printf("The no. is %d \n", a+1);
    }
    
    return 0;
}