// 1. Write a c program to calculate the area of a rectangle:
// a) using hardcoded inputs &
// b) using inputs supplied by the user

#include <stdio.h>

int main()
{
    int height, breadth, Area;

    printf("Enter the height of rectangle: ");
    scanf("%d", &height);
    printf("Enter the breadth of rectangle: ");
    scanf("%d", &breadth);

    Area = height * breadth;
    printf("The Area of rectangle is %d", Area);
    
    return 0;
}