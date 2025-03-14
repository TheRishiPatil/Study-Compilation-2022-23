#include<stdio.h>

int main()
{
    int a;
    printf("Enter the value of a ", a);
    scanf("%d", &a);
    
    for(a; a<10; a++)
    {
        printf("The value of a is %d \n", a+1);
    }
    return 0;
}