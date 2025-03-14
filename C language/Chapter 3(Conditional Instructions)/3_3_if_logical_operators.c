// 1. && (AND) is true when both the conditions are true

//     “1 and 0” is evaluated as false

//     “0 and 0” is evaluated as false

//     “1 and 1” is evaluated as true

// 2. || (OR) is true when at least one of the conditions is true. (1 or 0 = 1)(1 or 1 = 1)

// 3. ! returns true if given false and false if given true.

//     !(3==3) evaluates to false

//     !(3>30) evaluates to true

#include<stdio.h>

int main()
{
    int age;
    int vippass;
    
    printf("Please enter the age \n");
    scanf("%d", &age);
    
    printf("enter VipPass \n ");
    scanf("%d", &vippass);
    
    if ((age <= 70 && age >= 18) || !(vippass >= 1))
    {
     printf("You can drive");
    }
    else
    {
    printf("You can't drive");
    }
    return 0;
}