import java.util.Scanner;
 
  public class Laptop{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number");
 int age =input.nextInt();

 if (age > 18){
 System.out.println("Greater");
}

 if (age < 18){
 System.out.println("lesser");
}

 if (age ==18){
 System.out.println("equal to");
}


}


  }


 