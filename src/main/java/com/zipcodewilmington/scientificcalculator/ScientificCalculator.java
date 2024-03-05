package com.zipcodewilmington.scientificcalculator;

    }


    import java.util.Scanner;
public class ScientificCalculator {
    static Scanner scanner = new Scanner(System.in);
    //calculate Sin //unit in radians, not degrees

     double input = scanner.nextDouble(); /**
    Conditional statement to catch user error
    RESEARCH*/
     
} //calculate cos public void cos(){ System.out.println(“Input a number to be converted to cosine”); double input = scanner.nextDouble(); System.out.println(input + ” to cosine is: ” + Math.cos(input)); } public double tan(double input){ return Math.tan(input); } // inverse Sine public double asine(double input){ return Math.asin(input); } //inverse Tangent public double atan(double input){ return Math.atan(input); } //inverse Cosine public double acos(double input){ return Math.acos(input); } public double convertDegreeToRadian() { return -1; } public static void main(String[] args) { sine(); }  }


}
