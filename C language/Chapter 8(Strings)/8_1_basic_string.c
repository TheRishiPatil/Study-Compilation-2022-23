// Create a string using " " and print its content using a loop.

#include<stdio.h>

int main()
{
    // char str[] = {'R', 'i', 's', 'h', 'i', '\0'};
    char str[] = "Rishi Krishna Patil.";
    char *a = str;
    while (*a != '\0')
    {
        printf("%c", *a);
        *a++;
    }
    
    return 0;
}