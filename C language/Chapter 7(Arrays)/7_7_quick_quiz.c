// Create a 2-d array by taking input from the user. Write a display function to print the content of this 2-d array on the screen.

#include<stdio.h>
int main(){

   int disp[2][2];
   int i, j;
   for(i=0; i<2; i++) 
   {
      for(j=0;j<2;j++)
      {
         printf("Enter value for disp: ");
         scanf("%d", &disp[i][j]);
      }
   }
   printf("Two Dimensional array elements: \n");
   for(i=0; i<2; i++) 
   {
      for(j=0;j<2;j++) 
      {
         printf("%d ", disp[i][j]);
         if(j==1)
         {
            printf("\n");
         }
      }
   }
   return 0;
}