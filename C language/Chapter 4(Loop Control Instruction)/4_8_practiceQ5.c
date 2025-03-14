// 8. Write a program to calculate the factorial of a given number using for loop.

#include<stdio.h>

int main()
{
    int i, n, factorial=1;
    scanf("%d", &n);
    for(i=1; i<=n; i++)
    {
        factorial *= i;
    }
    printf("The factorial %d is %d", n, factorial);
    return 0;
}

// factorial(4) = 1*2*3*4
// factorial(8) = 1*2*3*4*5*6*7*8