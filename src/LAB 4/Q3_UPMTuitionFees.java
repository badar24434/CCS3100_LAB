/*
 * LAB 4: Problem Solving with Selection Control (Week 6)
 * Question 3: UPM Master Program Tuition Fees
 * 
 * PROBLEM ANALYSIS CHART (PAC):
 * ================================
 * Given (Input):
 *   - Program Code (String: "MCS", "ME", "MPM", "MEOH")
 *   - Semester Number (integer)
 *   - Credit Hours Registered (integer)
 * 
 * Required (Output):
 *   - Program full name
 *   - Semester number
 *   - Credit hours
 *   - Total tuition fees (RM)
 * 
 * Processing:
 *   1. Read program code, semester number, and credit hours
 *   2. Determine program details based on code:
 *      - MCS: Master of Computer Science, 1st=1250, 2nd+=1000, per credit=250
 *      - ME: Master of Environment, 1st=1400, 2nd+=1100, per credit=250
 *      - MPM: Master in Plantation Management, 1st=1250, 2nd+=1000, per credit=275
 *      - MEOH: Master of Environmental and Occupational Health, 1st=1250, 2nd+=1000, per credit=350
 *   3. Calculate total fees:
 *      - If semester = 1: totalFees = firstSemesterFee + (creditHours * feePerCredit)
 *      - If semester > 1: totalFees = subsequentSemesterFee + (creditHours * feePerCredit)
 *   4. Display program details and total tuition fees
 * 
 * FLOWCHART DESCRIPTION:
 * ================================
 * START
 *   |
 *   v
 * INPUT: programCode, semesterNo, creditHours
 *   |
 *   v
 * DECISION: programCode?
 *   "MCS" -> programName = "Master of Computer Science"
 *            firstSemFee = 1250, subSeqFee = 1000, perCredit = 250
 *   "ME" -> programName = "Master of Environment"
 *           firstSemFee = 1400, subSeqFee = 1100, perCredit = 250
 *   "MPM" -> programName = "Master in Plantation Management"
 *            firstSemFee = 1250, subSeqFee = 1000, perCredit = 275
 *   "MEOH" -> programName = "Master of Environmental and Occupational Health"
 *             firstSemFee = 1250, subSeqFee = 1000, perCredit = 350
 *   |
 *   v
 * DECISION: semesterNo == 1?
 *   YES -> totalFees = firstSemFee + (creditHours * perCredit)
 *   NO -> totalFees = subSeqFee + (creditHours * perCredit)
 *   |
 *   v
 * OUTPUT: programName, semesterNo, creditHours, totalFees
 *   |
 *   v
 * END
 */

import java.util.Scanner;

public class Q3_UPMTuitionFees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Display welcome message
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("║   UPM MASTER PROGRAM TUITION FEES CALCULATOR ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
        System.out.println();
        
        // Display available programs
        System.out.println("Available Master Programs:");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  MCS  - Master of Computer Science");
        System.out.println("  ME   - Master of Environment");
        System.out.println("  MPM  - Master in Plantation Management");
        System.out.println("  MEOH - Master of Environmental and Occupational Health");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println();
        
        // Input program code
        System.out.print("Code Program: ");
        String programCode = input.nextLine().trim().toUpperCase();
        
        // Input semester number
        System.out.print("Semester No: ");
        int semesterNo = input.nextInt();
        
        // Input credit hours
        System.out.print("Credit Hours Registered: ");
        int creditHours = input.nextInt();
        
        // Variables to store program details
        String programName = "";
        int firstSemesterFee = 0;
        int subsequentSemesterFee = 0;
        int feePerCredit = 0;
        boolean validCode = true;
        
        // Determine program details based on code using nested if-else
        if (programCode.equals("MCS")) {
            programName = "Master of Computer Science";
            firstSemesterFee = 1250;
            subsequentSemesterFee = 1000;
            feePerCredit = 250;
        } else if (programCode.equals("ME")) {
            programName = "Master of Environment";
            firstSemesterFee = 1400;
            subsequentSemesterFee = 1100;
            feePerCredit = 250;
        } else if (programCode.equals("MPM")) {
            programName = "Master in Plantation Management";
            firstSemesterFee = 1250;
            subsequentSemesterFee = 1000;
            feePerCredit = 275;
        } else if (programCode.equals("MEOH")) {
            programName = "Master of Environmental and Occupational Health";
            firstSemesterFee = 1250;
            subsequentSemesterFee = 1000;
            feePerCredit = 350;
        } else {
            validCode = false;
            System.out.println("\n⚠️ Error: Invalid program code!");
            System.out.println("Please enter one of: MCS, ME, MPM, MEOH");
        }
        
        // Calculate total tuition fees if valid code
        if (validCode) {
            int baseFee;
            
            // Determine base fee based on semester number
            if (semesterNo == 1) {
                baseFee = firstSemesterFee;
            } else {
                baseFee = subsequentSemesterFee;
            }
            
            // Calculate total fees
            int totalFees = baseFee + (creditHours * feePerCredit);
            
            // Display result
            System.out.println("\n--------------------------------------------------------------");
            System.out.println("Master Program: " + programName);
            System.out.println("Semester No: " + semesterNo);
            System.out.println("Credit Hours: " + creditHours);
            System.out.println("Total Tuition Fees: RM" + totalFees);
            System.out.println("--------------------------------------------------------------");
            
            // Display fee breakdown
            System.out.println("\n╔═══════════════════════════════════════════════╗");
            System.out.println("║           FEE BREAKDOWN                      ║");
            System.out.println("╚═══════════════════════════════════════════════╝");
            
            if (semesterNo == 1) {
                System.out.println("  1st Semester Fee:    RM " + firstSemesterFee);
            } else {
                System.out.println("  Subsequent Semester: RM " + subsequentSemesterFee);
            }
            
            System.out.println("  Credit Fee (" + creditHours + " x " + feePerCredit + "): RM " + (creditHours * feePerCredit));
            System.out.println("  ─────────────────────────────────────────────");
            System.out.println("  Total:               RM " + totalFees);
            System.out.println("╚═══════════════════════════════════════════════╝");
            
            // Display semester type indicator
            System.out.println();
            if (semesterNo == 1) {
                System.out.println("  📚 First Semester Student");
            } else {
                System.out.println("  📚 Continuing Student (Semester " + semesterNo + ")");
            }
            
            System.out.println("\n  🎓 Good luck with your studies at UPM! 🎓");
        }
        
        input.close();
    }
}
