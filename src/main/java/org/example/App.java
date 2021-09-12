package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables
        int C, F;
        String userInput;
        Scanner sc = new Scanner(System.in);

        //Prompt user and scan inputs
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.println("Your choice:");
        userInput = sc.next();
        userInput = userInput.toUpperCase();

        //Prompt user to enter either Fahrenheit or Celsius and output
        if(userInput.equals("C")){
            System.out.println("Please enter the temperature in Fahrenheit:");
            F = sc.nextInt();
            C = (F - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + C + ".");
        }
        else if(userInput.equals("F")){
            System.out.println("Please enter the temperature in Celsius:");
            C = sc.nextInt();
            F = (C * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + F + ".");
        }

        //close scanner
        sc.close();
    }
}