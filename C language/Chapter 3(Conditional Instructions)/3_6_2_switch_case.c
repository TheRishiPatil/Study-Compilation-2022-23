// Quick Quiz: Write a program to find the grade of a student given his marks based on below:

// 90-100	A
// 80-90	B
// 70-80	C
// 60-70	D
// <60	F

#include<stdio.h>
int main()
{
   int score;

   printf("Enter score: ");
   scanf("%d", &score);

   switch( score / 10 )
   {

   case 10:
   case 9:
     printf("Grade: A");
     break;

   case 8:
     printf("Grade: B");
     break;

   case 7:
     printf("Grade: C");
     break;

   case 6:
     printf("Grade: D");
     break;

   case 5:
     printf("Grade: E");
     break;

   default:
     printf("Grade: F");
     break;

   }

   return 0;
}