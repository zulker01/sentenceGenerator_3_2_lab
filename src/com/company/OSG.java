package com.company;

import java.util.ArrayList;

public class OSG extends Sentence_Generator11 {

  public OSG()
  {
    super.wordBehaviour = new Upper_Reversed();
    super.sentenceBehaviour = new RandomSortedWithVocab();

  }
  public String generateSentence() {
    String createdSentence = "";
    ArrayList<String> choosenWords = new ArrayList<String>();

    choosenWords = sentenceBehaviour.createSentence(super.Vocabulary);
    for(int i=0;i<choosenWords.size();i++)
    {
      createdSentence = createdSentence + " " + choosenWords.get(i);
    }
    return  createdSentence;
  }

}