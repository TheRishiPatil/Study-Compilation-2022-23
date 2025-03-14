// 6. Write a program containing functions that counts the number of positive integers in an array.

#include<stdio.h>

int main()
{
    int i, size, a[10];
    int positive = 0, negative = 0;


    printf("Enter the size of No.: ");
    scanf("%d", &size);

    printf("Enter the No.: ");
    for ( i = 0; i < size; i++)
    {
        scanf("%d", &a[i]);
    }
    

    for (i = 0; i < size; i++)
    {
    if (a[i] >= 0)
    {
        positive++;
    }
    else
    {
        negative++;
    }
}

    printf("Total positive no. is: %d\n", positive);
    printf("Total negative no. is: %d\n", negative);
    
    return 0;
}