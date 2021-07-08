package com.company;
import java.util.*;

public class Main {

    public static RSG rsg = new RSG();
    public static SSG ssg = new SSG();
    public static OSG osg = new OSG();
    public static void main(String[] args) {
	// write your code here
        initialize();


    }

    public static void initialize()
    {
        while(true) {
            // printing to console the initialization
            System.out.println("********* Welcome to Sentence Generator **********\n\n");
            System.out.println("Choice options  : \n\n");
            System.out.println("1. Random Sentence Generator\n");
            System.out.println("2. Sorted Sentence Generator \n");
            System.out.println("3. os Sentence Generator \n\n");
            System.out.println("4. Exit the menu  \n\n");
            System.out.println("Enter your choice : ");

            //taking input user choice
            Scanner myObj = new Scanner(System.in);
            int choice = myObj.nextInt();
            // if first choice then it is RSG
            if (choice == 1) {
                System.out.println(" Connecting to RSG .......CONNECTED\n");

                rsg.handleUserChoice();
            }
            // if second choice then it is SSG
            else if (choice == 2) {
                System.out.println(" Connecting to SSG .......");
                ssg.handleUserChoice();
            }
            // if 3rd choice then it is OSG
            else if (choice == 3) {
                System.out.println(" Connecting to OSG .......");
                osg.handleUserChoice();
            }

            // if 4th choice then exit the program
            else if (choice == 4) {
                System.out.println(" Exit the program ");
                break;
            }

        }

    }
}
