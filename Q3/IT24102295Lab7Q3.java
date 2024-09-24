import java.util.Scanner;
public class IT24102295Lab7Q3 {
        public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             double discount=0.05;
             
             for( int i=1;i<=5;i++ ) {
                 System.out.println("Customer "+i);
                 System.out.print("Enter total bill amount: ");
                 double billAmount = input.nextDouble();
                 System.out.print("Enter mode of payment(C for cash, O for other): ");
                 char paymentMethod = input.next().charAt(0);
                 
                 if (paymentMethod=='C')
                 {
                   double disc = billAmount * discount;
                   double amountToBePaid = billAmount - disc;
                   System.out.println("Discount is : " +disc);
                   System.out.println("Amount to be paid: "+amountToBePaid);
                 }
                 else if (paymentMethod=='O')
                 {
                   System.out.println("No discount applicable");
                   System.out.println("Amount to be paid : " +billAmount);
                 }
                 else
                 {
                   System.out.println("Payment mode is not valid");
                 }
                 System.out.println();
            }
        }
}
                   