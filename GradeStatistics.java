import java.util.Scanner;

public class GradeStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double maximum = Double.MIN_VALUE;
        double minimum = Double.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            while (true) {
                try {
                    System.out.print("Enter grade " + i + ": ");
                    double grade = scanner.nextDouble();
                    total += grade;
                    if (grade > maximum) {
                        maximum = grade;
                    }
                    if (grade < minimum) {
                        minimum = grade;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // Clear the input buffer
                }
            }
        }

        double average = total / 10;

        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);

        scanner.close();
    }
}
