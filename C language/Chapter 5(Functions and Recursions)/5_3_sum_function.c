#include<stdio.h>
int sum(int a, int b); // sum is a function which takes a and b as input and returns an integer as an output

int main()
{
    int a, b, c;
    c = sum(a, b); // function call
    printf("The value of c is %d", c);
    return 0;
}
int sum(int a, int b)
{
    int result;
    printf("Enter the vaue of a = ");
    scanf("%d", &a);
    printf("Enter the vaue of b = ");
    scanf("%d", &b);
    result = a + b;
    return result;
}
