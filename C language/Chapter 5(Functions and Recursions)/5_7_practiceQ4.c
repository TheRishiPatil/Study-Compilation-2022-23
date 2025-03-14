// 4. Write a program using recursion to calculate the nth element of the Fibonacci series.

#include<stdio.h>
int fibo(int num)
{
    if(num == 0)
    {
        return 0;
    }
    else if(num == 1)
    {
        return 1;
    }
    else
    {
        return num = fibo(num - 1) + fibo (num - 2);
    }
}

int main()
{
    int result, num;
    printf("Enter the number: ");
    scanf("%d", &num);
    if (num < 0)
    {
    printf("Not Possible");
    }
    else
    {
        result = fibo(num);
        printf("The %dth element of the Fibonacci series is %d", num, result);
    }
    return 0;
}