public class Day5 {
  public static void main(String[] args) {
    int[] numbers = {15, 62, 28, 91, 43, 55};
   
    //Calculate sum 
    int sum = 0;

    for(int i=0;i<numbers.length;i++) {
      sum = sum + numbers[i];
    }

    System.out.println("Total =" + sum);

    // Calculate average 
    double average = (double)sum/numbers.length;

    System.out.println("Average = " + average);

    // Find largest number
    int largest = numbers[0];

    for(int i=1;i<numbers.length;i++) {
      if(numbers[i] > largest) {
        largest = numbers[i];
      }
    }

    System.out.println("Largest = " + largest);

    // Find smallest number
    int smallest = numbers[0];

    for(int i=1;i<numbers.length;i++) {
      if(numbers[i] < smallest) {
        smallest = numbers[i];
      }
    }

    System.out.println("Smallest = " + smallest);
    
  }
}
