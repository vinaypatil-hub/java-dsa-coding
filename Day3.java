public class Day3 {
    public static void main(String[] args) {

      
        System.out.println("Numbers 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        
        System.out.println("Table of 5:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        
        System.out.println("Even numbers:");

        int j = 2;

        while (j <= 20) {
            System.out.println(j);
            j += 2;
        }

        
        int k = 1;
        int sum = 0;

        while (k <= 10) {
            sum = sum + k;
            k++;
        }

        System.out.println("Sum = " + sum);
    }
}
