// 22. Write a function to convert Celcius temperature into Fahrenheit.

#include<stdio.h>
float temp(int a)
{
    int Fahr;
    Fahr = (a * 9/5) + 32;
    return Fahr;
}

int main()
{
    int celc;
    printf("Enter the temperature in Celcius: ");
    scanf("%d", &celc);
    printf("The temperature in Fahrenheit is: %.2f", temp(celc));
    return 0;
}