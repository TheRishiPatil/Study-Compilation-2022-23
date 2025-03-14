// 4. Repeat problem 3 for a general input provided by the user using scanf()

#include<stdio.h>

int main()
{
    int a[10];
    int n;
    printf("Enter the multiplication no.: ");
    scanf("%d", &n);
    for(int i=0; i<10; i++)
    {
        a[i] = n * (i+1);
        printf("%d X %d = %d\n", n, i+1, a[i]);
    }
    return 0;
}