package com.company;

public class SSG extends Sentence_Generator11 {

  // constractor
  public SSG()
  {
    super.wordBehaviour = new LowerCase();
    super.sentenceBehaviour = new Random();

  }
  public void generateSentence() {
  }

}