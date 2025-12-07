import java.util.Scanner;

public class Q1_StringManipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Accept first string
        System.out.print("Enter first String : ");
        String firstString = input.nextLine();
        
        
        
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
        else {
            System.out.println("Second String does not exist in First String");
        }
        
        input.close();

    }
}
