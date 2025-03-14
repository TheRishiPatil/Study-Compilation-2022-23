//Q4. Explain step by step evaluation of 3*x/y-z +k
// Where x=2, y=3, z=3 and k=1

#include<stdio.h>

int main()
{
    int x = 2;
    int y = 3;
    int z = 3;
    int k = 1;
    int result = 3 * x / y - z + k;
    printf("The value of result is %d", result);
    /*
       (3 * 2) / 3 - 3 + 1
        6 / 3 -3 + 1
        2 - 3 + 1
        1 - 1
        0
    */    
    return 0;
}

// Q5. 3.0+1 will be:
// 1.Integer
// 2.Floating number
// 3.Character
// => Floating number