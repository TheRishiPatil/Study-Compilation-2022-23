// 5.	What will the following line produce in a C program: printf(“%d %d %d\n”,a,++a,a++);

#include<stdio.h>

int main()
{
    int a = 3;
    printf("%d %d %d", a, ++a, a++);
    return 0;
}

// Compiler taking argument from right to left a, ++a, a++ ==> a < ++a < a++
// Different behaviour of different compilers
// Need to know the orders of compiler