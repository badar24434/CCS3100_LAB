import java.util.Scanner;

public class Q1_StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Accept first string
        System.out.print("Enter first String : ");
        String firstString = input.nextLine();
        
        // Check length and display substring if exceeds 10
        if (firstString.length() > 10) {
            String substring = firstString.substring(4, 10);
            System.out.println("Substring from 5 to 10 : " + substring);
        } else {
            System.out.println("String length less than 10");
        }
        
        System.out.println();
        // Accept second string
        System.out.print("Enter second String : ");
        String secondString = input.nextLine();
        
        // Check if second string exists in first string
        if (firstString.indexOf(secondString) != -1) {
            System.out.println("Second String exists in First String");
            System.out.println();
            
            // Replace second string with "-replaced-"
            String newFirstString = firstString.replace(secondString, "-replaced-");
            System.out.println("New first String : " + newFirstString);
        } 
    }
}
