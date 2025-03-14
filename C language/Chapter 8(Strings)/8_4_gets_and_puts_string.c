#include<stdio.h>

int main()
{
    char a[50];
    printf("Enter the name ");
    gets(a); // scanf("%s", a);
    puts(a); // printf("your name is %s", a);
    return 0;
}