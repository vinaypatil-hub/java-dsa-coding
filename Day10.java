import java.util.Scanner;
import java.util.Random;

public class Day10 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int playerScore = 0;
    int computerScore = 0;

    System.out.println("===== ROCK PAPER SCISSORS =====");
    System.out.println("1. Rock");
    System.out.println("2. Paper");
    System.out.println("3. Scissors");

    System.out.print("Enter your choice: ");
    int player = sc.nextInt();
    if (player == 1) {
    System.out.println("You selected Rock");
      } else if (player == 2) {
    System.out.println("You selected Paper");
      } else if (player == 3) {
    System.out.println("You selected Scissors");
      } else {
    System.out.println("Invalid choice!");
      }

    int computer = random.nextInt(3) + 1;

    System.out.println("Computer choice: " + computer);

    if (computer == 1) {
    System.out.println("Computer selected Rock");
      } else if (computer == 2) {
    System.out.println("Computer selected Paper");
      } else {
    System.out.println("Computer selected Scissors");
      }

    if (player == computer) {
    System.out.println("It's a Draw!");

      } else if (player == 1 && computer == 3) {
    System.out.println("You Win!");
    playerScore++;

      } else if (player == 2 && computer == 1) {
    System.out.println("You Win!");
    playerScore++;

      } else if (player == 3 && computer == 2) {
    System.out.println("You Win!");
    playerScore++;

      } else if (player >= 1 && player <= 3) {
    System.out.println("Computer Wins!");
    computerScore++;

      } else {
    System.out.println("Invalid choice!");
      }
    System.out.println("Your Score: " + playerScore);
    System.out.println("Computer Score: " + computerScore);
    sc.close();
  }
}
