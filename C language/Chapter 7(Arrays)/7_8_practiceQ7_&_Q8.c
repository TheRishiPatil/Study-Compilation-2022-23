// 7. Create an array of size 3x10 containing multiplication tables of the numbers 2,7 and 9, respectively.
// 8. Repeat problem 7 for a custom input given by the user.

#include<stdio.h>
void printTable(int *table, int num, int n)
{
    printf("The Multiplication Table of %d is: \n", num);
    for (int i = 0; i < n; i++)
    {
        table[i] = num * (i+1);
    }
    
    for (int i = 0; i < n; i++)
    {
        printf("%d X %d = %d\n", num, i+1, table[i]);
    }
    printf("\n\n");
}

int main()
{
    int num[3];
    int table[3][10];
    printf("Enter the no.: ");
    scanf("%d", &num[0]);

    printf("Enter the no.: ");
    scanf("%d", &num[1]);
    
    printf("Enter the no.: ");
    scanf("%d", &num[2]);
    
    printf("\n");
    
    printTable(table[0], num[0], 10);
    printTable(table[1], num[1], 10);
    printTable(table[2], num[2], 10);
    return 0;
}