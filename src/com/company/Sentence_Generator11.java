package com.company;


import java.util.ArrayList;
import java.util.List;
//import Sentence_Generator11.Arraylist;
import com.company.SentenceBehaviour;
import com.company.WordBehaviour;


public abstract class Sentence_Generator11 {

  public ArrayList<String> Vocabulary = new ArrayList<String>(); // Create an ArrayList object ;

  public Integer wordNum;

  public String sentence;

  private WordBehaviour wordbehaviour;

  public SentenceBehaviour sentenceBehaviour;

    public List<WordBehaviour> wordBehaviour;
    //public List<SentenceBehaviour> sentenceBehaviour;

  public abstract void generateSentence();

  public void display() {
  }

}