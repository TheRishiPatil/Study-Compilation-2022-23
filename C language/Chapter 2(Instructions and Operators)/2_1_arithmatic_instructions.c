#include <stdio.h>

int main()
{
    int a, b;
    printf("Enter the values of a and b \n");
    scanf("%d", &a);
    scanf("%d", &b);

    printf("The value of a + b is : %d\n", a + b);
    printf("The value of a - b is : %d\n", a - b);
    printf("The value of a * b is : %d\n", a * b);
    printf("The value of a / b is : %d\n", a / b);

    int z;
    z = a - b;
    printf("The value of z is : %d\n", z);

    printf("If 5 divided by 2 then a reminder is %d \n", 5 % 2);
    printf("If -5 divided by 2 then a reminder is %d \n", -5 % 2);
    printf("If 5 divided by -2 then a reminder is %d \n", 5 % -2);

    return 0;
}

#include<stdio.h>
#include<math.h>
int main()
{
    printf("the value of 4 to the power 5 is %f\n",pow(4, 5));
    return 0;
}

#include<stdio.h>

int main()
{
    int k;
    printf("the value of k is %f",3.0/9);
    return 0;
}
