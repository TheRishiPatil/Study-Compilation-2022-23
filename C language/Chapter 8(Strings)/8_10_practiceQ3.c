// 3. Write your own version of strlen function from <string.h>

#include <stdio.h>
int strlen(char *a)
{
    char *ptr = a;
    int len = 0;
    while (*ptr != '\0')
    {
        len++;
        ptr++;
    }
    return len;
}

int main()
{
    char a[] = "Rishikesh";
    int b = strlen(a);
    printf("The lenght of string is %d", b);
    return 0;
}