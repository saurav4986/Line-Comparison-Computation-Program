/*Use Case 1 As a fan of geometry, I want to model a line based on a point consisting of (x, y) co-ordinates
using the Cartesian system,so that I can calculate its length.
        - A Length as 2 Points (x1, y1) and (x2, y2) - Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2)*/
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

        double length1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("The length of line 1 is : " + length1);
    }
}