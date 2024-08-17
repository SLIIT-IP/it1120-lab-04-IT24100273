import java.util.Scanner;
public class IT24100273Lab4Q3{

    public static void main(String[] args){
     
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the number : ");
         int num = scanner.nextInt();

         String result = (num > 0) ? "Positive" : (num == 0) ? "This number is zero" : (num < 0) ? "Negative" : "This number is zero";
         System.out.print("The number is : " + result);

         scanner.close();
    }
}  