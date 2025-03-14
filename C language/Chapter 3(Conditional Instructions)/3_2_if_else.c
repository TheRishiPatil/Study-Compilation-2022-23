// c program to check driving age

#include<stdio.h>

int main()
{
    int age;
    printf("Please enter the age \n");
    scanf("%d", &age);

    if(age >= 80)
        {
        printf("You can't drive");
        }
    else{
        
        if (age <= 18)
        {
        printf("You can't drive");
        }
    else{
        printf("You can drive");
    
        }
        }
    
    
    return 0;
}
