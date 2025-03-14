// 6. Write a recursive function to calculate the sum of first n natural numbers.

#include<stdio.h>
int sum(int n);

int main()
{
    int num;
    printf("Enter the No.: ");
    scanf("%d", &num);
    printf("The sum of first %dth natural numbers is %d", num, sum(num));
    return 0;
}
int sum(int n)
{
    if(n != 0)
    {
        return n + sum(n-1);
    }
    else
    {
        return n; 
    }
}