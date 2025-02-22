package com.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="AABABBA";
		//String s="BAAA";
		String s="ABAA";
		int k=0;
		charReplaceopt(s, k);

	}
	
	 public static int characterReplacement(String s, int k) {
		 
		 char [] sArr=s.toCharArray();
		 
		 int kcpy=k;
		 int count=0;//ABAB/
		 int max=0;
		 
		 for(int i=0;i<sArr.length-1;i++)
		 {
			 List<Character> lchar=new ArrayList<>();
			 lchar.add(sArr[i]);
			 int m=0;
			 
             while(m<sArr.length)
             {
                int j=m;
                count=0;
                kcpy=k;
			 while(j<sArr.length && kcpy>=0)
			 {
				 if(lchar.contains(sArr[j])) {
					 count++;
					 j++;
					 continue;
					 
				 }else if(kcpy>0)
				 {
					 count++;
					 kcpy--;
				 }else
                 {
                    break;
                 }
				 j++;
				 
			 }	
			 max=Math.max(max, count); 

             m++;
            }
			 
						//System.out.println(max);
		 }
		 
		 return max;
	        
	    }

	 
	 public static int charReplaceopt(String s,int k)
	 {
		 HashMap<Character, Integer> freqs = new HashMap<>();
	        int res = 0, i = 0, maxFreq = 0;

	        for (int j = 0; j < s.length(); j++) {
	            char c = s.charAt(j);
	            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
	            maxFreq = Math.max(maxFreq, freqs.get(c));

	            while ((j - i + 1) - maxFreq > k) {
	                char left = s.charAt(i);
	                freqs.put(left, freqs.get(left) - 1);
	                i++;
	            }

	            res = Math.max(res, j - i + 1);
	        }

	        return res;
	 }
}
