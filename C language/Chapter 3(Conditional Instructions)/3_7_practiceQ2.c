// 2.	Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to 
// pass. Assume 3 subjects and take marks as input from the user.
#include<stdio.h>

int main()
{
    float total, paper;
    float physics, maths, science;
    float perphysics, permaths, perscience;
    float percentage;
    
    printf("Please enter the total marks of question paper \n");
    scanf("%f", &total);
    paper =total/3;

    printf("Enter the marks \n");
    printf("physics : ");
    scanf("%f", &physics);
    perphysics = physics/paper * 100;

    printf("maths : ");
    scanf("%f", &maths);
    permaths = maths/paper * 100;

    printf("science : ");
    scanf("%f", &science);
    perscience = science/paper * 100;
    
    percentage = (physics + maths + science)/total * 100;
    if ((percentage < 40) || perphysics < 33 || permaths < 33 || perscience < 33)
    {
        printf("your percentage is %f. you are fail", percentage);
    
    }
    else
    {
        printf("your percentage is %f. you are pass", percentage);
    }
    
}