import java.util.Scanner;
public class InputMethods{
   public static void main(String[]args){
      Scanner scanner= new Scanner(System.in);
// Basic Input Methods
System.out.println("Enter your name:");
String name= scanner.next();
scanner.nextLine();
System.out.println("Enter your college name:");
String college=scanner.nextLine();
System.out.println("Enter your roll number:");
int rollNumber=scanner.nextInt();
System.out.println("Enter your 1st year marks percentage:");
float marks=scanner.nextFloat();
scanner.close();
System.out.println("------Your Details-----\n");
System.out.println("Name:"+name);
System.out.println("\nCollege:"+college);
System.out.println("\nRoll No:"+rollNumber);
System.out.println("\nPercentage:"+marks);
}
}