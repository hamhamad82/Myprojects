
package calc;

import java.util.Scanner;
public class Calc {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter the operation(+,-,*,/); ");
      String operation = input.nextLine().trim();
      String[] parts = new String[2];
      char operator = ' ';
      if(operation.contains("+")){ parts = operation.split("\\+");operator = '+'; }
      else if(operation.contains("-")){parts = operation.split("-");operator = '-';}
      else if(operation.contains("*")){parts = operation.split("\\*");operator = '*';}
      else if(operation.contains("/")){parts = operation.split("/");operator = '/';}
      else {System.out.println("invalid input");}
      
      double result = 0;
      double num1 = Double.parseDouble(parts[0].trim());
      double num2 = Double.parseDouble(parts[1].trim());
      
      switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                result = num1 / num2;
                break;
    }   
        System.out.println("Result:"+ result);
} 
}