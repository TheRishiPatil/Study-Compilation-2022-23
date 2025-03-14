// 12. Write a program to print the multiplication table of a given number n.

#include <stdio.h>

int main()
{
    int a, b;
    b=1;
    printf("Enetr The No.: ");
    scanf("%d", &a);

    for (a; b <= 10 ; b++)
    {
        printf("%d X %d: %d \n", a, b, a*b);
    }
    return 0;
}