// 16. Write a program to calculate the sum of the numbers occurring in the multiplication table of n.(Consider 8x1 to 8x10)

#include<stdio.h>

int main()
{
    int a, b=1, sum=0;
    printf("Enter the No.: ");
    scanf("%d", &a);

    for (a; b <= 10; b++)
    {
        sum += a*b;
    }
    printf("The sum of multiplication table of %d is: %d", a, sum);
    return 0;
}