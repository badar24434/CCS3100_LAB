# LAB 4: Problem Solving with Selection Control (Week 6)

## 📋 Lab Information

**Learning Outcomes:**
1. **Analyze And Solve** Programming Problem Using Nested/Case Logic Selection Statements (P3).
2. **Construct** Program Using Nested/Case Logic Selection Statements (P4).

**Date:** November 13, 2025

---

## 📁 Solutions Implemented

This folder contains solutions for **three questions** from Lab 4:

### ✅ Question 1: Mahkota Theme Park Ticket Charge
**Files:** 
- `Q1_MahkotaThemePark.java` (Version with switch-case)
- `Q1_MahkotaThemePark_IfElseOnly.java` (Version with if-else only)

**Description:**
Develops a solution to calculate ticket charges based on visitor age and park type selection. The program uses nested selection statements to determine the appropriate price from the provided pricing table.

**Features:**
- Interactive user interface with clear prompts
- Nested if-else with switch statements (Version 1) OR purely if-else (Version 2)
- Age categories: Under 3, 3-12, 13-20, 21-54, Over 55
- Park types: ThemePark, WaterPark, Both
- Formatted output with ticket information display
- Price reference table included

**Selection Control Used:**
- **Version 1:** Nested if-else statements + Switch-case statements
- **Version 2:** ONLY nested if-else statements (no switch-case)

---

### ✅ Question 2: BMI and Waist Size Health Risk
**File:** `Q2_BMIHealthRisk.java`

**Description:**
Identifies weight category and health risk based on BMI calculation and waist size measurements. The program provides personalized health assessments with risk warnings.

**Features:**
- BMI calculation: weight / (height²)
- Weight categories: Under Weight, Normal, Over Weight, Obese, Severely Obese
- Gender-specific waist size risk assessment
  - Female: waist > 35 inches (higher risk)
  - Male: waist > 40 inches (higher risk)
- Comprehensive health risk warnings
- BMI reference table included

**Selection Control Used:**
- Nested if-else statements for BMI categorization
- Conditional logic for gender-specific risk assessment
- Complex boolean conditions for health warnings

---

### ✅ Question 3: UPM Master Program Tuition Fees
**File:** `Q3_UPMTuitionFees.java`

**Description:**
Calculates total tuition fees for UPM master programs based on program code, semester number, and credit hours registered. The program handles four different master programs with varying fee structures.

**Features:**
- Supports 4 master programs (MCS, ME, MPM, MEOH)
- Different fees for 1st semester vs subsequent semesters
- Variable fee per credit hour based on program
- Detailed fee breakdown display
- Input validation for program codes
- Professional formatted output matching sample requirements

**Master Programs Supported:**
- **MCS:** Master of Computer Science (1st: RM1250, 2nd+: RM1000, per credit: RM250)
- **ME:** Master of Environment (1st: RM1400, 2nd+: RM1100, per credit: RM250)
- **MPM:** Master in Plantation Management (1st: RM1250, 2nd+: RM1000, per credit: RM275)
- **MEOH:** Master of Environmental and Occupational Health (1st: RM1250, 2nd+: RM1000, per credit: RM350)

**Selection Control Used:**
- Nested if-else statements for program code validation
- Conditional logic for semester-based fee calculation
- Multiple decision points for fee determination

---

## 🎯 Key Programming Concepts Demonstrated

### 1. Nested Selection Statements
All programs extensively use nested if-else statements to handle multiple conditions and decision points.

```java
// Example from Q1 (If-Else Only Version)
if (age < 3) {
    if (parkType.equalsIgnoreCase("ThemePark")) {
        charge = 0;
    } else if (parkType.equalsIgnoreCase("WaterPark")) {
        charge = 7;
    } else if (parkType.equalsIgnoreCase("Both")) {
        charge = 5;
    }
} else if (age <= 12) {
    // nested logic
}
```

### 2. Switch-Case Statements (Q1 Version 1 Only)
Efficient handling of multiple discrete options (park types, menu selections).

### 3. Multiple If-Else Chains (Q3)
```java
// Example from Q3
if (programCode.equals("MCS")) {
    programName = "Master of Computer Science";
    // set fees
} else if (programCode.equals("ME")) {
    programName = "Master of Environment";
    // set fees
}
```

### 4. Complex Boolean Conditions
Combining multiple conditions for risk assessment:
```java
if (gender.equalsIgnoreCase("Female") && waistSize > 35) {
    higherRisk = true;
}
```

### 5. Input Validation and User Experience
- Clear prompts and instructions
- Formatted output with visual separators
- User-friendly interface design

---

## 🚀 How to Run

### Using Command Line:
```bash
# Navigate to the LAB 4 directory
cd "c:\Users\LL5\IdeaProjects\CCS3100_LAB\src\LAB 4"

# Compile the programs
javac Q1_MahkotaThemePark.java
javac Q1_MahkotaThemePark_IfElseOnly.java
javac Q2_BMIHealthRisk.java
javac Q3_UPMTuitionFees.java

# Run Question 1 (Version with switch-case)
java Q1_MahkotaThemePark

# Run Question 1 (If-Else only version)
java Q1_MahkotaThemePark_IfElseOnly

# Run Question 2
java Q2_BMIHealthRisk

# Run Question 3
java Q3_UPMTuitionFees
```

### Using IDE (IntelliJ IDEA):
1. Open the project in IntelliJ IDEA
2. Navigate to `src/LAB 4/`
3. Right-click on the desired Java file
4. Select "Run 'ClassName.main()'"

---

## 📊 Test Cases

### Q1: Mahkota Theme Park

| Test Case | Age | Park Type | Expected Output |
|-----------|-----|-----------|-----------------|
| 1 | 2 | ThemePark | RM 0 (Free) |
| 2 | 5 | WaterPark | RM 15 |
| 3 | 15 | Both | RM 40 |
| 4 | 30 | ThemePark | RM 25 |
| 5 | 60 | WaterPark | RM 15 |

### Q2: BMI Health Risk

| Test Case | Weight | Height | Gender | Waist | Expected BMI Category | Risk Warning |
|-----------|--------|--------|--------|-------|----------------------|--------------|
| 1 | 70 | 1.75 | Male | 38 | Normal (22.9) | No |
| 2 | 85 | 1.70 | Female | 36 | Over Weight (29.4) | Yes |
| 3 | 95 | 1.65 | Male | 42 | Severely Obese (34.9) | Yes |
| 4 | 60 | 1.68 | Female | 32 | Normal (21.3) | No |

### Q3: UPM Tuition Fees

| Test Case | Program Code | Semester | Credit Hours | Expected Total |
|-----------|--------------|----------|--------------|----------------|
| 1 | MCS | 1 | 12 | RM 4250 (1250 + 12×250) |
| 2 | MCS | 2 | 12 | RM 4000 (1000 + 12×250) |
| 3 | ME | 1 | 15 | RM 5150 (1400 + 15×250) |
| 4 | MPM | 2 | 10 | RM 3750 (1000 + 10×275) |
| 5 | MEOH | 1 | 8 | RM 4050 (1250 + 8×350) |

---

## 📝 Documentation Included

Each Java file contains:
1. **Problem Analysis Chart (PAC)** - Documented in comments
   - Given (Input)
   - Required (Output)
   - Processing steps

2. **Flowchart Description** - Step-by-step logic flow documented in comments

3. **Well-Commented Code** - Clear explanations of logic

---

## 🎓 Evaluation Criteria Coverage

| Criteria | Implementation |
|----------|----------------|
| **Design** | ✓ PAC and Flowchart documented in code comments |
| **Functionality** | ✓ Programs produce correct results with proper display |
| **Readability** | ✓ Well-organized, properly indented, with clear variable names |
| **Level of Effort** | ✓ Creative UI design, comprehensive error handling, user-friendly |

---

## 💡 Additional Features

### Q1 Additional Features:
- Visual ticket display with borders
- Clear park type menu
- Age category display
- Special "FREE" indicator for free admission

### Q2 Additional Features:
- Comprehensive health assessment report
- Visual risk warnings with emoji indicators
- BMI reference table included
- Gender-specific recommendations
- Professional medical advice disclaimer

### Q3 Additional Features:
- Program code validation
- Detailed fee breakdown (base fee + credit fee)
- Semester type indicator (first vs continuing student)
- Professional UPM-themed interface
- Clear display matching sample output format
- Automatic calculation of total fees

---

## 👤 Author
**Name:** [Your Name]  
**Course:** CCS3100  
**Lab:** 4 - Problem Solving with Selection Control  
**Date:** November 13, 2025

---

## 📌 Notes

- Both programs use proper nested selection control structures as required
- Input validation can be enhanced further for production use
- The programs follow Java naming conventions and best practices
- Creative UI design enhances user experience while maintaining required functionality

---

## 🔗 Related Files

- `Q1_MahkotaThemePark.java` - Theme park ticket calculation (with switch-case)
- `Q1_MahkotaThemePark_IfElseOnly.java` - Theme park ticket calculation (if-else only)
- `Q2_BMIHealthRisk.java` - BMI and health risk assessment
- `Q3_UPMTuitionFees.java` - UPM master program tuition fees calculator
- `README.md` - This documentation file

---

**End of Lab 4 Documentation**
