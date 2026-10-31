public class Day4 {
  public static void main(String[] args) {

    int[] marks = {75, 80, 65, 90, 85};

    // Print all marks
    System.out.println("Student Marks:");
    for(int i=0; i<marks.length; i++) {
      System.out.println(marks[i]);
    }

    //Calculate total
    int sum = 0;
    for(int i=0; i<marks.length; i++) {
      sum = sum + marks[i];
    }

    System.out.println("Total Marks =" + sum);

    //Find highest mark
    int highest = marks[0];

    for(int i=1; i<marks.length; i++) {
      if (marks[i]>highest) {
        highest = marks[i];
      }
    }
    System.out.println("Highest Marks = " + highest);
  }
}
