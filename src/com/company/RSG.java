package com.company;

public class RSG extends Sentence_Generator11 {

  public RSG()
  {
    super.wordBehaviour = new LowerCase();
    super.sentenceBehaviour = new Random();

  }
  public void generateSentence() {
  }

}