// 23. Write a function to calculate the force of attraction on a body of mass m exerted by earth. (g=9.8m/S2)

#include<stdio.h>
float force(int m)
{
    float force;
    force = m * 9.8;
    return force;
}
int main()
{
    int mass;
    printf("Enter the mass: ");
    scanf("%d", &mass);
    printf("The force of attraction on a body of mass is: %.2f", force(mass));
    return 0;
}