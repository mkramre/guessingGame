//Morgan Kramer
//10/31/2021
//CS 141
//Lab 4: Guessing game
//This program outputs a guessing game between the numbers 1-100

import java.util.*;


public class GuessingGame {
  
   public static void main(String[] args) {
   
   System.out.println("This program allows you to play a guessing game.\nI will think of a number between 1 and\n100 and will allow you to guess until\nyou get it. For each guess, I will tell you\nwhether the right answer is higher or lower\nthan your guess.");   
  
   System.out.println("I'm thinking of a number between 1 adn 100...");
  
   Scanner console = new Scanner(System.in);
   System.out.println();
  
   
   double yourGuess = -5;
   Random r = new Random();
   int randomNumber = r.nextInt(100);
   int count = 0;
   
   while(yourGuess != randomNumber) {
      System.out.print("Your guess? ");
       yourGuess = Integer.parseInt(console.next());
       
       if(yourGuess < randomNumber) {
       System.out.println();
       System.out.println("It's higher");
       count++;
       }
       
       if(yourGuess > randomNumber) {
       System.out.println("It's lower.");
       count++;
       }
       
       if(yourGuess == randomNumber) {
       System.out.println("You got it in " + count + " guesses.");
       }
       System.out.println();
    
       
   }
  }
 }