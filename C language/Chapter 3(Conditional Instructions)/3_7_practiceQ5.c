// 5.	Write a program to determine whether a character entered by the user is lowercase or not.
// 97-122 = a-z ==> ascii values

#include<stdio.h>

int main()
{
    char ch;
    printf("Enter the character");
    scanf("%c", &ch);
    if (ch >= 97 && ch<= 122)
    {
        printf("it is lowercase");
    }
    else
    {
        printf("it is not lowercase");
    }
    
    return 0;
}