#include<stdio.h>
void GoodMorning();
void GoodAfternoon();
void GoodNight();

int main()
{
    GoodMorning();
    return 0;
}

void GoodMorning()
{
    printf("Good Morning Bhailog \n");
    GoodAfternoon();
}

void GoodAfternoon()
{
    printf("Good Afternoon Bhailog \n");
    GoodNight();
}

void GoodNight()
{
    printf("Good Night Bhailog \n");
    // GoodMorning(); <== infinite loop bnaneki ninja technic
}