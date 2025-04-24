import java.util.*;
class StingBuil{
  public static void main (String[]args){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string");
     String s1=sc.next();
     s1.concat("hey");
     System.out.println("String after concatination is "+s1);
     StringBuilder sb=new StringBuilder ("hello");
     sb.append("hi");
     System.out.println("String after appending is "+sb);
   }
}