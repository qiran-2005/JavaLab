import java.util.Scanner;

class Calculator1{
   public static void main(String[]args){
    
           char operator;
           Double number1, number2, result;
           Scanner scanner= new Scanner(System.in);
           System.out.println ("Enter an operator (either +,-,*, or /): ");
           operator= scanner.next().charAt(0);
           System.out.println("Enter number1 and number2 respectively: ");
           number1= scanner.nextDouble();
           number2= scanner.nextDouble();

    switch(operator){
          case '+': result= number1+number2;
          System.out.println(result);
          break;
          case '-': result= number1-number2;
          System.out.println(result);
          break;
          case '*': result= number1*number2;
          System.out.println(result);
          break;
          case '/': result= number1/number2;
          System.out.println(result);
          break;
          default:  System.out.println("Invalid Operator");
          break;
     }
}
}