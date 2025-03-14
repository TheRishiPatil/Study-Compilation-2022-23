// 2. Write a function to convert Celsius temperature into Fahrenheit.

/*==================== Function Code =========================*/

#include<stdio.h>
float temp(int a);

int main()
{
    int a;
    printf("celcius to farenheit is %f", temp(a));
    return 0;
}

float temp(int a)
{
    float celcies, fahrenheit;
    printf("Enter temperature in Celsius: ");
    scanf("%f", &celcies);
    fahrenheit = (celcies * 9/5) + 32;
}

/*==================== Normal Code =========================*/

#include <stdio.h>
int main()
{
    float celsius, fahrenheit;
    printf("Enter temperature in Celsius: ");
    scanf("%f", &celsius);

    fahrenheit = (celsius * 9 / 5) + 32;
    printf("celcius to farenheit is %f", fahrenheit);
    return 0;
}