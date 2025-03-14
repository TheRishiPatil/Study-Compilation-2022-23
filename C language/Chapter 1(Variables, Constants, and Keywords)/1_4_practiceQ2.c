// Q2. Calculate the area of a circle and modify the same program to calculate the volume of a cylinder given its radius and height

#include <stdio.h>

int main()
{
    float radius;
    float pi;
    printf("Enter the value Of Radius of Circle\n");
    scanf("%f", &radius);

    printf("Enter the value Of pi of Circle\n");
    scanf("%f", &pi);

    printf("sum of circle %f \n", pi * radius * radius);

    float height;
    printf("Enter the value Of Height of Cylinder\n");
    scanf("%f", &height);

    printf("volume of cylinder is %f", pi * radius * radius * height);

    return 0;
}