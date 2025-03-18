package com.slidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubStingabc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aaabc";
		numberOfSubstringsOpt(s);
		

	}
	
	 public static int numberOfSubstrings(String s) {
		 
		 int apt=0;
		 int bpt=apt+2;
		 int n=s.length();
		 List<String> res=new ArrayList<>();
		 
		 while(bpt<n && apt<n)
		 {
			 String sub=s.substring(apt, bpt+1);
			 boolean flag=false;
			 Map<String,Long> charMap=Stream.of(sub.split("")).collect(
					 Collectors.groupingBy(Function.identity(),Collectors.counting())
					 );
			 if(charMap.size()==3)
			 {
				res.add(sub);
			 }
			 
			 if(bpt+1<n)
			 {
				 bpt++;
			 }else
			 {
				 apt++;
				 bpt=apt+2;
			 }
			 
		 }
		 
		 System.out.println(res);
		 return res.size();
	        
	    }




public static int numberOfSubstringsOpt(String s) {
	int[] freq = new int[3]; // 'a' -> 0, 'b' -> 1, 'c' -> 2
    int left = 0, ans = 0;

    for (int right = 0; right < s.length(); right++) {
        freq[s.charAt(right) - 'a']++;

        while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
            ans += s.length() - right;
            freq[s.charAt(left) - 'a']--;
            left++;
        }
    }
System.out.println(ans);
    return ans;
	
	 
}

}