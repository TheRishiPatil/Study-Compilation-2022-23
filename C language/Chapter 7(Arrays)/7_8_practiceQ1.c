// 1. Create an array of 10 numbers. Verify using pointer arithmetic that (ptr+2) points to the third element where ptr is a pointer pointing to the first element of the array.

#include<stdio.h>

int main()
{
    int arr[10];
    int *ptr = arr;
    ptr = ptr + 2; // ptr + 2 = ptr[2]
    if(ptr == &arr[2])
    {
        printf("These pointers points to the same location in memory\n");
    }
    else
    {
        printf("These pointers do not points to the same location in memory\n");
    }
    return 0;
}

// Yes, Pointer arithmetic that (ptr+2) points to the third element. Because ptr[0] points to the 1st element, ptr[1] points to the 2nd element, so ptr[2] points to the 3rd element