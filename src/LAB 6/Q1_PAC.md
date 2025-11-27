# Lab 6 - Zoo Negara Entrance Ticket Payment System

## Problem Analysis Chart (PAC)

### Input:
- Nationality (M - Malaysian, F - Foreigner)
- For Foreigners: Classification (I - I-Kad/Working Permit/Dependent Pass, E - ASEAN, O - Others)
- Visitor Category (A - Adult, C - Children, S - Senior)
- Number of tickets
- Continue options (Y/N for more tickets and another visitor)

### Process:
1. Initialize receipt total to 0
2. Loop for processing visitors (outer loop):
   - Display visitor header
   - Initialize ticket total to 0
   - Loop for buying tickets (inner loop):
     - Get nationality input
     - If foreigner, get classification
     - Get visitor category
     - Get number of tickets
     - Calculate ticket price based on pricing table
     - Add to ticket total
     - Display current total
     - Ask if user wants to buy more tickets
   - Display receipt total
   - Ask if user wants to process another visitor
3. Display application finish message

### Output:
- Total price for each ticket category purchase
- Total payment for receipt
- Application finish message

---

## Pseudocode

```
START

DECLARE variables:
    nationality, classification, category, continueTicket, continueVisitor
    numTickets, ticketPrice, ticketTotal, receiptTotal

DO
    DISPLAY "******VISITOR*******"
    SET receiptTotal = 0
    
    DO
        DISPLAY "Enter nationality:"
        INPUT nationality
        
        IF nationality == 'F' OR nationality == 'f' THEN
            DISPLAY "Enter classification (I- Kad/Working Permit/Dependent Pass, E- Asean, O- Others):"
            INPUT classification
        END IF
        
        DISPLAY "Choose category of visitor (A- Adult, C - Children, S - Senior):"
        INPUT category
        
        DISPLAY "Number of tickets:"
        INPUT numTickets
        
        // Determine ticket price based on nationality, classification, and category
        IF nationality == 'M' OR nationality == 'm' THEN
            IF category == 'A' OR category == 'a' THEN
                ticketPrice = 43.00
            ELSE IF category == 'C' OR category == 'c' THEN
                ticketPrice = 16.00
            ELSE IF category == 'S' OR category == 's' THEN
                ticketPrice = 21.00
            END IF
        ELSE IF nationality == 'F' OR nationality == 'f' THEN
            IF classification == 'I' OR classification == 'i' THEN
                IF category == 'A' OR category == 'a' THEN
                    ticketPrice = 50.00
                ELSE IF category == 'C' OR category == 'c' THEN
                    ticketPrice = 25.00
                ELSE IF category == 'S' OR category == 's' THEN
                    ticketPrice = 50.00
                END IF
            ELSE IF classification == 'E' OR classification == 'e' THEN
                IF category == 'A' OR category == 'a' THEN
                    ticketPrice = 61.00
                ELSE IF category == 'C' OR category == 'c' THEN
                    ticketPrice = 33.00
                ELSE IF category == 'S' OR category == 's' THEN
                    ticketPrice = 61.00
                END IF
            ELSE IF classification == 'O' OR classification == 'o' THEN
                IF category == 'A' OR category == 'a' THEN
                    ticketPrice = 82.00
                ELSE IF category == 'C' OR category == 'c' THEN
                    ticketPrice = 43.00
                ELSE IF category == 'S' OR category == 's' THEN
                    ticketPrice = 82.00
                END IF
            END IF
        END IF
        
        ticketTotal = ticketPrice * numTickets
        receiptTotal = receiptTotal + ticketTotal
        
        DISPLAY "Total is RM" + ticketTotal
        
        DISPLAY "Buy more ticket (Y/N)?:"
        INPUT continueTicket
        
    WHILE continueTicket == 'Y' OR continueTicket == 'y'
    
    DISPLAY "The total payment for receipt is RM" + receiptTotal
    
    DISPLAY "Process another visitor (Y/N)?:"
    INPUT continueVisitor
    
WHILE continueVisitor == 'Y' OR continueVisitor == 'y'

DISPLAY "Application finish."

END
```

---

## Algorithm

1. **Start the application**

2. **Outer Loop - Process Multiple Visitors:**
   - Display visitor header
   - Initialize receipt total to 0
   
3. **Inner Loop - Process Multiple Tickets per Visitor:**
   - Prompt and read nationality
   - If foreigner, prompt and read classification (I-Kad, ASEAN, Others)
   - Prompt and read visitor category (Adult, Children, Senior)
   - Prompt and read number of tickets
   
4. **Calculate Ticket Price:**
   - Use nested if-else statements to determine price based on:
     - Malaysian prices: Adult (RM43), Children (RM16), Senior (RM21)
     - Foreigner I-Kad/WP/DP: Adult (RM50), Children (RM25), Senior (RM50)
     - Foreigner ASEAN: Adult (RM61), Children (RM33), Senior (RM61)
     - Foreigner Others: Adult (RM82), Children (RM43), Senior (RM82)
   
5. **Calculate and Display Current Total:**
   - Multiply ticket price by number of tickets
   - Add to receipt total
   - Display current ticket total
   
6. **Check for More Tickets:**
   - Ask if user wants to buy more tickets
   - If yes, repeat inner loop
   - If no, proceed to display receipt
   
7. **Display Receipt Total:**
   - Show the total payment for the current receipt
   
8. **Check for Another Visitor:**
   - Ask if user wants to process another visitor
   - If yes, repeat outer loop
   - If no, proceed to exit
   
9. **Display Exit Message and End Application**

---

## Flowchart Description

The flowchart would include:

1. **Start** (Terminal symbol)
2. **Outer Loop Start** - Process Visitor (Decision diamond)
3. **Display Visitor Header** (Process rectangle)
4. **Initialize Receipt Total** (Process rectangle)
5. **Inner Loop Start** - Buy More Tickets (Decision diamond)
6. **Input Nationality** (Input/Output parallelogram)
7. **Decision: Is Foreigner?** (Decision diamond)
8. **Input Classification** (Input/Output parallelogram) - if foreigner
9. **Input Visitor Category** (Input/Output parallelogram)
10. **Input Number of Tickets** (Input/Output parallelogram)
11. **Calculate Price** (Process rectangle with nested conditions)
12. **Calculate Ticket Total** (Process rectangle)
13. **Update Receipt Total** (Process rectangle)
14. **Display Ticket Total** (Input/Output parallelogram)
15. **Decision: Buy More Tickets?** (Decision diamond)
    - Yes → Loop back to step 6
    - No → Continue to step 16
16. **Display Receipt Total** (Input/Output parallelogram)
17. **Decision: Process Another Visitor?** (Decision diamond)
    - Yes → Loop back to step 3
    - No → Continue to step 18
18. **Display "Application finish"** (Input/Output parallelogram)
19. **End** (Terminal symbol)

---

## Pricing Table Reference

| Category | Malaysian | I-Kad/WP/DP | ASEAN | Others |
|----------|-----------|-------------|-------|--------|
| Adult    | RM 43.00  | RM 50.00    | RM 61.00 | RM 82.00 |
| Children | RM 16.00  | RM 25.00    | RM 33.00 | RM 43.00 |
| Senior   | RM 21.00  | RM 50.00    | RM 61.00 | RM 82.00 |
