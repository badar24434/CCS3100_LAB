package LAB3;
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
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input the student details and marks
        System.out.print("Enter Matric Number: ");
        String matricNumber = input.nextLine();


        //input marks for each assessment component
        System.out.print("Enter Assessment 1 Mark (out of 100): ");
        double assessment1 = input.nextDouble();

        System.out.print("Enter Assessment 2 Mark (out of 100): ");
        double assessment2 = input.nextDouble();

        System.out.print("Enter Lab Assignment Mark (out of 100): ");
        double labAssignment = input.nextDouble();

        System.out.print("Enter Final Exam Mark (out of 100): ");
        double finalExam = input.nextDouble();

        // calculate weighted marks
        double weightedAssessment1 = assessment1 * 0.15;
        double weightedAssessment2 = assessment2 * 0.20;
        double weightedLab = labAssignment * 0.35;
        double weightedFinal = finalExam * 0.30;

    
}
