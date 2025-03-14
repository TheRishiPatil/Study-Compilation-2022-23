// 1. Write a program to print the multiplication table of a given number.

#include <stdio.h>

int main()
{
    int a, b, c;

    b = 1;

    printf("Enter the number : ");
    scanf("%d", &c);

    for (a = c; a <= (c * 10); a += c)
    {
        printf("%d x %d = %d\n", c, b, a);
        b++;
    }

    return 0;
}