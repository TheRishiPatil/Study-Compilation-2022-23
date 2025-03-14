// Q3. Write a program to convert Celsius (Centigrade degrees temperature to Fahrenheit)

#include<stdio.h>

int main()
{
    float celcius;
    printf("Please Enter The Celcius\n ");
    scanf("%f", &celcius);
    
    printf("the value of fahrenheit is %f",(celcius * 9/5) + 32);
    return 0;
}