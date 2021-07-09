package com.company;

public class OSG extends Sentence_Generator11 {

  public OSG()
  {
    super.wordBehaviour = new Upper_Reversed();
    super.sentenceBehaviour = new Random();

  }
  public String generateSentence() {
    return sentence;
  }

}