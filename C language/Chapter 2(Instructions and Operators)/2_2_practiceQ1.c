//Q1. Which of the following is invalid in c?

// 1. int a; b=a;
#include<stdio.h>

int main()
{
    int a; b=a;// ==> invalid
    int a; int b=a;// ==> valid
    return 0;
} 
//================================================================
// 2. int v= 3^3;
#include<stdio.h>

int main()
{
    int v = 3^3;// ==> valid (question is its valid or not)
    return 0;
} 
//=================================================================
// 3. char dt= '21 Dec 2020';
#include<stdio.h>

int main()
{
    char dt = '21 Dec 2020';// ==> invaid
    char dt = '2';// ==> valid
    return 0;
} 