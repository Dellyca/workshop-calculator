package se.lexicon;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Calculator application!");
        double result = 0;
        char exit = 'y';

        while (exit == 'y') {

            Scanner scannerObject = new Scanner(System.in);

            //Operation
            System.out.println("Enter the operation of your choise 1 Add, 2 Subtract, 3 Multiply, 4 Divide");
            int operation = scannerObject.nextInt();

            //First number
            System.out.println("Enter first number : ");
            double number1 = scannerObject.nextDouble();

            //Second number
            System.out.println("Enter second number : ");
            double number2 = scannerObject.nextDouble();


            switch (operation) {
                case 1:
                    result = number1 + number2;
                    System.out.println("Sum = " + result);
                    break;
                case 2:
                    result = number1 - number2;
                    System.out.println("Difference = " + result);
                    break;
                case 3:
                    result = number1 * number2;
                    System.out.println("Multiply = " + result);
                    break;
                case 4:
                    result = number1 / number2;
                    System.out.println("Division Result = " + result);
                    break;

                default:
                    System.out.println(operation + "is not supported");

            }

            System.out.println("result");



        System.out.println("Do you want to proceed? y/n");
        exit = scannerObject.next().charAt(0);
        }
    }
}
