// 7. Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.

#include<stdio.h>

int main()
{
    float maths, science, marathi, hindi, english, total, paper;
    float pmaths, pscience, pmarathi, phindi, penglish, percentage;
    float per40, per33;

    printf("Enter total marks of paper: ");
    scanf("%f", &total);
    paper = total/5;

    printf("Enter marks: \n");

    printf("Maths: ");
    scanf("%f", &maths);
    pmaths = maths/paper * 100;

    printf("Science: ");
    scanf("%f", &science);
    pscience = science/paper * 100;

    printf("Marathi: ");
    scanf("%f", &marathi);
    pmarathi = marathi/paper * 100;

    printf("Hindi: ");
    scanf("%f", &hindi);
    phindi = hindi/paper * 100;

    printf("English: ");
    scanf("%f", &english);
    penglish = english/paper * 100;

    per40 = 40/total * 100;
    per33 = 33/paper * 100;

    percentage = (maths * science * marathi * hindi * english)/total * 100;
    if (percentage < per40 || pmaths < per33 || pscience < per33 || pmarathi < per33 || phindi < per33 || penglish < per33)
    {
        printf("Sorry...Student is declared fail");
    }
    else
    {
        printf("Congrats...Student is declared pass");
    }
    
    return 0;
}