package com.company;

import java.util.Scanner;

public class LowerCase implements WordBehaviour {

  public String word;

  public String modifyInputWords(String word) {


    word = word.toLowerCase();
    return word;

  }

}