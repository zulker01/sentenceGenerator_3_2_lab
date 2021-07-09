package com.company;

public class Upper_Reversed implements WordBehaviour {

  public String word;

  public String modifyInputWords( String word) {

    word  = word.toUpperCase();

    StringBuilder input1 = new StringBuilder();
    input1.append(word);

    word = input1.reverse().toString();
    return word;
  }

}