#include<stdio.h>

int main()
{
    int i = 5;
    printf("First print then increment : %d \n", i++); // i = 5 (after print add 1, therefore i=6)
    printf("First increment then print : %d \n", ++i); // i = 7 (because i = 6 then add 1 before print, therefore i=7)
    printf("First print then decrement : %d \n", i--); // i = 7 (after print minus 1, therefore i=6)
    printf("First decrement then print : %d \n", --i); // i = 5 (because i = 6 then minus 1 before print, therefore i=5)
    printf("i increments by 10 : %d \n", i += 10); // i = 15 (5 + 10 = 15)
    printf("i decrements by 10 : %d \n", i -= 10); // i = 5 (15 - 10 = 5)
    printf("i multiply by 10 : %d \n", i *= 10); // i = 15 (5 * 10 = 50)
    printf("i devided by 10 : %d \n", i /= 10); // i = 5 (50 / 10 = 5)
    printf("i remainder  10 : %d \n", i %= 10); // i = 5 (5 % 10 = 5)

    return 0;
}