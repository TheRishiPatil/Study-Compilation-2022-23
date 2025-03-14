// Q1. Write a c program to calculate the area of a rectangle:

// a) using hardcoded inputs & 

// b) using inputs supplied by the user


#include<stdio.h>

int main()
{
    int length, breadth;
    printf("Length of rectangle is \n" );
    scanf("%d", &length);

    printf("Breadth of rectangle is \n");
    scanf("%d", &breadth);

    printf("Sum of rectangle %d", length * breadth);

    return 0;
}