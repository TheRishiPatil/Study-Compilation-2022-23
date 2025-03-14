// 2. Write a program to print a multiplication table of 10 in reversed order

#include <stdio.h>
int main()
{
    int b, c = 1, a;

    b = 10;

    printf("Enter the number: ");
    scanf("%d", &a);

    for (b; b >= c; b--)
    {
        printf("%d X %d = %d \n", a, b, a * b);
    }
    return 0;
}