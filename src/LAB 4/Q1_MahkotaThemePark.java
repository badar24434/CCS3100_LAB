/*
 * LAB 4: Problem Solving with Selection Control (Week 6)
 * Question 1: Mahkota Theme Park Ticket Charge
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
 *   YES -> DECISION: parkType?
 *           - "ThemePark" -> charge = 0 (Free)
 *           - "WaterPark" -> charge = 7
 *           - "Both" -> charge = 5
 *   NO -> DECISION: age <= 12?
 *           YES -> DECISION: parkType?
 *                   - "ThemePark" -> charge = 10
 *                   - "WaterPark" -> charge = 15
 *                   - "Both" -> charge = 20
 *           NO -> DECISION: age <= 20?
 *                   YES -> DECISION: parkType?
 *                           - "ThemePark" -> charge = 20
 *                           - "WaterPark" -> charge = 25
 *                           - "Both" -> charge = 40
 *                   NO -> DECISION: age <= 54?
 *                           YES -> DECISION: parkType?
 *                                   - "ThemePark" -> charge = 25
 *                                   - "WaterPark" -> charge = 30
 *                                   - "Both" -> charge = 45
 *                           NO -> DECISION: parkType?
 *                                   - "ThemePark" -> charge = 10
 *                                   - "WaterPark" -> charge = 15
 *                                   - "Both" -> charge = 20
 *   |
 *   v
 * OUTPUT: ticket charge
 *   |
 *   v
 * END
 */

import java.util.Scanner;

public class Q1_MahkotaThemePark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║   MAHKOTA THEME PARK TICKET SYSTEM           ║");
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
        System.out.print("Enter park type (1/2/3): ");
        int parkChoice = input.nextInt();
        
        String parkType;
        switch (parkChoice) {
            case 1:
                parkType = "ThemePark";
                break;
            case 2:
                parkType = "WaterPark";
                break;
            case 3:
                parkType = "Both";
                break;
            default:
                System.out.println("Invalid choice! Defaulting to ThemePark.");
                parkType = "ThemePark";
        }
        
        // Determine ticket charge using nested selection
        double charge = 0;
        String ageCategory = "";
        
        if (age < 3) {
            ageCategory = "Under 3";
            switch (parkType) {
                case "ThemePark":
                    charge = 0; // Free
                    break;
                case "WaterPark":
                    charge = 7;
                    break;
                case "Both":
                    charge = 5;
                    break;
            }
        } else if (age >= 3 && age <= 12) {
            ageCategory = "3-12 years";
            switch (parkType) {
                case "ThemePark":
                    charge = 10;
                    break;
                case "WaterPark":
                    charge = 15;
                    break;
                case "Both":
                    charge = 20;
                    break;
            }
        } else if (age >= 13 && age <= 20) {
            ageCategory = "13-20 years";
            switch (parkType) {
                case "ThemePark":
                    charge = 20;
                    break;
                case "WaterPark":
                    charge = 25;
                    break;
                case "Both":
                    charge = 40;
                    break;
            }
        } else if (age >= 21 && age <= 54) {
            ageCategory = "21-54 years";
            switch (parkType) {
                case "ThemePark":
                    charge = 25;
                    break;
                case "WaterPark":
                    charge = 30;
                    break;
                case "Both":
                    charge = 45;
                    break;
            }
        } else { // age > 55
            ageCategory = "Over 55 years";
            switch (parkType) {
                case "ThemePark":
                    charge = 10;
                    break;
                case "WaterPark":
                    charge = 15;
                    break;
                case "Both":
                    charge = 20;
                    break;
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
        System.out.println("\n       🎢 Enjoy your visit! 🎢");
        
        input.close();
    }
}
