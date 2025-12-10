package LAB2;

import java.util.Scanner;

/**
 * Q2: Calculate Sale Price with Discount
 * Formula: sale = price × (100 - discount percentage) ÷ 100
 */
public class Q2 {
    
    public static void main(String[] args) {
        // Create Scanner object to read user input
       
        
        // Calculate sale price using the formula
        // sale = price × (100 - discount percentage) ÷ 100
        double salePrice = price * (100 - discountPercentage) / 100;
        
        // Calculate the discount amount (how much you save)
        double discountAmount = price - salePrice;
        
        // Display the results
        System.out.println("\n--- Results ---");
        System.out.printf("Original Price: $%.2f\n", price);
        System.out.printf("Discount: %.0f%%\n", discountPercentage);
        System.out.printf("Discount Amount: $%.2f\n", discountAmount);
        System.out.printf("Sale Price: $%.2f\n", salePrice);
        System.out.printf("You save: $%.2f\n", discountAmount);
        
        // Close scanner
        scanner.close();
    }
}
