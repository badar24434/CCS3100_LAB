package LAB3;

import java.util.Scanner;

/**
 * Question 2: Payment Receipt Generation
 *
 * PAC (Problem, Algorithm, Code):
 * PROBLEM: Generate a payment receipt for two items with government tax and service charge
 * ALGORITHM:
 *   1. Get item 1 details (name, quantity, unit price)
 *   2. Get item 2 details (name, quantity, unit price)
 *   3. Calculate amount for each item (quantity * unit price)
 *   4. Calculate subtotal (sum of both amounts)
 *   5. Calculate government tax (6% of subtotal)
 *   6. Calculate service charge (10% of subtotal)
 *   7. Calculate total (subtotal + tax + service charge)
 *   8. Display formatted receipt
 *
 * IPO (Input, Process, Output):
 * INPUT:
 *   - Item 1 name
 *   - Item 1 quantity
 *   - Item 1 unit price
 *   - Item 2 name
 *   - Item 2 quantity
 *   - Item 2 unit price
 *
 * PROCESS:
 *   - amount1 = quantity1 * unitPrice1
 *   - amount2 = quantity2 * unitPrice2
 *   - subtotal = amount1 + amount2
 *   - governmentTax = subtotal * 0.06
 *   - serviceCharge = subtotal * 0.10
 *   - total = subtotal + governmentTax + serviceCharge
 *
 * OUTPUT:
 *   - Formatted receipt showing:
 *     * Item details with amounts
 *     * Subtotal
 *     * Government Tax
 *     * Service Charge
 *     * Total amount
 *
 * FLOWCHART:
 *   START
 *     |
 *     v
 *   Input Item 1 Name
 *     |
 *     v
 *   Input Item 1 Quantity
 *     |
 *     v
 *   Input Item 1 Unit Price
 *     |
 *     v
 *   Input Item 2 Name
 *     |
 *     v
 *   Input Item 2 Quantity
 *     |
 *     v
 *   Input Item 2 Unit Price
 *     |
 *     v
 *   Calculate:
 *     - amount1 = quantity1 * unitPrice1
 *     - amount2 = quantity2 * unitPrice2
 *     - subtotal = amount1 + amount2
 *     - governmentTax = subtotal * 0.06
 *     - serviceCharge = subtotal * 0.10
 *     - total = subtotal + governmentTax + serviceCharge
 *     |
 *     v
 *   Display Receipt (formatted output)
 *     |
 *     v
 *   END
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    }
}