package com.company;

import java.util.ArrayList;

public class Random implements SentenceBehaviour {

  // this function will take the vocabulary as function parameter, &
  // then choose words for the sentence , return the choosen word
  public ArrayList<String> createSentence(ArrayList<String> vocabulary) {

    ArrayList<String> choosenWords = new ArrayList<String>();


    int range = 5;         // range preset for sentence size

    int vocabLen  = vocabulary.size();  // get vocabulary length
    int sentenceLen = (int)Math.random()*range; // random sentence length
    if(sentenceLen == 0)          // sentence length can't be zero
      sentenceLen += vocabLen;
    for(int i=0;i<sentenceLen;i++)  // add word for till sentence length
    {
      int index = (int)Math.random()*(vocabLen-1);   // random word from vocabs
      System.out.println(index);
      choosenWords.add(vocabulary.get(index));   // add words to choosen words
    }

    return choosenWords;   // return choosen words
  }

}