// 10 & 11. Write a program to check whether a given number is prime or not using loops.

#include <stdio.h>

int main()
{
    int n, i = 2, count = 0;
    printf("Enter the number = ");
    scanf("%d", &n);
    for (i; i < n; i++)
    {
        if (n%i==0)
        {
            count = 1;
            break;
        }
    }
    if (count == 1)
    {
        printf("%d is not a prime number.",n);
    }
    else
    {
        printf("%d is a prime number.",n);
    }
    return 0;
}

/*==========================================================*/

#include <stdio.h>
int main()
{
   int n, i = 2, count = 0;
 
    printf("Enter number = ");
    scanf("%d", &n);
    while( i < n)
    {
        if(n % i == 0)
        {
            count = 1;
            break;
        }
        i++;
    }
    if (count == 1)
    {
        printf("%d is not a prime number.",n);
    }
    else
    {
        printf("%d is a prime number.",n);
    }
    return 0;
}

/*==========================================================*/

#include<stdio.h>

int main()
{
    int n, i = 2, count = 0;
 
    printf("Enter number = ");
    scanf("%d", &n);

    do
    {
        if (n % i == 0 && n != 2)
        {
            count = 1;
        }
    } while (i<=n);
    if (count == 1)
    {
        printf("%d is not a prime number.",n);
    }
    else
    {
        printf("%d is a prime number.",n);
    }  
    
    return 0;
}