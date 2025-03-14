// 24. Write a program using recursion to calculate the nth element of the Fibonacci series.

#include<stdio.h>
int fibbo(int n)
{
    if (n == 0)
    {
        return 0;
    }
    else if (n == 1)
    {
        return 1;
    }
    else
    {
        return n = fibbo(n - 1) + fibbo(n - 2);
    }
        
}

int main()
{
    int a, n;
    printf("Enter the no.: ");
    scanf("%d", &n);
    if (n < 0)
    {
        printf("Not Possible");
    }
    else
    {
        a = fibbo(n);
        printf("The %dth element of the Fibonacci series is %d", n, a);
    }
    return 0;
}