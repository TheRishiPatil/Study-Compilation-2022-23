// 3. Write a program to change the value of a variable to ten times its current value. Write a function and pass the value by reference.

#include<stdio.h>
void value(int *a)
{
    (*a) *= 10;
}

int main()
{
    int i = 10;
    int *a = &i;
    printf("The value of i before change is %d\n", i);
    value(a);
    printf("The value of i after change is %d\n", i);
    return 0;
}

// *a value of a *= 10
// *a = &i value of a is equal to address of i
// &i *= 10
// i = 10 * i
// i = 100