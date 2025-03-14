// 3. Write a program to convert Celsius (Centigrade degrees temperature to Fahrenheit)

#include<stdio.h>

int main()
{
    float celcius, fahrenheit;

    printf("Enter the temperature in Celcius degree: ");
    scanf("%f", &celcius);

    fahrenheit = (float)(celcius * 9/5) + 32;
    printf("The temperature in Fahrenheit degree is %.2f", fahrenheit);

    return 0;
}