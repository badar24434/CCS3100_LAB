package LAB2;
import java.util.Scanner;

public class EXAMPLE2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // read text
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // read integer
        System.out.print("Enter your height in meters (e.g., 1.75): ");
        double height = scanner.nextDouble(); // read decimal number
    }
}
