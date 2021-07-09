package com.company;

public class Upper_Reversed implements WordBehaviour {

  public String word;

  public String modifyInputWords( String word) {

    word  = word.toUpperCase();
    
    return word;
  }

}