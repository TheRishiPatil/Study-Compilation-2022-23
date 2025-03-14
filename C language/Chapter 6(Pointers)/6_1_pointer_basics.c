#include<stdio.h>

int main()
{
    int i =50;
    int *j =&i; // j will now store the address of i
    printf("The value of i is %d \n", i); // value of i ==> 50
    printf("The value of i is %d \n", *j); // value of *j i.e. value of i ==> 50
    printf("The address of i is %u \n", &i); // address of i ==> based on compiler
    printf("The value of j is %u \n", j); // value of j i.e address of i ==> based on compiler
    printf("The address of i is %d \n", &j); // address of j ==> based on compiler
    printf("The value of j is %d \n", *(&j) ); // value of j i.e address of i ==> based on compiler
    return 0;
}