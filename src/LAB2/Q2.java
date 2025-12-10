package LAB2;

import java.util.Scanner;

/**
 * Q2: Calculate Sale Price with Discount
 * Formula: sale = price × (100 - discount percentage) ÷ 100
 */
public class Q2 {
    
    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Display program title
        System.out.println("=================================");
        System.out.println("    Sale Price Calculator");
        System.out.println("=================================");
        
        // Get original price from user
        System.out.print("Enter original price: $");
        double price = scanner.nextDouble();
        
        // Get discount percentage from user
        System.out.print("Enter discount percentage (e.g., 20 for 20%): ");
        double discountPercentage = scanner.nextDouble();
       
    }
}
