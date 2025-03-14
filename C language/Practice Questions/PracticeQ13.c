// 13. Write a program to print a multiplication table of 10 in reversed order

#include <stdio.h>

int main()
{
    int a, b;
    b = 10;
    printf("Enter the No.: ");
    scanf("%d", &a);

    for (a; b >= 1; b--)
    {
        printf("%d X %d: %d \n", a, b, a * b);
    }
    return 0;
}