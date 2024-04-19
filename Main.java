import java.util.Scanner;
import java.util.*;

public class Main {

	

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		
		// Input staff details
        System.out.println("Calculate bonus of employee based on rating's provided");
        System.out.println("Enter staff id:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter staff name:");
        String name = scanner.nextLine();
        System.out.println("Enter years of experience in numbers:");
        int experience = scanner.nextInt();
        System.out.println("Enter current salary of staff:");
        double salary = scanner.nextDouble();
        System.out.println("Enter overall rating of staff(out of 10)");
        double rating = scanner.nextDouble();

        
     // Create Staff object with input details
        Staff staff = new Staff(id, name, experience, salary, rating);

        // Calculate salary and display
        staff.calculateSalary();
        scanner.close();


     

	}

}
