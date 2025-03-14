// 5 & 6. Write a program to sum the first ten natural numbers using while, do-while and for loop.

#include<stdio.h>

int main()
{
    int i=1, sum=0, n;
    scanf("%d", &n);

    while (i <= n)
    {
        sum += i;
        i++;
    }

    printf("The value of sum(1 to %d) is %d", n, sum);
    
    return 0;
}

/*==========================================================*/

#include<stdio.h>

int main()
{
    int i, sum = 0, n;
    scanf("%d", &n);

    for ( i = 0; i <= n; i++)
    {
        sum += i;
    }
    printf("The value of sum(1 to %d) is %d", n, sum);
    
    return 0;
}

/*==========================================================*/

#include<stdio.h>

int main()
{
    int i=1, sum=0, n;
    scanf("%d", &n);
    
    do
    {
        sum += i;
        i++;
    } while (i<=n);
    
    printf("The value of sum(1 to %d) is %d", n, sum);

    return 0;
}