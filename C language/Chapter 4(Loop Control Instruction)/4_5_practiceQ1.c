// Write a program to print natural numbers from 10 to 20 when the initial loop counter i is initialized to 0.
#include<stdio.h>

int main()
{
    int i;
    printf("Enter the no. : ");
    scanf("%d", &i);

    while(i <= 20)
    {
        if(i >= 10)
        {
            printf("%d \n", i);
        }
        i++;
    }
    return 0;
}