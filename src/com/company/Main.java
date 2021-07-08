package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        initialize();
    }

    public static void initialize()
    {

        // printing to console the initialization
        System.out.println("********* Welcome to Sentence Generator **********\n\n");
        System.out.println("Choice options  : \n\n");
        System.out.println("1. Random Sentence Generator\n");
        System.out.println("2. Sorted Sentence Generator \n");
        System.out.println("3. os Sentence Generator \n\n");
        System.out.println("Enter your choice : ");

        //taking input user choice
        Scanner myObj = new Scanner(System.in);
        int choice = myObj.nextInt();
        if(choice == 1)
        {
            System.out.println(" Connecting to RSG .......");
        }
        else if(choice == 2)
        {
            System.out.println(" Connecting to SSG .......");
        }
        else if(choice == 3)
        {
            System.out.println(" Connecting to OSG .......");
        }

    }
}
