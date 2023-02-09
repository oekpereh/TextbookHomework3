/**
 * @Class: BodyMassIndex
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 9, 2023
 * This program will compute and interpret the Body Mass Index(BMI).
 * The program will prompt the user to enter his/her weight in pounds
 * and his/her height in inches.
 * In this program, I will declare variables: weight, height, KiloToPound, MetersToInches, WeightInKilo,
 * HeightInMeters, BMI.
 */


import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");//taking input from user
        double weight = input.nextDouble();

        System.out.print("Enter your height in inches: ");//taking input from user
        double height = input.nextDouble();

        double KILO_TO_POUND = 0.4536;
        double METERS_TO_INCHES = 0.0254;
        double WEIGHT_IN_KILO = weight * KILO_TO_POUND;
        double HEIGHT_IN_METERS = height * METERS_TO_INCHES;

        double BMI = WEIGHT_IN_KILO / (HEIGHT_IN_METERS * HEIGHT_IN_METERS);
        System.out.print("The Body Mass Index (BMI) is " + BMI + " kg/m");


    }
}
