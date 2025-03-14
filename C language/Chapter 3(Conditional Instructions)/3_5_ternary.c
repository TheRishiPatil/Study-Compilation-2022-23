#include<stdio.h>

int main()
{
    int a;
    printf("Enter the number \n");
    scanf("%d", &a);

    (a < 10) ? printf("10 is greater than %d", a) : printf("10 is less than %d", a);
    return 0;
}
