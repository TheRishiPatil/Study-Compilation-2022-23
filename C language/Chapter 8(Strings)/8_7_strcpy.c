#include<stdio.h>
#include<string.h>

int main()
{
    char *a = "Rishi";
    char a2[50];
    strcpy(a2, a);
    printf("Now the a2 is %s", a2);
    return 0;
}