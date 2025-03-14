#include<stdio.h>
#include<string.h>

int main()
{
    char a1[50] = "Rishi ";
    char *a2 = "Patil";
    strcat(a1, a2);
    printf("Now the a1 is %s", a1);
    return 0;
}