#include<stdio.h>

int main()
{
    int a;
    printf("Enter the no. : ");
    scanf("%d", &a);

    while (a < 10)
    // while(a > 10)  ==> infinite loop

    {
       printf("%d \n", a);
       a++;
    }
    
    return 0;
}

// While -> checks the condition & then executes the code