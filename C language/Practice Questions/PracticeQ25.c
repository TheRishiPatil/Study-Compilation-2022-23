// 25. Write a recursive function to calculate the sum of first n natural numbers.

#include<stdio.h>
int sum(int a)
{
    if (a != 0)
    {
        return a + sum(a-1);
    }
    else
    {return a;}
}

int main()
{
    int a;
    printf("Enter the no.: ");
    scanf("%d", &a);
    printf("The sum of first %dth natural numbers is: %d", a, sum(a));
    return 0;
}