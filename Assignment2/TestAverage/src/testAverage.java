import java.util.Scanner;

public class testAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter score 1: ");
        double score1 = scanner.nextInt();
        
        System.out.print("Enter score 2: ");
        double score2 = scanner.nextInt();
        
        System.out.print("Enter score 3: ");
        double score3 = scanner.nextInt();
        
        double average = (score1 + score2 + score3) / 3.0;
        System.out.println("Average: " + average);
        
        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 80) {
            System.out.println("Grade: B");
        } else if (average >= 70) {
            System.out.println("Grade: C");
        } else if (average >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        scanner.close();
    }
}