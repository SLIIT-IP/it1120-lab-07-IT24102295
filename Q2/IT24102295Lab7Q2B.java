import java.util.Scanner;
public class IT24102295Lab7QB {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         int i,j;
         for( i=1;i<=5;i++ )
         {
            System.out.print(i+" - ");
            for( j=1;j<=i;j++ ) 
            {
                 System.out.print("* ");
            }
            System.out.println();
         }
     }
}
       