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

    }
}
