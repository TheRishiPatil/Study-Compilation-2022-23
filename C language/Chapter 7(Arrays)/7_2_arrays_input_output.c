// Write a program to accept marks of five students in an array and print them to the screen.

#include<stdio.h>

int main()
{
    int marks[5];

    for (int i = 0; i < 5; i++)
    {
        printf("Enter the marks of student %d : ", i+1);
        scanf("%d", &marks[i]);
    }
    for (int i = 0; i < 5; i++)
    {
        printf("The marks of Student %d is %d \n", i+1, marks[i]);
    }
    return 0;
}