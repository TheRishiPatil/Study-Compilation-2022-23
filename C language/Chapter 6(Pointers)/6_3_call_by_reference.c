#include<stdio.h>
void wrongswap(int a, int b);
void swap(int *a, int *b);

int main()
{
    int x=3, y=4;
    printf("The value of x and y before swap is %d and %d \n", x, y);
    wrongswap(x, y); // will not work due to call by value
    printf("The value of x and y after swap is %d and %d \n", x, y);
    printf("=============================================== \n");
    printf("The value of x and y before swap is %d and %d \n", x, y);
    swap(&x, &y); // will work due to call by reference
    printf("The value of x and y after swap is %d and %d \n", x, y);
    return 0;
}
void wrongswap(int a, int b)
{
    int temp;
    temp = a;
    a = b;
    b = temp;
}
void swap(int *a, int *b)
{
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

/*Call by reference -> sending the address of arguments
Now since the addresses are passed to the function, the function can now modify the value of a variable in calling function using * and & operators. 
This function is capable of swapping the values passed to it. If a=3 and b=4 before a call to swap(a,b), a=4 and b=3 after calling swap.
*/