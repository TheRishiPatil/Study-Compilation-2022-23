/* 8. Calculate income tax paid by an employee to the government as per the slabs mentioned below:
Income Slab	Tax
2.5L-5.0L	5%
5.0L-10.0L	20%
Above 10.0L	30%
Note that there is no tax below 2.5L. Take income amount as an input from the user. */

#include <stdio.h>

int main()
{
    float income, tax = 0;
    printf("Enter the Net Income: ");
    scanf("%f", &income);

    if (income <= 500000 && income >= 250000)
    {
        tax += 0.05 * (income - 250000);
    }
    else if (income <= 1000000 && income >= 500000)
    {
        tax += 0.20 * (income - 500000);
    }
    else if (income >= 1000000)
    {
        tax += 0.30 * (income - 1000000);
    }
    printf("Tax on your Net income is: %.2f", tax);
    return 0;
}