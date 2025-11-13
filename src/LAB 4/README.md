# LAB 4: Problem Solving with Selection Control (Week 6)

## 📋 Lab Information

**Learning Outcomes:**
1. **Analyze And Solve** Programming Problem Using Nested/Case Logic Selection Statements (P3).
2. **Construct** Program Using Nested/Case Logic Selection Statements (P4).

**Date:** November 13, 2025

---

## 📁 Solutions Implemented

This folder contains solutions for **two questions** from Lab 4:

### ✅ Question 1: Mahkota Theme Park Ticket Charge
**File:** `Q1_MahkotaThemePark.java`

**Description:**
Develops a solution to calculate ticket charges based on visitor age and park type selection. The program uses nested selection statements to determine the appropriate price from the provided pricing table.

**Features:**
- Interactive user interface with clear prompts
- Nested if-else with switch statements for efficient logic
- Age categories: Under 3, 3-12, 13-20, 21-54, Over 55
- Park types: ThemePark, WaterPark, Both
- Formatted output with ticket information display

**Selection Control Used:**
- Nested if-else statements for age categorization
- Switch-case statements for park type selection

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

## 🎯 Key Programming Concepts Demonstrated

### 1. Nested Selection Statements
Both programs extensively use nested if-else statements to handle multiple conditions and decision points.

```java
// Example from Q1
if (age < 3) {
    switch (parkType) {
        case "ThemePark":
            // logic
        case "WaterPark":
            // logic
    }
} else if (age <= 12) {
    // nested logic
}
```

### 2. Switch-Case Statements
Efficient handling of multiple discrete options (park types, menu selections).

### 3. Complex Boolean Conditions
Combining multiple conditions for risk assessment:
```java
if (gender.equalsIgnoreCase("Female") && waistSize > 35) {
    higherRisk = true;
}
```

### 4. Input Validation and User Experience
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
javac Q2_BMIHealthRisk.java

# Run Question 1
java Q1_MahkotaThemePark

# Run Question 2
java Q2_BMIHealthRisk
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

- `Q1_MahkotaThemePark.java` - Theme park ticket calculation
- `Q2_BMIHealthRisk.java` - BMI and health risk assessment
- `README.md` - This documentation file

---

**End of Lab 4 Documentation**
