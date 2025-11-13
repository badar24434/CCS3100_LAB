package LAB2;

import java.util.Scanner;

public class Q1 {
    
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Display program title
        System.out.println("=================================");
        System.out.println("  Average of Three Integers");
        System.out.println("=================================");
        
        // Get first integer from user
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        
        // Get second integer from user
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        
        // Get third integer from user
        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();
        
        // Calculate the sum of three integers
        int sum = num1 + num2 + num3;
        
        // Calculate average
        // We use 3.0 (not 3) to get decimal result
        double average = sum / 3.0;
        
        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f\n", average);
        
    }
}
