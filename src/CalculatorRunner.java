import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String myExpression = scan.nextLine();
        if (myExpression.indexOf("*") != -1){
            int myIndex = myExpression.indexOf("*");
            double firstNum = Double.parseDouble(myExpression.substring(0, myIndex-1));
            double secondNum = Double.parseDouble(myExpression.substring(myIndex +2));
            Calculator myCalculation = new Calculator(firstNum, secondNum);
            if (myCalculation.multiplication() % 1 == 0){
                System.out.println((int)myCalculation.multiplication());
            }
            else{
                System.out.println(myCalculation.multiplication());
            }

        }
        else if(myExpression.indexOf("/") != -1){
            int myIndex = myExpression.indexOf("/");
            double firstNum = Double.parseDouble(myExpression.substring(0, myIndex));
            double secondNum = Double.parseDouble(myExpression.substring(myIndex +1));
            Calculator myCalculation = new Calculator(firstNum, secondNum);
            if (myCalculation.division() % 1 == 0){
                System.out.println((int)myCalculation.division());
            }
            else{
                System.out.println(myCalculation.division());
            }
        }
        else if (myExpression.indexOf("+") != -1){
            int myIndex = myExpression.indexOf("+");
            double firstNum = Double.parseDouble(myExpression.substring(0, myIndex));
            double secondNum = Double.parseDouble(myExpression.substring(myIndex +1));
            Calculator myCalculation = new Calculator(firstNum, secondNum);
            if (myCalculation.addition() % 1 == 0){
                System.out.println((int)myCalculation.addition());
            }
            else{
                System.out.println(myCalculation.addition());
            }
        }
        else if (myExpression.indexOf("-") != -1){
            int myIndex = myExpression.indexOf("-");
            double firstNum = Double.parseDouble(myExpression.substring(0, myIndex));
            double secondNum = Double.parseDouble(myExpression.substring(myIndex +1));
            Calculator myCalculation = new Calculator(firstNum, secondNum);
            if (myCalculation.subtraction() % 1 == 0){
                System.out.println((int)myCalculation.subtraction());
            }
            else{
                System.out.println(myCalculation.subtraction());
            }
        }
        else if (myExpression.indexOf("%") != -1){
            int myIndex = myExpression.indexOf("%");
            double firstNum = Double.parseDouble(myExpression.substring(0, myIndex));
            double secondNum = Double.parseDouble(myExpression.substring(myIndex +1));
            Calculator myCalculation = new Calculator(firstNum, secondNum);
            if (myCalculation.remainder() % 1 == 0){
                System.out.println((int)myCalculation.remainder());
            }
            else{
                System.out.println(myCalculation.remainder());
            }
        }
        else if (myExpression.indexOf("^") != -1){
            int myIndex = myExpression.indexOf("^");
            double firstNum = Double.parseDouble(myExpression.substring(0, myIndex));
            double secondNum = Double.parseDouble(myExpression.substring(myIndex +1));
            Calculator myCalculation = new Calculator(firstNum, secondNum);
            if (myCalculation.exponent() % 1 == 0){
                System.out.println((int)myCalculation.exponent());
            }
            else{
                System.out.println(myCalculation.exponent());
            }
        }
    }
}
