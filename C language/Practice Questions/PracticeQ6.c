// 6. Explain step by step evaluation of 3*x/y-z +k. Where x=2, y=3, z=3 and k=1


#include<stdio.h>

int main()
{
    int x=2, y=3, z=3, k=1, A;
    A = 3 * x / y - z + k;
    /*
    A = 3 * 2 / 3 - 3 + 1
    A = 6 / 3 - 3 + 1
    A = 2 - 3 + 1
    A = 2 - 2
    A = 0
    */
    printf("The value of A is: %d", A);
    return 0;
}