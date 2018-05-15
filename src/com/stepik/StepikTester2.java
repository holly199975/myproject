package com.stepik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StepikTester2 {

	public static void main(String[] args) {

	    List<GreekLetter> letterList = new ArrayList<>();
	    letterList.add(new GreekLetter("Gamma",  3));
	    letterList.add(new GreekLetter("Omega", 24));
	    letterList.add(new GreekLetter("Alpha",  1));


	    Object[] objArray = letterList.toArray();


	    for (int i = 0; i < objArray.length; i++) {
	      System.out.println(objArray[i]);
	    }
	  }

	  static class GreekLetter {

	    private String letter;
	    private Integer position;

	    public GreekLetter(String letter, Integer position) {
	      this.letter = letter;
	      this.position = position;
	    }

	    @Override
	    public String toString() {
	      return "{" +
	              "letter='" + letter + '\'' +
	              ", position=" + position +
	              '}';
	    }
	    
	    
	    
	    List<Integer> numList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
	    numList.subList(0,2).clear();
	    
	  }

}
