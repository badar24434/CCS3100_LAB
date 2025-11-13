package LAB2;

import java.util.Scanner;

/**
 * Q3: Convert Pounds to Kilograms
 * Formula: kilograms = pounds × 0.45359
 * (1 pound = 0.45359 kg)
 */
public class Q3 {
    
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Display program title
        System.out.println("=================================");
        System.out.println("  Pounds to Kilograms Converter");
        System.out.println("=================================");
        
        // Get weight in pounds from user
        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();
        
        // Convert pounds to kilograms using the formula
        // kilograms = pounds × 0.45359
        double kilograms = pounds * 0.45359;
        
        // Display the results
        System.out.println("\n--- Results ---");
        System.out.printf("Weight in pounds: %.2f lbs\n", pounds);
        System.out.printf("Weight in kilograms: %.4f kg\n", kilograms);
        
        // Close scanner
        scanner.close();
    }
}
