// 3.	Calculate income tax paid by an employee to the government as per the slabs mentioned below:
// Income Slab	Tax
// 2.5L-5.0L	5%
// 5.0L-10.0L	20%
// Above 10.0L	30%
// Note that there is no tax below 2.5L. Take income amount as an input from the user.

#include<stdio.h>

int main()
{
    float tax = 0, income;
    printf("Enter your income : ");
    scanf("%f", &income);
    
    if (income >= 250000 && income <= 500000)
    {
       tax = tax + 0.5 * (income - 250000);
    }
     
     if (income >= 500000 && income <= 1000000)
    {
       tax = tax + 0.20 * (income - 500000);
    }
     
     if (income >= 1000000)
    {
       tax = tax + 0.30 * (income - 1000000);
    }
    printf("your income tax is %f\n", tax);
    
    return 0;
}