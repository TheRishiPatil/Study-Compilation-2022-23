#include<stdio.h>

int main()
{
    int a;
    printf("Enter the no. : ");
    scanf("%d", &a);
    
    do
    {
    printf("The value of a is %d \n", a);
    a++;
    } while (a < 10);
    
    return 0;
}

// Do-while -> executes the code & then checks the condition
// **do-while loop = while loop which executes at least once
