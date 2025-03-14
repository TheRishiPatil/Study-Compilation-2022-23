// 21. Write a program using functions to find the average of three numbers.

#include<stdio.h>
float avg(int a, int b, int c)
{
    float result;
    result = (float)(a + b + c)/3;
    return result;
}

int main()
{
    int a, b, c;
    printf("Enter the values:- ");
    scanf("%d %d %d", &a, &b, &c);
    printf("The average of %d, %d and %d is: %.2f", a, b, c, avg(a, b, c));
    return 0;
}