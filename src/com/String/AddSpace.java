package com.String;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AddSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sp[]= {8,13,15};
		addSpacesOpt("LeetCodeHelpsMeLearn",sp );

	}
	
	public String addSpaces(String s, int[] spaces) {
        int n=s.length();
        int m=spaces.length;
        char[] newChrs=new char[n+m];
        char[] sChr=s.toCharArray();

        int i=0;
        int idx=0;
        for(int spc:spaces){
            while(i<spc){                
                newChrs[idx++]=sChr[i];
                i++;                
            }   
            newChrs[idx++]=' ';
        }
        
        //For last finishing
        while(i<n){                
            newChrs[idx++]=sChr[i];
            i++;                
        }   

        return new String(newChrs);
    }
	
	
	 public static String addSpacesOpt(String s, int[] spaces) {
		 
			
			  StringBuilder sb=new StringBuilder(); char []sChar=s.toCharArray(); int
			  spaceIndx=0;
			  
			  for(int i=0;i<sChar.length;i++) { if(spaceIndx<spaces.length &&
			  i==spaces[spaceIndx]) { sb.append(" "); spaceIndx++;
			  
			  }
			  
			  sb.append(sChar[i]); }
			 
		 
		
		 
		 return sb.toString();
	 }

}
