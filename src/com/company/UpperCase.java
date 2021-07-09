package com.company;


public class UpperCase implements WordBehaviour {

  public String word;

  public String modifyInputWords( String word) {

    word  = word.toUpperCase();
    return word;
  }

}