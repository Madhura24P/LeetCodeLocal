package com.stack;

import java.util.ArrayList;
import java.util.List;

public class BuildArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<String> buildArray(int[] target, int n) {
		 
		 List<String> opsList=new ArrayList<>();
		 int input=1;
		 for(int num:target)
		 {
			 while(input<num)
			 {
				 opsList.add("push");
				 opsList.add("pop");
				 input++;
			 }
			 opsList.add("push");
			 input++;
		 }
	        return opsList;
	    }

}
