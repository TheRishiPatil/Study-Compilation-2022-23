// 17 & 18. Write a program to calculate the factorial of a given number using for loop, while loop and do while loop.

#include<stdio.h>

int main()
{
    int a, b=1, factorial=1;
    printf("Enter the No.: ");
    scanf("%d", &a);

    for (a; b <= a; b++)
    {
        factorial *= b;
    }
    printf("THe factorial of %d is: %d", a, factorial);
    
    return 0;
}

// ********************************************************** //

#include<stdio.h>

int main()
{
    int a, b=1, factorial=1;
    printf("Enter the No.: ");
    scanf("%d", &a);

    while (b <= a)
    {
        factorial *= b;
        b++;
    }
    printf("THe factorial of %d is: %d", a, factorial);
    return 0;
}

// ********************************************************** //

#include<stdio.h>

int main()
{
    int a, b=1, factorial=1;
    printf("Enter the No.: ");
    scanf("%d", &a);
    do
    {
        factorial *= b;
        b++;
    } while (b <= a);
    printf("THe factorial of %d is: %d", a, factorial);
    return 0;
}