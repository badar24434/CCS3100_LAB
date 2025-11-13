/*
 * LAB 4: Problem Solving with Selection Control (Week 6)
 * Question 2: BMI and Waist Size Health Risk
 * 
 * PROBLEM ANALYSIS CHART (PAC):
 * ================================
 * Given (Input):
 *   - Weight in kg (double)
 *   - Height in meters (double)
 *   - Gender (String: "Male" or "Female")
 *   - Waist size in inches (double)
 * 
 * Required (Output):
 *   - BMI value
 *   - Weight category (Normal, Over Weight, Obese, Severely Obese)
 *   - Health risk warning (if applicable)
 * 
 * Processing:
 *   1. Read weight, height, gender, and waist size from user
 *   2. Calculate BMI = weight / (height * height)
 *   3. Determine weight category based on BMI:
 *      - BMI 18.5-24.9: Normal
 *      - BMI 25-29.9: Over Weight
 *      - BMI 30-34.9: Obese
 *      - BMI >= 35: Severely Obese
 *   4. Check for higher risk based on gender and waist size:
 *      - Female: waist > 35 inches
 *      - Male: waist > 40 inches
 *   5. Display BMI, category, and health risk warning
 * 
 * FLOWCHART DESCRIPTION:
 * ================================
 * START
 *   |
 *   v
 * INPUT: weight, height, gender, waistSize
 *   |
 *   v
 * PROCESS: bmi = weight / (height * height)
 *   |
 *   v
 * DECISION: bmi < 18.5?
 *   YES -> category = "Under Weight"
 *   NO -> DECISION: bmi <= 24.9?
 *           YES -> category = "Normal"
 *           NO -> DECISION: bmi <= 29.9?
 *                   YES -> category = "Over Weight"
 *                   NO -> DECISION: bmi <= 34.9?
 *                           YES -> category = "Obese"
 *                           NO -> category = "Severely Obese"
 *   |
 *   v
 * DECISION: (gender == "Female" AND waistSize > 35) OR 
 *           (gender == "Male" AND waistSize > 40)?
 *   YES -> higherRisk = true
 *   NO -> higherRisk = false
 *   |
 *   v
 * OUTPUT: BMI, category, health risk warning
 *   |
 *   v
 * END
 */

import java.util.Scanner;

public class Q2_BMIHealthRisk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║     BMI & HEALTH RISK CALCULATOR             ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println();
        
        // Input weight
        System.out.print("Enter your weight (kg): ");
        double weight = input.nextDouble();
        
        // Input height
        System.out.print("Enter your height (meters): ");
        double height = input.nextDouble();
        input.nextLine(); // Consume newline
        
        // Input gender
        System.out.print("Enter your gender (Male/Female): ");
        String gender = input.nextLine().trim();
        
        // Input waist size
        System.out.print("Enter your waist size (inches): ");
        double waistSize = input.nextDouble();
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        // Determine weight category using nested if-else
        String category;
        String healthStatus;
        
        if (bmi < 18.5) {
            category = "Under Weight";
            healthStatus = "⚠️ Below Normal Range";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            category = "Normal";
            healthStatus = "✓ Healthy Weight Range";
        } else if (bmi >= 25 && bmi <= 29.9) {
            category = "Over Weight";
            healthStatus = "⚠️ Above Normal Range";
        } else if (bmi >= 30 && bmi <= 34.9) {
            category = "Obese";
            healthStatus = "⚠️ Health Risk Present";
        } else { // bmi >= 35
            category = "Severely Obese";
            healthStatus = "⚠️⚠️ High Health Risk";
        }
        
        // Check for higher risk based on waist size
        boolean higherRisk = false;
        String riskMessage = "";
        
        if (gender.equalsIgnoreCase("Female")) {
            if (waistSize > 35) {
                higherRisk = true;
                riskMessage = "⚠️ CAUTION: Your waist size exceeds 35 inches (female threshold)";
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (waistSize > 40) {
                higherRisk = true;
                riskMessage = "⚠️ CAUTION: Your waist size exceeds 40 inches (male threshold)";
            }
        }
        
        // Display results
        System.out.println("\n╔═══════════════════════════════════════════════╗");
        System.out.println("║           HEALTH ASSESSMENT RESULTS          ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println();
        System.out.println("  Personal Information:");
        System.out.println("  ─────────────────────────────────────────────");
        System.out.println("  Gender: " + gender);
        System.out.printf("  Weight: %.2f kg%n", weight);
        System.out.printf("  Height: %.2f meters%n", height);
        System.out.printf("  Waist Size: %.2f inches%n", waistSize);
        System.out.println();
        System.out.println("  BMI Analysis:");
        System.out.println("  ─────────────────────────────────────────────");
        System.out.printf("  BMI Value: %.2f%n", bmi);
        System.out.println("  Weight Category: " + category);
        System.out.println("  Status: " + healthStatus);
        System.out.println();
        
        // Display health risk warning if applicable
        if (higherRisk) {
            System.out.println("╔═══════════════════════════════════════════════╗");
            System.out.println("║            ⚠️  HEALTH RISK WARNING ⚠️          ║");
            System.out.println("╚═══════════════════════════════════════════════╝");
            System.out.println("  " + riskMessage);
            System.out.println();
            System.out.println("  Higher risk for:");
            System.out.println("    • Heart Disease");
            System.out.println("    • Type 2 Diabetes");
            System.out.println();
            System.out.println("  Recommendation:");
            System.out.println("    Please consult with a healthcare professional");
            System.out.println("    for personalized advice and health management.");
            System.out.println("╚═══════════════════════════════════════════════╝");
        } else {
            System.out.println("  ✓ Your waist size is within normal range.");
            System.out.println("╚═══════════════════════════════════════════════╝");
        }
        
        // BMI Reference Table
        System.out.println("\n┌─────────────────────────────────────────────┐");
        System.out.println("│         BMI REFERENCE TABLE                 │");
        System.out.println("├─────────────────────────────────────────────┤");
        System.out.println("│ BMI Range       │ Category                  │");
        System.out.println("├─────────────────────────────────────────────┤");
        System.out.println("│ Below 18.5      │ Under Weight              │");
        System.out.println("│ 18.5 - 24.9     │ Normal                    │");
        System.out.println("│ 25.0 - 29.9     │ Over Weight               │");
        System.out.println("│ 30.0 - 34.9     │ Obese                     │");
        System.out.println("│ 35.0 and above  │ Severely Obese            │");
        System.out.println("└─────────────────────────────────────────────┘");
        
        input.close();
    }
}
