import java.util.Scanner;

public class Q2_PasswordValidation {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        // Accept first string
        System.out.print("Enter first string: ");
        String firstString = input.nextLine();
        
       
        
        System.out.println();
        // Accept second string
        System.out.print("Enter second string: ");
        String secondString = input.nextLine();
        
        // Transform second string to uppercase
        String upperSecondString = secondString.toUpperCase();

        // Combine strings with space separator
        String newString = upperSecondString + " " + firstString;
        
        System.out.println();
        System.out.println("New string : " + newString);
        
        input.close();

    }
}
