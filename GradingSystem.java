import java.util.Scanner; 

public class GradingSystem { 

   public static void main(String[] args) { 
   
      gradingSystem(42); 
   
   }
   
   public static void gradingSystem(double numberGrade) { 
   
   if(numberGrade >=93) {
      System.out.println("A"); 
   }else if(numberGrade >=90){ 
      System.out.println("A-");
   }else if(numberGrade >=87){
      System.out.println("B+");
   }else if(numberGrade >=83){ 
      System.out.println("B"); 
   }else if(numberGrade >=80){
      System.out.println("B-"); 
   }else if(numberGrade >=77){ 
      System.out.println("C+"); 
   }else if(numberGrade >=70){
      System.out.println("C"); 
   }else if(numberGrade >=60){
      System.out.println("D"); 
   }else if(numberGrade < 60){ 
      System.out.println("F"); 
   }
   
   } 

}
