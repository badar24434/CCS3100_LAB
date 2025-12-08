/*
 * LAB 4: Problem Solving with Selection Control (Week 6)
 * Question 1 (Alternative Version): Mahkota Theme Park Ticket Charge
 * 
 * This version uses ONLY IF-ELSE statements (No switch-case)
 * 
 * PROBLEM ANALYSIS CHART (PAC):
 * ================================
 * Given (Input):
 *   - Age of visitor (integer)
 *   - Park Type (String: "ThemePark", "WaterPark", "Both")
 * 
 * Required (Output):
 *   - Ticket charge (RM)
 * 
 * Processing:
 *   1. Read age and park type from user
 *   2. Determine age category:
 *      - Under 3
 *      - 3-12
 *      - 13-20
 *      - 21-54
 *      - Over 55
 *   3. Based on age category and park type, determine ticket price
 *   4. Display the ticket charge
 * 
 * FLOWCHART DESCRIPTION:
 * ================================
 * START
 *   |
 *   v
 * INPUT: age, parkType
 *   |
 *   v
 * DECISION: age < 3?
 *   YES -> DECISION: parkType == "ThemePark"?
 *           YES -> charge = 0 (Free)
 *           NO -> DECISION: parkType == "WaterPark"?
 *                   YES -> charge = 7
 *                   NO -> charge = 5 (Both)
 *   NO -> DECISION: age <= 12?
 *           YES -> DECISION: parkType == "ThemePark"?
 *                   YES -> charge = 10
 *                   NO -> DECISION: parkType == "WaterPark"?
 *                           YES -> charge = 15
 *                           NO -> charge = 20 (Both)
 *           NO -> Continue with other age categories...
 *   |
 *   v
 * OUTPUT: ticket charge
 *   |
 *   v
 * END
 */

import java.util.Scanner;

public class Q1_MahkotaThemePark_IfElseOnly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║   MAHKOTA THEME PARK TICKET SYSTEM           ║");
        System.out.println("║   (Using If-Else Only - Alternative Version) ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println();
        
        // Input age
        System.out.print("Enter visitor's age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume newline
        
        // Display park options
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Park Type Options:");
        System.out.println("  1. ThemePark");
        System.out.println("  2. WaterPark");
        System.out.println("  3. Both");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.print("Enter park type (ThemePark/WaterPark/Both): ");
        String parkType = input.nextLine().trim();
        
        // Validate park type input
        if (!parkType.equalsIgnoreCase("ThemePark") && 
            !parkType.equalsIgnoreCase("WaterPark") && 
            !parkType.equalsIgnoreCase("Both")) {
            System.out.println("Invalid park type! Defaulting to ThemePark.");
            parkType = "ThemePark";
        }
        
        // Determine ticket charge using ONLY nested if-else statements
        double charge = 0;
        String ageCategory = "";
        
        // Age category: Under 3
        if (age < 3) {
            ageCategory = "Under 3";
            
            if (parkType.equalsIgnoreCase("ThemePark")) {
                charge = 0; // Free
            } else if (parkType.equalsIgnoreCase("WaterPark")) {
                charge = 7;
            } else if (parkType.equalsIgnoreCase("Both")) {
                charge = 5;
            }
        } 
        // Age category: 3-12
        else if (age >= 3 && age <= 12) {
            ageCategory = "3-12 years";
            
            if (parkType.equalsIgnoreCase("ThemePark")) {
                charge = 10;
            } else if (parkType.equalsIgnoreCase("WaterPark")) {
                charge = 15;
            } else if (parkType.equalsIgnoreCase("Both")) {
                charge = 20;
            }
        } 
        // Age category: 13-20
        else if (age >= 13 && age <= 20) {
            ageCategory = "13-20 years";
            
            if (parkType.equalsIgnoreCase("ThemePark")) {
                charge = 20;
            } else if (parkType.equalsIgnoreCase("WaterPark")) {
                charge = 25;
            } else if (parkType.equalsIgnoreCase("Both")) {
                charge = 40;
            }
        } 
        // Age category: 21-54
        else if (age >= 21 && age <= 54) {
            ageCategory = "21-54 years";
            
            if (parkType.equalsIgnoreCase("ThemePark")) {
                charge = 25;
            } else if (parkType.equalsIgnoreCase("WaterPark")) {
                charge = 30;
            } else if (parkType.equalsIgnoreCase("Both")) {
                charge = 45;
            }
        } 
        // Age category: Over 55
        else { // age > 55
            ageCategory = "Over 55 years";
            
            if (parkType.equalsIgnoreCase("ThemePark")) {
                charge = 10;
            } else if (parkType.equalsIgnoreCase("WaterPark")) {
                charge = 15;
            } else if (parkType.equalsIgnoreCase("Both")) {
                charge = 20;
            }
        }
        
        // Display ticket information
        System.out.println("\n╔═══════════════════════════════════════════════╗");
        System.out.println("║           TICKET INFORMATION                 ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println("  Age: " + age + " (" + ageCategory + ")");
        System.out.println("  Park Type: " + parkType);
        System.out.println("  ─────────────────────────────────────────────");
        
        if (charge == 0) {
            System.out.println("  Ticket Charge: FREE");
        } else {
            System.out.printf("  Ticket Charge: RM %.2f%n", charge);
        }
        
        System.out.println("╚═══════════════════════════════════════════════╝");
        
        // Display price table for reference
        System.out.println("\n┌─────────────────────────────────────────────┐");
        System.out.println("│         PRICE REFERENCE TABLE               │");
        System.out.println("├─────────────────────────────────────────────┤");
        System.out.println("│ Age       │ ThemePark │ WaterPark │ Both   │");
        System.out.println("├─────────────────────────────────────────────┤");
        System.out.println("│ Over 55   │ RM 10     │ RM 15     │ RM 20  │");
        System.out.println("│ 21-54     │ RM 25     │ RM 30     │ RM 45  │");
        System.out.println("│ 13-20     │ RM 20     │ RM 25     │ RM 40  │");
        System.out.println("│ 3-12      │ RM 10     │ RM 15     │ RM 20  │");
        System.out.println("│ Under 3   │ FREE      │ RM 7      │ RM 5   │");
        System.out.println("└─────────────────────────────────────────────┘");
        
        System.out.println("\n       🎢 Enjoy your visit! 🎢");
        
        input.close();
    }
}
