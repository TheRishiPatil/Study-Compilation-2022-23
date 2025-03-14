// 4. Write a program to calculate simple interest for a set of values representing principle, no of years, and rate of interest.

#include<stdio.h>

int main()
{
    float principle, rate, time;

    printf("Enter the values of ");
    printf("Principle: ");
    scanf("%f", &principle);
    printf("rate: ");
    scanf("%f", &rate);
    printf("time in years: ");
    scanf("%f", &time);

    float interest = (principle * rate * time)/100;
    printf("The simple interest is %.2f", interest);

    return 0;
}