import java.util.Scanner;
import java.util.Random;

public class Day11 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    int num1 = random.nextInt(10) + 1;
    int num2 = random.nextInt(10) + 1;

    System.out.println("=====MATH CHALLENGE=====");
    System.out.println("What is " + num1 +" + " + num2 + " ? ");
    System.out.print("Your answer: ");
    int answer = sc.nextInt();

    if(answer == num1 + num2) {
      
      System.out.println("Correct!");
    }else {
      System.out.println("Wrong answer ");
      System.out.println("Correct answer : " + (num1 + num2));
    }
      
    
    sc.close();
  }
}
