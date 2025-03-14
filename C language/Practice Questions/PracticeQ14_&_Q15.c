// 14. Write a program to sum the first n natural numbers using a while loop.
// 15. Write a program to implement program 16 using for and do-while loop. 

#include <stdio.h>

int main()
{
    int i = 1, n, sum = 0;
    printf("Enter the No.: ");
    scanf("%d", &n);

    while (i <= n)
    {
        sum += i;
        i++;
    }
    printf("Sum of 1 to %d is: %d", n, sum);
    return 0;
}

// ********************************************************** //

#include <stdio.h>

int main()
{
    int i = 1, n, sum = 0;
    printf("Enter the No.: ");
    scanf("%d", &n);

    do
    {
        sum += i;
        i++;
    } while (i <= n);

    printf("Sum of 1 to %d is: %d", n, sum);
    return 0;
}

// ********************************************************** //

#include <stdio.h>

int main()
{
    int n, i = 1, sum = 0;
    printf("Enter the No.: ");
    scanf("%d", &n);

    for (i; i <= n; i++)
    {
        sum += i;
    }

    printf("Sum of 1 to %d is: %d", n, sum);
    return 0;
}