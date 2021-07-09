package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class SSG extends Sentence_Generator11 {

  // constractor
  public SSG()
  {
    super.wordBehaviour = new LowerCase();
    super.sentenceBehaviour = new Random();

  }
  public String generateSentence() {
    String createdSentence = "";
    ArrayList<String> choosenWords = new ArrayList<String>();

    choosenWords = sentenceBehaviour.createSentence(super.Vocabulary); // get the choosen words from sentence behaviour
    Collections.sort(choosenWords);    // sorting the choosen words
    for(int i=0;i<choosenWords.size();i++)
    {
      createdSentence = createdSentence + " " + choosenWords.get(i);
    }
    return  createdSentence;
  }

}