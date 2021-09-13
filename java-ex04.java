/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a noun");
        String inputNoun = myObj.nextLine();

        System.out.println("Enter a verb");
        String inputVerb = myObj.nextLine();

        System.out.println("Enter an adjective");
        String inputAdj = myObj.nextLine();

        System.out.println("Enter an adverb");
        String inputAdv = myObj.nextLine();

        System.out.println("Do you " + inputVerb + " your " + inputAdj + " " + inputNoun + " " + inputAdv + "? That's hilarious!");

        myObj.close();
    }
}