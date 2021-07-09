package com.company;
import java.util.*;

public class Main {

    public static RSG rsg = new RSG();
    public static SSG ssg = new SSG();
    public static OSG osg = new OSG();
    public static Scanner myObj  = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        initialize(myObj);


    }

    public static void initialize(Scanner myObj)
    {
        while(true) {
            // printing to console the initialization
            System.out.println("\n\n********* Welcome to Sentence Generator **********\n");
            System.out.println("Choice options  : \n");
            System.out.println("1. Random Sentence Generator ");
            System.out.println("2. Sorted Sentence Generator ");
            System.out.println("3. os Sentence Generator \n\n");
            System.out.println("4. add words to vocabulary");

            System.out.println("5. Exit the menu  \n");
            System.out.println("Enter your choice : ");

            //taking input user choice
            int choice = myObj.nextInt();
            // if first choice then it is RSG sentence generator
            if (choice == 1) {
                System.out.println(" Connecting to RSG .......CONNECTED\n");

                System.out.println(rsg.generateSentence());
            }
            // if second choice then it is SSG
            else if (choice == 2) {
                System.out.println(" Connecting to SSG .......");
                System.out.println(ssg.generateSentence());
            }
            // if 3rd choice then it is OSG
            else if (choice == 3) {
                System.out.println(" Connecting to OSG .......");
                System.out.println(osg.generateSentence());
            }
            else if(choice == 4){
                while(true)
                {
                    System.out.println("1. add words to RSG");
                    System.out.println("2. add words to SSG ");
                    System.out.println("3. add words to OSG  ");
                    System.out.println("4. back to previous menu  \n");

                    //taking input user choice

                    choice = myObj.nextInt();

                    // if first choice then it is to add rsg  vocabulary
                    if (choice == 1) {
                        System.out.println(" wait to add to vocabs to RSG");
                        rsg.addWords();

                    }
                    // if second choice then it is to add ssg  vocabulary
                    else if (choice == 2) {
                        System.out.println(" wait to see the generated sentence .......");
                        ssg.addWords();
                    }
                    // if second choice then it is to add osg  vocabulary
                    else if (choice == 3) {
                        System.out.println(" Back to previous menu....");
                        osg.addWords();
                    }

                    // exit this menu
                    else if( choice == 4){
                        System.out.println(" words : ");
                        rsg.printWords();
                        osg.printWords();
                        ssg.printWords();
                        break;
                    }
                }
            }
            //  exit the program
            else if (choice == 5) {
                System.out.println(" Exit the program ");
                break;
            }

        }

    }
}
