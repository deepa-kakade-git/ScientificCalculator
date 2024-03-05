package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calculator {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        double result;


            System.out.println("Enter the operation");
            String operation = scanner.next();


        switch (operation) {
            case "s": {

                System.out.println("Enter the number: ");
                double Number = scanner.nextDouble();
                result = toTheSecondPower(Number);


                break;
            }
            case "exp": {

                System.out.println("Enter the Number");
                double Number = scanner.nextDouble();
                double inverse = 1 / Number;
                result = inverse;

                break;
            }
            case "Sqr": {
                System.out.println("Enter the Number1:");
                double Number1 = scanner.nextDouble();
                System.out.println("Enter the Number2:");
                double Number2 = scanner.nextDouble();
                result = Math.pow(Number1, Number2);

                break;
            }
            case "exponent": {
                System.out.println("Enter the Number1");
                double Number1 = scanner.nextDouble();
                System.out.println("Enter the Number2");
                double Number2 = scanner.nextDouble();
                result = Math.pow(Number1, Number2);


                break;
            }
            case "switchsign": {
                System.out.println("Enter the Number");
                double Number = scanner.nextDouble();
                double Switchsign = -1 * (Number);
                result = Switchsign;

                break;
            }
            default: {

                System.out.println("Enter the First Number: ");
                double Number1 = scanner.nextDouble();
                System.out.println("Enter the Second Number: ");
                double Number2 = scanner.nextDouble();


                switch (operation) {
                    case "+":
                        System.out.println(calculateAddition(Number1,Number2));
                        break;

                    case "-":
                        result = Number1 - Number2;
                        break;

                    case "*":
                        result = Number1 * Number2;
                        break;

                    case "/":
                        if (Number2 != 0) {
                            result = Number1 / Number2;
                            break;
                        } else

                            System.out.println("Error: Division by Zero");


                    case "%":
                        result = Number1 % Number2;
                        break;

                    default:
                        System.out.println("Error: Invalid Operator");
                        return;

                }

                break;
            }
        }
            System.out.println("Result: " + result);


    }

    public double toTheSecondPower(double userInput){

        double answer = Math.pow(userInput,2);
        return answer;
//        System.out.println("Enter the number: ");
//        double Number = scanner.nextDouble();
//        result = Math.pow(Number, 2);
    };

    public double calculateSquare(double number) {
        return Math.pow(number, 2);

    }
    public double calculateSquareRoot(double number1) {
        return Math.sqrt(number1);
    }

    public double calculateAddition(double number1, double number2){
        double total = number1 + number2;
        return total;

    }
    public double calculateSubtraction(double number1, double number2){
        double result = number1 - number2;
        return result ;
    }

    public double calculateMultiplication(double number1, double number2){
        double result = number1 * number2;
        return result ;
    }

    public double calculateDivision(double number1, double number2) {
        double result = number1 / number2 ;
        return result;
    }
}
