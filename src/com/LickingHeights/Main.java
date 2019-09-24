package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //Declare

     String name;
     int inches;
     float pounds;
     float meters;
     float kilograms;
     float total;

     Scanner keyboard;

     //Initializing

        keyboard = new Scanner(System.in);

    System.out.println("What is your name");
    name = keyboard.nextLine();
    System.out.println("What is your height in (inches)?");
    inches = keyboard.nextInt();
    meters = inches *(0.0254f);
    System.out.println("What is your weight in (pounds)?");
    pounds = keyboard.nextFloat();
    kilograms = pounds *(0.453592f);
    total = kilograms/(meters*meters);
    System.out.println("Your total BMI is "+total+".");


    }
}
