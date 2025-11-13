package LAB2;

import java.util.Scanner;

/**
 * Q4: Calculate Body Mass Index (BMI)
 * Formula: BMI = weight / height²
 * (weight in kilograms, height in meters)
 */
public class Q4 {
    
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Display program title
        System.out.println("=================================");
        System.out.println("      BMI Calculator");
        System.out.println("=================================");
        
        // Get weight from user
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();
        
        // Get height from user
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();
        
        // Calculate BMI using the formula
        // BMI = weight / height²
        // height² means height × height
        double bmi = weight / (height * height);
        
        // Display the results
        System.out.println("\n--- Results ---");
        System.out.printf("Weight: %.2f kg\n", weight);
        System.out.printf("Height: %.2f m\n", height);
        System.out.printf("BMI: %.2f\n", bmi);
        
        // Display BMI category
        System.out.print("BMI Category: ");
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        
        // Close scanner
        scanner.close();
    }
}
