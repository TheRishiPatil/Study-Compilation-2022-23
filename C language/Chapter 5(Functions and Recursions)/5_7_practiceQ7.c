#include<stdio.h>
void printpattern(int n)
{
    if (n==1)
    {
        printf("*\n");
        return n;
    }
    printpattern(n-1);
    for (int i = 0; i < (2*n-1); i++)
    {
        printf("*");
    }
    printf("\n");
}

int main()
{
    int n;
    printf("Enter the No.: ");
    scanf("%d", &n);
    printpattern(n);
    return 0;
}
