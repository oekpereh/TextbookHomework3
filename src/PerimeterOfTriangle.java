/**
 * @Class: PerimeterOfTriangle
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 9, 2023
 * This program will calculate the perimeter of the triangle if the input is valid, otherwise it prints invalid.
 * In this program, I will declare variables: edge1, edge2, edge3, PerimeterOfTriangle.
 */


import java.util.Scanner;
public class PerimeterOfTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 edges of a triangle.");
        System.out.print("Edge 1: ");

        double edge1 = input.nextDouble();
        System.out.print("Edge 2: ");

        double edge2 = input.nextDouble();
        System.out.print("Edge 3: ");

        double edge3 = input.nextDouble();
        if (edge1 < edge2 + edge3 && edge2 < edge1 + edge3 && edge3 < edge1 + edge2) {
            double PERIMETER_OF_TRIANGLE = edge1 + edge2 + edge3;
            System.out.println("Perimeter of triangle = " + PERIMETER_OF_TRIANGLE);
        } else
            System.out.println("The input is invalid.");
    }
}
