// 2.	Write a program to take a string as an input from the user using %c and %s. Confirm that the strings are equal.

#include <stdio.h>
#include <string.h>

int main()
{
    char a[50];
    char b[50];
    char c;
    int i = 0;

    printf("Enter the value of 1st string: ");
    scanf("%s", a);
    printf("Enter the value of 2nd string: ");
    
    while (c != '\n')
    {
        fflush(stdin);
        scanf("%c", &c);
        b[i] = c;
        i++;
    }
    b[i-1] = '\0';
    
    printf("\n\n");
    
    printf("The value of 1st string is: %s\n", a);
    printf("The value of 2nd string is: %s\n", b);
    printf("strcmp for these strings returs %d", strcmp(a, b));

    return 0;
}