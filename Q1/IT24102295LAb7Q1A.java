import java.util.Scanner;

public class IT24102295LAb7Q1A
{
    public static void main(String[] args){

         Scanner input = new Scanner(System.in);
         
         double subject1, subject2, subject3, subject4;
         System.out.println("Enter marks for four subjects:");
         System.out.print("Enter subject Mark 1: ");
         subject1 = input.nextDouble();
         System.out.print("Enter subject Mark 2: ");
         subject2 = input.nextDouble();
         System.out.print("Enter subject Mark 3: ");
         subject3 = input.nextDouble();
         System.out.print("Enter subject Mark 4: ");
         subject4 = input.nextDouble();

         double average =(subject1 + subject2 + subject3 + subject4)/4;
         System.out.println("Average is : " + average);
         
         if (average >=75 && average <=100) {
               System.out.println("Grade: Distinction"); 
         }
         else if (average >= 50 && average <75) { 
               System.out.println("Grade: Credit");
         }
         else if (average >= 0 && average < 50) {
               System.out.println("Grade: Fail");
         }
         else {
              System.out.println("invalid marks entered.");
         }

    }
}
          