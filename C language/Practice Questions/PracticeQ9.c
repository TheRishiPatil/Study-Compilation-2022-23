// 9. Write a program to find whether a year entered by the user is a leap year or not. Take the year as input from the user.

#include<stdio.h>

int main()
{
    int year;
    printf("Enter the Year: ");
    scanf("%d", &year);
    if (year % 4 == 0)
    {
        printf("The year is a leap year");
    }
    else if (year % 100 == 0)
    {
        printf("The year is not a leap year");
    }
    else if (year % 400 == 0)
    {
        printf("The year is a leap year");
    }
    else
    {
        printf("The year is not a leap year");
    }
    return 0;
}