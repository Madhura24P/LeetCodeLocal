package com.stack;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3[a2[c]]2[bc]

	}
	
	  public String decodeString(String s) {
		  
		  Stack<Integer> st = new Stack<>();
	        Stack<StringBuilder> st1 = new Stack<>();
	        StringBuilder sb = new StringBuilder();
	        int n = 0;

	        for (char c : s.toCharArray()) {
	            if (Character.isDigit(c)) {
	                n = n * 10 + (c - '0');
	            } else if (c == '[') {
	                st.push(n);
	                n = 0;
	                st1.push(sb);
	                sb = new StringBuilder();
	            } else if (c == ']') {
	                int k = st.pop();
	                StringBuilder temp = sb;
	                sb = st1.pop();
	                while (k-- > 0) {
	                    sb.append(temp);
	                }
	            } else {
	                sb.append(c);
	            }
	        }

	        return sb.toString();
	    
	        
	    }

}
