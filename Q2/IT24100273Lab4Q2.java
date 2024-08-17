import java.util.Scanner;
public class IT24100273Lab4Q2{

    public static void main(String[] args){

         Scanner scanner = new Scanner(System.in);

         System.out.print("Please enter exam marks (out of 100): ");
         int exmarks = scanner.nextInt();
     
         if (exmarks<=100 && exmarks >= 0)
        {    
           System.out.print("Please enter lab submission marks (out of 100): ");
           int labmarks = scanner.nextInt();
          
                if (labmarks<=100 && labmarks >=0)
                {
                     System.out.print("Please enter percentage given for the exam : ");
                     int perexam = scanner.nextInt();
 
                     System.out.print("Please enter percentage given for the labsubmission : ");
                     int perlab = scanner.nextInt();
                    
                       if(perexam + perlab == 100)
                       {
                              int finalmarks = (exmarks/2) + (labmarks/2);                         
                              System.out.print("Final exam mark is : " + finalmarks);
                       }

                       else
                       {
                              System.out.print("The perecentages must add up to 100")
                       }       
 
                }
                else
                {
                     System.out.print("Invalid input for labsubmission");
                }
         }
         else
         {
           System.out.print("Invalid input for exam marks");
         }
    }
}

