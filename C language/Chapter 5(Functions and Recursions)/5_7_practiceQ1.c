// 1. Write a program using functions to find the average of three numbers.

#include<stdio.h>
float average(int a, int b, int c);

int main()
{
    int a, b, c;
    printf("Please enter the value of a = ");
    scanf("%d", &a);
    printf("Please enter the value of b = ");
    scanf("%d", &b);
    printf("Please enter the value of c = ");
    scanf("%d", &c);
    printf("The average of a, b and c is %f", average(a, b, c));
    return 0;
}

float average(int a, int b, int c)
{
    float result;
    result = (float)(a + b + c)/3;
    return result;
}