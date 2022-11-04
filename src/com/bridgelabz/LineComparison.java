/*Use Case 4 :- As a fan of geometry, I want to check compare two lines based on the end points, So that I know
one line is equal, greater or less than the other line.
- Using Java compareTo method to compare 2 Lengths is preferable.
 - Using Java equals method to check equality of 2 Lengths is preferable.
 -Using OOPS concept*/
package com.bridgelabz;

import java.util.Scanner;

class Calculation{
    public static Double length(double x1, double y1, double x2, double y2){
        Double length = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        return length;
    }
}

public class LineComparison extends Calculation{
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

        Double length1 = length(x1, y1, x2, y2);
        System.out.println("The length of line 1 is : " + length1);

        Double length2 = length(a1, b1, a2, b2);
        System.out.println("The length of line 2 is : " + length2);

//        Using Java equals method to check equality of 2 Lengths
        if (length1.equals(length2)) System.out.println("Both lines are equal");

        else System.out.println("Both lines are not equal");

//        - Using Java compareTo method to compare 2 Lengths
        int res = length1.compareTo(length2);
        if (res == 0) {
            System.out.println("line 1 and line 2 are equal in length");
        } else if (res > 0) {
            System.out.println("Line 1 is greater in length than line 2");
        } else {
            System.out.println("Line 1 is lesser  in length than line 2");
        }
    }
}