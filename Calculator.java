import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mathOperation;
        int number1, number2, result;

        System.out.println("Calculator");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        System.out.print("Please select your mathmatic opration:");
        mathOperation = input.nextInt();


        System.out.print("enter num 1:");
        number1 = input.nextInt();
        System.out.print("enter num 2:");
        number2 = input.nextInt();

        switch (mathOperation) {
            case 1:
                result = number1 + number2;
                System.out.println("result: " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("result: " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("result: " + result);
                break;
            case 4:
                if (number2 != 0)
                    result = number1 / number2;
                else {
                    System.out.println("0 bar 0 taghsim nemishe");
                    return;
                }
                System.out.println("result: " + result);
                break;
            default:
                System.out.println("invalid input");
        }
    }
}