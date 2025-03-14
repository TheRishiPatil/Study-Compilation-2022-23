#include<stdio.h>

int main()
{
    int num;
    printf("Enter the number \n");
    scanf("%d", &num);

    if (num == 1)
    {
        printf("number is 1\n");
    } else if (num == 2)
    {
       printf("number is 2\n");
    } else if (num == 3)
    {
        printf("number is 3\n");
    } else
    {
        printf("the number is not 1, 2 or 3\n");
    }
    return 0;
}


// Priority	Operator
// 1st  	  !
// 2nd	     *,/,%
// 3rd	      +,-
// 4th	    <>,<=,>=
// 5th	      ==,!=
// 6th	       &&
// 7th	       ||
// 8th	       =