/* Project 1: Number Guessing Game
Problem: This is going to be fun!!  We will write a program that generates a random number and asks the player to guess it.
If the player’s guess is higher than the actual number, the program displays “Lower number please.”
Similarly, if the user’s guess is too low, the program prints “Higher number please.”
When the user guesses the correct number, the program displays the number of guesses the player used to arrive at the number.*/


#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int main()
{
    int number, guess, attemts = 1;
    srand(time(0));
    number = rand() % 50 + 1; // Generates a random number between 1 to 50
    // number = rand() % 100 + 5; Generates a random number between 5 to 100
    // number = rand() % 200 + 10; Generates a random number between 10 to 200

    do{
        printf("Guess the number between 1 to 50 = ");
        scanf("%d", &guess);

        if(guess > number)
        {
            printf("Please guess the lower number \n");
        }
        else if (guess < number)
        {
            printf("Please guess the higher number \n");
        }
        else
        {
            printf("You guessed number in %d attemts.", attemts);
        }
        attemts++;
    } while(guess != number);

    return 0;
}