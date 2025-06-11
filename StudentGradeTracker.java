import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeTracker {

	public static void main(String[] args) {
		
				Scanner scanner = new Scanner(System.in);
		        ArrayList<Double> grades = new ArrayList<>();

		        System.out.println("Student Grade Tracker");
		        System.out.println("Enter grades one by one. Enter -1 to finish.");

		        double grade;
		        while (true) {
		            System.out.print("Enter grade: ");
		            if (scanner.hasNextDouble()) {
		                grade = scanner.nextDouble();
		                if (grade == -1) {
		                    break;
		                } else if (grade >= 0 && grade <= 100) { // Assuming grades are between 0 and 100
		                    grades.add(grade);
		                } else {
		                    System.out.println("Invalid grade. Please enter a grade between 0 and 100, or -1 to finish.");
		                }
		            } else {
		                System.out.println("Invalid input. Please enter a number.");
		                scanner.next(); // consume the invalid input
		            }
		        }

		        if (grades.isEmpty()) {
		            System.out.println("No grades were entered.");
		        } else {
		            // Calculate Average
		            double sum = 0;
		            for (double g : grades) {
		                sum += g;
		            }
		            double average = sum / grades.size();

		            // Find Highest Grade
		            double highest = Collections.max(grades);

		            // Find Lowest Grade
		            double lowest = Collections.min(grades);

		            System.out.println("\n--- Grade Summary ---");
		            System.out.printf("Average Grade: %.2f%n", average);
		            System.out.printf("Highest Grade: %.2f%n", highest);
		            System.out.printf("Lowest Grade: %.2f%n", lowest);
		        }
		        scanner.close();
	}
}
