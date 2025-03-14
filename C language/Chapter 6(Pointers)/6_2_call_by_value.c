#include<stdio.h>
int sum(int a, int b);

int main()
{
    int x=3, y=4;
    printf("The value of x and y before function call is %d and %d \n", x, y);
    printf("The value of 3 + 4 is %d \n", sum(x, y) );
    printf("The value of x and y after function call is %d and %d \n", x, y);

    return 0;
}
int sum(int a, int b)
{
    int c;
    c = a+b;
    a = 100, b = 50;
    return c;
}

/* Call by value -> sending the values of arguments.
If sum is defined as sum(int a, int b), the values 3 and 4 are copied to a and b. Now even if we change a and b, nothing happens to the variables x and y.
*/