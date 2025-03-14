// 4. Write a program using a function that calculates the sum and average of two numbers. Use pointers and print the values of sum and average in main().

#include<stdio.h>
void sumavg(int a, int b, int *sum , float *avg)
{
    *sum = a + b;
    *avg = (float) (*sum)/2;
}

int main()
{
    int i = 2, j = 4, sum;
    float avg;
    sumavg(i, j, &sum, &avg);
    printf("The value of sum is %d \n", sum);   
    printf("The value of avg is %f \n", avg);   
    return 0;
}