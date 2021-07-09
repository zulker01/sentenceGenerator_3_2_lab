package com.company;


import java.util.ArrayList;

public class RandomSortedWithVocab implements SentenceBehaviour {

  public ArrayList<String> createSentence(ArrayList<String> vocabulary){

    ArrayList<String> choosenWords = new ArrayList<String>();

    int range = 5;         // range preset for sentence size

    int vocabLen  = vocabulary.size();  // get vocabulary length
    int sentenceLen = (int)Math.random()*range; // random sentence length
    if(sentenceLen == 0)          // sentence length can't be zero
      sentenceLen += vocabLen;

    for(int i=0;i<sentenceLen;i++)  // add word for till sentence length
    {
      choosenWords.add(vocabulary.get(i));   // add words to choosen words
    }
    return  choosenWords;
  }

}