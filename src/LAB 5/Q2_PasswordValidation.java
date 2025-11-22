import java.util.Scanner;

public class Q2_PasswordValidation {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        // Accept first string
        System.out.print("Enter first string: ");
        String firstString = input.nextLine();
        
        // Check if length exceeds 8
        if (firstString.length() > 8) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        
        System.out.println();
        // Accept second string
        System.out.print("Enter second string: ");
        String secondString = input.nextLine();
        
        // Transform second string to uppercase
        String upperSecondString = secondString.toUpperCase();

        
    }
}
