/*Use Case 2 :- As a fan of geometry, I want to check equality of two lines based on the end points,
   So that I know when two lines are the equal.
 - Using Java equals method to check equality of 2 Lengths is preferable.*/
package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {

        System.out.println("""
                Welcome to Line
                Comparison Computation
                Program!""");

        Scanner scanner = new Scanner(System.in);

        // input co=ordinate of line 1
        System.out.println("Enter the value of X1 in line 1 : ");
        double x1 = scanner.nextDouble();
        System.out.println("Enter the value of Y1 in line 1 : ");
        double y1 = scanner.nextDouble();
        System.out.println("Enter the value of X2 in line 1 : ");
        double x2 = scanner.nextDouble();
        System.out.println("Enter the value of Y2 in line 1 : ");
        double y2 = scanner.nextDouble();

        // input co=ordinate of line 2
        System.out.println("Enter the value of a1 in line 2 : ");
        double a1 = scanner.nextDouble();
        System.out.println("Enter the value of b1 in line 2 : ");
        double b1 = scanner.nextDouble();
        System.out.println("Enter the value of a2 in line 2 : ");
        double a2 = scanner.nextDouble();
        System.out.println("Enter the value of b2 in line 2 : ");
        double b2 = scanner.nextDouble();

        Double length1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("The length of line 1 is : " + length1);

        Double length2 = Math.sqrt(Math.pow((a2 - a1),2) + Math.pow((b2 - b1),2));
        System.out.println("The length of line 2 is : " + length2);

//        Using Java equals method to check equality of 2 Lengths
        if (length1.equals(length2)) System.out.println("Both lines are equal");

        else System.out.println("Both lines are not equal");
    }
}