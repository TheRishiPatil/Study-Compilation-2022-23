#include<stdio.h>

int main()
{
    char *a = "Rishi Patil"; // <== value change
    char a[] = "Rishi Patil"; // <== value not change
    a = "Krishna Patil";
    puts(a);
    return 0;
}