// 1.	What will be the output of this program?
// int a=10;

// if(a=11)
//    printf(“I am 11”);
// else
//    printf(“I am not 11”);

#include<stdio.h>

int main()
{
    int a = 10;
    if(a = 11) // ==>[(a=11) a equal to 11][(a==11) a compare with 11]
    {
            printf("i am 11");
    }
    else
    {   
         printf("i am not 11");
    }
    return 0;
}
// there fore output of this program is "i am 11".