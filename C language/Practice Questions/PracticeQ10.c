// 10. Write a program to determine whether a character entered by the user is lowercase or not.

#include<stdio.h>

int main()
{
    char a;
    printf("Enter the Character: ");
    scanf("%c", &a);
    if(a >= 97 && a <= 122)
    {
        printf("The character is lowercase");
    }
    else
    {
        printf("The character is not lowercase");
    }
    return 0;
}