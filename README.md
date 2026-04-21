## PROJECT DESCRIPTION
SmartPay Utility Biller is a Core Java console-based application developed to calculate electricity or water bills based on units consumed. It uses a menu-driven approach to allow users to generate multiple bills and provides a formatted digital receipt. The system also ensures proper validation using custom exception handling to avoid incorrect meter readings.
## BILLING LOGIC
For first 100 units - $1 per unit, 
For units between 101–300 - $2 per unit, 
For units above 300 - $5 per unit, 
After calculating total, an additional 10% tax is applied

## KEY FEATURES
- Menu-driven console application
- Supports multiple bill generation in a single run
- Progressive slab-based billing system
- Prevents invalid inputs (negative or incorrect readings)
- Re-prompts user until valid input is entered
- Generates clean and formatted digital receipt

## TECHNOLOGIES USED
- Core Java
- OOP concepts: Interface, Classes, Encapsulation
- Exception Handling (Custom Exception)

## HOW TO RUN
- Compile all Java files:
  javac *.java
- Run the main class:
  java SmartPayBiller

## SAMPLE OUTPUT
<img width="1268" height="749" alt="Screenshot 2026-04-21 172804" src="https://github.com/user-attachments/assets/72113caa-4c0b-4f1a-8895-28e23e334053" />
 
## AUTHOR
GORTHI SANTHOSHI

