// 3. Write a program to create an array of 10 integers and store a multiplication table of 5 in it.

#include<stdio.h>

int main()
{
    int a[10];
    for (int i = 0; i < 10; i++)
    {
        a[i] = 5 * (i + 1);
        printf("5 X %d = %d\n", i+1, a[i]);
    }
    
    return 0;
}