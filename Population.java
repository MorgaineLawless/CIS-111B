//Write a program that will predict the size of a population of organisms. The program 
//should ask for the starting number of organisms, their average daily population increase 
//(as a percentage), and the number of days they will multiply. For example, a population 
//might begin with two organisms, have an average daily increase of 50 percent, and will be 
//allowed to multiply for seven days. The program should use a loop to display the size of the 
//population for each day.
//Input Validation: Do not accept a number less than 2 for the starting size of the population. 
//Do not accept a negative number for average daily population increase. Do not accept a 
//number less than 1 for the number of days they will multiply.

import java.util.Scanner; 

public class Population { 

   public static void main(String [] args) { 
   
      int startingPopulation; 
      int dailyIncrease; 
      int dayCount; 
      int currentPopulation;
      
      Scanner keyboard = new Scanner(System.in); 
      
      //Figuring out starting population 
      
      System.out.print("What is the starting population? "); 
      startingPopulation = keyboard.nextInt(); 
      
      while (startingPopulation < 2) { 
         System.out.print("Invalid. There must be a starting population of atleast 2 or more. \n Enter starting population: "); 
         startingPopulation = keyboard.nextInt(); 
         } 
         
      //Figuring out daily population increase percentage
      
      System.out.print("What is the daily average the population will increase (Please write as a percentage)? "); 
      dailyIncrease = keyboard.nextInt(); 
      
      while (dailyIncrease < 0){ 
         System.out.print("Invalid. Only Positive growth can be calculated. \nEnter the population daily increase (as a percentage): ");
         dailyIncrease = keyboard.nextInt(); 
        } 
        
      //Figuring out how long they will multiply
      
      System.out.print("How long will the population increase (Please write as days)? "); 
      dayCount = keyboard.nextInt(); 
      
      while (dayCount < 0) { 
         System.out.print("Invalid. Please write more than 0 days in population increase. \nHow many days will the population grow: ");
         dayCount = keyboard.nextInt(); 
         }
         
       //Create algorith for calculations based on input  
       
       currentPopulation = (((dailyIncrease / 100) * startingPopulation) + dayCount) + startingPopulation;
       
       //Completed statement
       
       System.out.print("The current population of " + startingPopulation + " with a daily increase of " + dailyIncrease + "% over " + dayCount + " days, will be a population of " + currentPopulation + ".");
       }
       }
       
       // Code adapted from textbook example: Pennies for Pay
       //https://mediaplayer.pearsoncmg.com/assets/secs_gaddis_6_vn_04_02_pennies_for_pay
