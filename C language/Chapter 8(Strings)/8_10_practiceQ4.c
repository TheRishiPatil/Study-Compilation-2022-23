#include<stdio.h>
void slice(char *a, int m, int n)
{
    int i = 0;
    while((m+i)<n)
    {
        a[i] = a[i+m];
        i++;
    }
    a[i] = '\0';
}

int main()
{
    char a[] = "Rishikesh";
    slice(a, 1, 5);
    printf("%s", a);
    return 0;
}