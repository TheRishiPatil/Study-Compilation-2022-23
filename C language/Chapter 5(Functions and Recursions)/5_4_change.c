#include<stdio.h>
void change(int b);

int main()
{
    int b = 100;
    printf("The value of b before change is = %d\n", b);
    change(b);
    printf("The value of b after change is = %d\n", b);
    return 0;
}

void change(int b)
{
    b = 50;
    printf("The value of b is = %d\n", b);
}