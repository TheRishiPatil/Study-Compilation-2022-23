// c program to check whether the no. is odd or even

#include<stdio.h>

int main()
{
    int num;
    printf("please enter the no. \n");
    scanf("%d", &num);

    if(num%2 == 0)
    {
        printf("%d is even no.\n", num);
    }
    else
    {
        printf("%d is odd no.", num);
    }
    return 0;
}