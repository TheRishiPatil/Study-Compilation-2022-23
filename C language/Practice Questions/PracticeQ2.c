// 2. Calculate the area of a circle and modify the same program to calculate the volume of a cylinder given its radius and height.

#include<stdio.h>

int main()
{
    float radius, height, area, volume, pi = 3.14;

    printf("Enter the radius of circle: ");
    scanf("%f", &radius);

    area = pi * radius * radius;
    printf("The area of a circle is %.2f \n", area);

    printf("Enter the height of cylinder: ");
    scanf("%f", &height);
    
    volume = (float) pi * area * height;
    printf("The volume of a cylinder is %.2f \n", volume);

    return 0;
}