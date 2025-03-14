// 6.	Write a program to find the greatest of four numbers entered by the user.

#include<stdio.h>

int main()
{
    int num1, num2, num3, num4;
    printf("Enter the numbers : ");
    scanf("%d", &num1);
    scanf("%d", &num2);
    scanf("%d", &num3);
    scanf("%d", &num4);
         if (num1 > num2 && num1 > num3 && num1 > num4)
    {
        printf("%d is greatest no.", num1);
    }
     else if(num2 > num1 && num2 > num3 && num2 > num4)
     {
        printf("%d is greatest no.", num2);
    }
     else if(num3 > num1 && num3 > num2 && num3 > num4)
     {
        printf("%d is greatest no.", num3);
    }
     else if(num4 > num1 && num4 > num2 && num4 > num3)
     {
        printf("%d is greatest no.", num4);
    }


    return 0;
}