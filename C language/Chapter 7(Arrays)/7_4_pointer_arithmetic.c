#include<stdio.h>

int main()
{
    int i = 10;
    int *j = &i;
    printf("The value of j in integer: %u\n", j);
    j++;
    printf("The value of j++ in integer: %u\n", j);
    j = j + 1;
    printf("The value of j+1 in integer: %u\n", j);
    j--;
    printf("The value of j-- in integer: %u\n", j);
    j = j - 1;
    printf("The value of j-1 in integer: %u\n", j);

    // In my laptop architecture integer(int) take 4 bytes of memory

/********************************************/

    printf("\n");

/********************************************/

    float a = 10.5;
    float *b = &a;
    printf("The value of b in float: %u\n", b);
    b++;
    printf("The value of b++ in float: %u\n", b);
    b = b + 1;
    printf("The value of b+1 in float: %u\n", b);
    b--;
    printf("The value of b-- in float: %u\n", b);
    b = b - 1;
    printf("The value of b-1 in float: %u\n", b);

    // In my laptop architecture float take 4 bytes of memory

/********************************************/

    printf("\n");

/********************************************/

    char c = 'A';
    char *d = &c;
    printf("The value of d in char: %u\n", d);
    d++;
    printf("The value of d++ in char: %u\n", d);
    d = d + 1;
    printf("The value of d+1 in char: %u\n", d);
    d--;
    printf("The value of d-- in char: %u\n", d);
    d = d - 1;
    printf("The value of d-1 in char: %u\n", d);

    // In my laptop architecture character(char) take 1 bytes of memory
    
/********************************************/

    printf("\n");

/********************************************/


    return 0;
}