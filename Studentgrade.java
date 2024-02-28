import java.util.Scanner;

public class Studentgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjectcount = sc.nextInt();

        int totalmarks = 0;

        System.out.println("Enter marks obtained (out of 100) in each subject:");

        for (int i = 1; i <= subjectcount; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            totalmarks =totalmarks+ marks;
        }
        // Calculating average perentage
        double averagePercentage = (double)totalmarks / subjectcount;

        System.out.println("Total Marks: " + totalmarks);
        System.out.println("Average Percentage: " + averagePercentage);

        //Grade calculation
        if (averagePercentage >= 90) {
            System.out.println("Grade : A");
        } else if (averagePercentage >= 80) {
            System.out.println("Grade : B");
        } else if (averagePercentage >= 70) {
            System.out.println("Grade : C");
        } else if (averagePercentage >= 60) {
            System.out.println("Grade : C");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}