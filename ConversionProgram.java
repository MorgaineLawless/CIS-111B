import java.util.Scanner; 

public class ConversionProgram { 

   public static void main(String[] args) { 
       
      displayMenu(); 
   
   }
   
      //Create a method for Menu 
      
      public static void displayMenu () { 
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a distance in meters: "); 
      double meters = keyboard.nextDouble(); 
      
      System.out.println("1.Convert to kilometers \n2.Convert to inches \n3.Convert to feet \n4.Quit the program");
      double menuSelection = keyboard.nextInt(); 
         
      if(menuSelection == 1){
         showKilometers(meters); 
      }else if(menuSelection == 2){
         showInches(meters); 
      }else if(menuSelection == 3){
         showFeet(meters); 
      }else if(menuSelection == 4){
         System.out.println("Bye!");
         System.exit(0);
      }else{
         System.out.println("Error! Please select from options 1-4: ");
         displayMenu();
      }
   }
   
   // Create a method for Kilometers formula 
   
   public static void showKilometers (double meters) { 
   
      double kilometers = meters * 0.001;
      System.out.println( meters + " meters is " + kilometers + " kilometers.");
      displayMenu();
   
   }
   
   //Create a method for Inches formula
   
   public static void showInches (double meters) { 
   
      double inches = meters * 39.37;
      System.out.println( meters + " meters is " + inches + " inches.");
      displayMenu();
   
   }
   
   //Create a method for Feet formula 
   
   public static void showFeet (double meters) { 
   
      double feet = meters * 3.281;
      System.out.println( meters + " meters is " + feet + " feet.");
      displayMenu();
   
   }  

}
