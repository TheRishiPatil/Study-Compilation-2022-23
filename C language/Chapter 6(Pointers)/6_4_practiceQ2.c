// 2. Write a program having a variable i. Print the address of i. Pass this variable to a function and print its address. Are these addresses same? Why?

#include<stdio.h>
void pass(int a)
{
    printf("The address of variable a is %u \n", &a);
}

int main()
{
    int i = 4;
    pass(i);
    printf("The address of variable i is %u \n", &i);
    return 0;
}

// both variables have different addresses. because function take copy of variable. so copy also have diiferent address