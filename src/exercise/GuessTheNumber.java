package exercise;

import java.util.Scanner;

class Game{
    int randomNum,noOfGuesses=1,userInput;
    public Game(){
        this.randomNum = (int)(Math.random()*10)+1;
    }
    public void takeUserInput(){
        System.out.println("Please enter a number between 1 and 10 : ");
        Scanner sc = new Scanner(System.in);
        this.userInput =  sc.nextInt();
    }
    public boolean isCorrect(){
       if(this.userInput == this.randomNum){
           return true;
       }
       else{
           System.out.println("You have not guessed the number");
           this.noOfGuesses++;
           return false;
       }
    }
public void playGame(){
        boolean result = false;
        while(!result){
        takeUserInput();
        result = isCorrect();
        }
        System.out.println("You win!");
        System.out.println("you guessed the number in " + noOfGuesses + " guesses");
        setNoOfGuesses();
}
public void setNoOfGuesses(){
        this.noOfGuesses=1;
    }
}
public class GuessTheNumber {
    /* Create a class Game that allows user to play guess the number game once
    * 1. constructor to generate the random number
    * 2. takeUserInput() to take a user input number
    * 3. isCorrectNumber() to validate the guess
    * 4. getters and setters to initialize the noOfGuess
    * Use properties such and noOfGuesses() etc......    * */
    public static void main(String[] args) {
        Game guess = new Game();
        guess.playGame();
    }
}
