public class Day6 {
  public static void main(String[] args) {

    int[] numbers = {12, 17, 24, 31, 46, 53, 60};

    int even = 0;
    int odd = 0;
    int oddSum = 0;

    for (int i = 0; i < numbers.length; i++) {

      if (numbers[i] % 2 == 0) {
        even++;

      } else {
        odd++;
        oddSum = oddSum + numbers[i];
        System.out.println(numbers[i]);
      }
    }

    System.out.println("Even numbers = " + even);
    System.out.println("Odd numbers = " + odd);
    System.out.println("Sum of odd numbers = " + oddSum);
  }
}
