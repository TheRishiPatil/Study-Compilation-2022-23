// 5. Write a program to print the value of a variable i by using the "pointer to pointer" type of variable.

#include<stdio.h>

int main()
{
    int i = 100;
    int *j = &i;
    int **k = &j;
    printf("The value of i is %d", **k);
    return 0;
}