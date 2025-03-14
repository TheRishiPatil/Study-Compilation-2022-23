// 6. Try problem 3 using call by value and verify that it doesn’t change the value of the said variable.

#include<stdio.h>
int value(int j)
{
    j *= 10;
    printf("The value of j is %d \n", j);
}
int main()
{
    int i = 10;
    printf("The value of i before change is %d \n", i);
    value(i);
    printf("The value of i after change is %d \n", i);

    return 0;
}

// it doesn’t change the value of the variable. because it change variable in copy not in main