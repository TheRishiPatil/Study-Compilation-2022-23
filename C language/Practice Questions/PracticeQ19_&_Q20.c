// 19 & 20. Write a program to check whether a given number is prime or not using loops.

#include <stdio.h>

int main()
{
    int a, b = 2, c = 0;
    printf("Enter the No.: ");
    scanf("%d", &a);

    for (b; b < a; b++)
    {
        if (a % b == 0)
        {
            c = 1;
            break;
        }
    }

    if (c == 1)
    {
        printf("%d is not a prime no.", a);
    }
    else
    {
        printf("%d is a prime no.", a);
    }

    return 0;
}

// ********************************************************** //

#include <stdio.h>

int main()
{
    int a, b = 2, c = 0;
    printf("Enter the No.: ");
    scanf("%d", &a);

    while (b < a)
    {
        if (a % b == 0)
        {
            c = 1;
            break;
        }
        b++;
    }
    if (c == 1)
    {
        printf("%d is not a prime no.", a);
    }
    else
    {
        printf("%d is a prime no.", a);
    }

    return 0;
}

// ********************************************************** //

#include <stdio.h>

int main()
{
    int a, b = 2, c = 0;
    printf("Enter the No.: ");
    scanf("%d", &a);

    do
    {
        if (a % b == 0 && a != 2) // because do-while loop executes atleast once
        {
            c = 1;
            break;
        }
        b++;
    } while (b < a);
    if (c == 1)
    {
        printf("%d is not a prime no.", a);
    }
    else
    {
        printf("%d is a prime no.", a);
    }

    return 0;
}