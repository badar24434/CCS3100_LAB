package LAB3;

import java.util.Scanner;

/**
 * Question 1: Course Grade Calculation (CSC3100)
 * 
 * PAC (Problem, Algorithm, Code):
 * PROBLEM: Calculate the overall grade for CSC3100 course based on weighted components
 * ALGORITHM: 
 *   1. Get matric number from user
 *   2. Get marks for each component (Assessment1, Assessment2, Lab Assignment, Final Exam)
 *   3. Calculate weighted marks for each component
 *   4. Sum up all weighted marks to get total
 *   5. Display the result
 * 
 * IPO (Input, Process, Output):
 * INPUT: 
 *   - Matric number
 *   - Assessment 1 mark (out of 100)
 *   - Assessment 2 mark (out of 100)
 *   - Lab Assignment mark (out of 100)
 *   - Final Exam mark (out of 100)
 * 
 * PROCESS:
 *   - weightedAssessment1 = assessment1 * 0.15
 *   - weightedAssessment2 = assessment2 * 0.20
 *   - weightedLab = labAssignment * 0.35
 *   - weightedFinal = finalExam * 0.30
 *   - totalMark = sum of all weighted marks
 * 
 * OUTPUT:
 *   - Display matric number
 *   - Display total mark with breakdown of weighted components
 * 
 * FLOWCHART:
 *   START
 *     |
 *     v
 *   Input Matric Number
 *     |
 *     v
 *   Input Assessment 1 Mark
 *     |
 *     v
 *   Input Assessment 2 Mark
 *     |
 *     v
 *   Input Lab Assignment Mark
 *     |
 *     v
 *   Input Final Exam Mark
 *     |
 *     v
 *   Calculate Weighted Marks:
 *     - weightedAssessment1 = assessment1 * 0.15
 *     - weightedAssessment2 = assessment2 * 0.20
 *     - weightedLab = labAssignment * 0.35
 *     - weightedFinal = finalExam * 0.30
 *     |
 *     v
 *   Calculate Total:
 *     totalMark = weightedAssessment1 + weightedAssessment2 + weightedLab + weightedFinal
 *     |
 *     v
 *   Display Results
 *     |
 *     v
 *   END
 */
public class Q1_CourseGradeCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input matric number
        System.out.print("Matric: ");
        String matric = input.nextLine();
        
        // Input marks for each component
        System.out.print("Enter mark for Assessment1: ");
        double assessment1 = input.nextDouble();
        
        System.out.print("Enter mark for Assessment2: ");
        double assessment2 = input.nextDouble();
        
        System.out.print("Enter mark for Lab Assignment: ");
        double labAssignment = input.nextDouble();
        
        System.out.print("Enter your Final Exam mark: ");
        double finalExam = input.nextDouble();
        
        // Calculate weighted marks
        double weightedAssessment1 = assessment1 * 0.15;
        double weightedAssessment2 = assessment2 * 0.20;
        double weightedLab = labAssignment * 0.35;
        double weightedFinal = finalExam * 0.30;
        
        // Calculate total mark
        double totalMark = weightedAssessment1 + weightedAssessment2 + weightedLab + weightedFinal;
        
        // Display result
        System.out.printf("Your total mark for CSC3100 (%.2f+%.2f+%.2f+%.2f) is %.1f%n",
                weightedAssessment1, weightedAssessment2, weightedLab, weightedFinal, totalMark);
        
        input.close();
    }
}
