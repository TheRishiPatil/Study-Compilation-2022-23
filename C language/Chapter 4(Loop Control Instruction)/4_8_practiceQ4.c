// 7. Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.(Consider 8x1 to 8x10)

#include<stdio.h>

int main()
{
    int i, sum=0, n=8;
    for ( i = 0; i <= 9; i++)
    {
        sum += 8*i;
    }
    printf("%d X %d = %d", n, i, sum);

    return 0;
}