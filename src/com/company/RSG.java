package com.company;

import java.util.ArrayList;

public class RSG extends Sentence_Generator11 {

  //constractor
  public RSG()
  {
    super.wordBehaviour = new LowerCase();
    super.sentenceBehaviour = new Random();

  }

  /*
  public String generateSentence() {

    int range = 5;
    String sentence = "";
    int vocabLen  = super.Vocabulary.size();
    int sentenceLen = (int)Math.random()*range;
    if(sentenceLen == 0)
      sentenceLen += vocabLen;
    for(int i=0;i<sentenceLen;i++)
    {
      int index = (int)Math.random()*vocabLen;
      sentence = sentence + " " + Vocabulary.get(i);
      System.out.println(sentence+" "+index);
    }
    return sentence;
  }


   */

  public String generateSentence(){

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