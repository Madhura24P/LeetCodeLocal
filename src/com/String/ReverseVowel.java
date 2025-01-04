package com.String;

import java.util.*;

public class ReverseVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseVowels("IceCreAm");

	}
	
public static String reverseVowels(String s) {
    
	Set<Character> sChar=new HashSet<>();
	sChar.add('a');
	sChar.add('e');
	sChar.add('i');
	sChar.add('o');
	sChar.add('u');
	sChar.add('A');
	sChar.add('E');
	sChar.add('I');
	sChar.add('O');
	sChar.add('U');
	
	StringBuilder ans=new StringBuilder();
	
	int aPt=0;
	int bPt=s.length()-1;
	char [] sArr=new char[s.length()];
	
	while(aPt<s.length())
	{
		if(sChar.contains(s.charAt(aPt)))
		{
			while(!sChar.contains(s.charAt(bPt)))
			{
				bPt--;
			}
		 
			sArr[aPt]=s.charAt(bPt);
			sArr[bPt]=s.charAt(aPt);
			bPt--;
		}else
		{
			//ans.append(s.charAt(aPt));
			//if(aPt!=bPt)
			sArr[aPt]=s.charAt(aPt);
		}
		aPt++;
		
	}
        
	for(char c:sArr)
	{
		ans.append(c);
	}
	
	System.out.println(ans);
	return ans.toString();
    }

public String reverseVowelsOptimized(String s) {
    char[] word = s.toCharArray();
    int start = 0;
    int end = s.length() - 1;
    String vowels = "aeiouAEIOU";
    
    while (start < end) {
        // Move start pointer until it points to a vowel
        while (start < end && vowels.indexOf(word[start]) == -1) {
            start++;
        }
        
        // Move end pointer until it points to a vowel
        while (start < end && vowels.indexOf(word[end]) == -1) {
            end--;
        }
        
        // Swap the vowels
        char temp = word[start];
        word[start] = word[end];
        word[end] = temp;
        
        // Move the pointers towards each other
        start++;
        end--;
    }
    
    String answer = new String(word);
    return answer;
}


}
