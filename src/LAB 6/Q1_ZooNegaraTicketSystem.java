
// MUHAMAD BADAR MIQDAD BIN MD NASIR
// MATRIC NO: 215625
// LAB 6
import java.util.Scanner;

public class Q1_ZooNegaraTicketSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables declaration
        char nationality, classification, category;
        char continueTicket, continueVisitor;
        int numTickets;
        double ticketPrice, ticketTotal, receiptTotal;
        
        System.out.println("ZOO NEGARA ENTRANCE TICKET PAYMENT SYSTEM\n");
        
        // Outer loop - Process multiple visitors
        do {
            System.out.println("******VISITOR*******\n");
            receiptTotal = 0.0;
            
            // Inner loop - Process multiple tickets per visitor
            do {
                // Get nationality
                System.out.print("Enter nationality: ");
                nationality = scanner.next().charAt(0);
                
                // Initialize classification
                classification = ' ';
                
                // If foreigner, get classification
                if (nationality == 'F' || nationality == 'f') {
                    System.out.print("Enter classification\n(I- Kad/Working Permit/Dependent Pass, E- Asean, O- Others): ");
                    classification = scanner.next().charAt(0);
                }
                
                // Get visitor category
                System.out.print("Choose category of visitor\n(A- Adult, C - Children, S - Senior): ");
                category = scanner.next().charAt(0);
                
                // Get number of tickets
                System.out.print("Number of tickets: ");
                numTickets = scanner.nextInt();
                
                // Calculate ticket price based on nationality, classification, and category
                ticketPrice = 0.0;
                
                if (nationality == 'M' || nationality == 'm') {
                    // Malaysian pricing
                    if (category == 'A' || category == 'a') {
                        ticketPrice = 43.00;
                    } else if (category == 'C' || category == 'c') {
                        ticketPrice = 16.00;
                    } else if (category == 'S' || category == 's') {
                        ticketPrice = 21.00;
                    }
                } 
                
                // Calculate total for current ticket purchase
                ticketTotal = ticketPrice * numTickets;
                receiptTotal += ticketTotal;
                
                // Display ticket total
                System.out.printf("Total is RM %.2f\n", ticketTotal);
                
                // Ask if user wants to buy more tickets
                System.out.print("\nBuy more ticket (Y/N)?: ");
                continueTicket = scanner.next().charAt(0);
                System.out.println();
                
            } while (continueTicket == 'Y' || continueTicket == 'y');
            
            // Display receipt total
            System.out.printf("The total payment for receipt is RM%.2f\n", receiptTotal);
            
            // Ask if user wants to process another visitor
            System.out.print("\nProcess another visitor (Y/N)?: ");
            continueVisitor = scanner.next().charAt(0);
            System.out.println();
            
        } while (continueVisitor == 'Y' || continueVisitor == 'y');
        
        // Display exit message
        System.out.println("Application finish.");
        
        // Close scanner
        scanner.close();
    }
}
