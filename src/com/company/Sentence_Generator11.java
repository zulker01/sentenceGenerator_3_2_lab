package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import Sentence_Generator11.Arraylist;
import com.company.SentenceBehaviour;
import com.company.WordBehaviour;


public abstract class Sentence_Generator11 {

  protected ArrayList<String> Vocabulary = new ArrayList<String>(); // Create an ArrayList object ;

  protected Integer wordNum;

  protected String sentence;

  protected WordBehaviour wordBehaviour;

  protected SentenceBehaviour sentenceBehaviour;

    //public List<WordBehaviour> wordBehaviour;
    //public List<SentenceBehaviour> sentenceBehaviour;

  public abstract void generateSentence();

  public void display() {
  }

  public void handleUserChoice()
  {
    while(true) {
      System.out.println("Enter choice :\n");
      System.out.println("1. add words to vocabulary\n");
      System.out.println("2. generate Sentence \n");
      System.out.println("3. back to previous menu  \n");

      //taking input user choice
      Scanner myObj = new Scanner(System.in);
      int choice = myObj.nextInt();

      // if first choice then it is to add vocabulary
      if (choice == 1) {
        System.out.println(" wait to add to vocabs\n");

      }
      // if second choice then it is to generate sentence
      else if (choice == 2) {
        System.out.println(" wait to see the generated sentence .......\n");
        if (Vocabulary.size() < 1) {
          System.out.println(" Empty vocabulary, you have to add to vocabs first \n");
        }
      }
      // exit menu
      else if (choice == 3) {
        System.out.println(" Back to previous menu....\n");
        break;
      }
    }

  }

}