#include<stdio.h>
int factorial(int x);

int main()
{
    int x;
    printf("Enter the value = ");
    scanf("%d", &x);
    printf("The factorial of %d is %d", x, factorial(x));
    return 0;
}

int factorial(int x)
{
    if (x == 1 || x == 0)
    {
        return 1;
    }
    else
    {
        return x * factorial(x-1);
    }
    
}