// 3.	Write a function to calculate the force of attraction on a body of mass m exerted by earth. (g=9.8m/S2)

#include<stdio.h>
float force(float mass);

int main()
{
    float m;
    printf("The force of attraction on a body of mass is %.2f", force(m));
    return 0;
}

float force(float mass)
{
    float force;
    printf("Enter the mass no.: ");
    scanf("%f", &mass);
    force = mass * 9.8;
    return force;
}
