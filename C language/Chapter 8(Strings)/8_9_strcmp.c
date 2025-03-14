#include<stdio.h>
#include<string.h>

int main()
{
    char a1[50] = "abc";
    char *a2 = "def";
    int a = strcmp(a1, a2);
    printf("Now the a is %d", a);
    return 0;
}