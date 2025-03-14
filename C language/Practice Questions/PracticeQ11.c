// 11. Write a program to find the greatest of four numbers entered by the user.

#include <stdio.h>

int main()
{
    int n1, n2, n3, n4;
    printf("Please enter No.: \n");
    printf("No. 1: ");
    scanf("%d", &n1);
    printf("No. 2: ");
    scanf("%d", &n2);
    printf("No. 3: ");
    scanf("%d", &n3);
    printf("No. 4: ");
    scanf("%d", &n4);

    if (n1 > n2 && n1 > n3 && n1 > n4)
    {
        printf("%d is the greatest of four no.", n1);
    }
    else if (n2 > n1 && n2 > n3 && n2 > n4)
    {
        printf("%d is the greatest of four no.", n2);
    }
    else if (n3 > n1 && n3 > n2 && n3 > n4)
    {
        printf("%d is the greatest of four no.", n3);
    }
    else if (n4 > n1 && n4 > n2 && n4 > n3)
    {
        printf("%d is the greatest of four no.", n4);
    }

    return 0;
}