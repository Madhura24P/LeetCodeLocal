package com.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ast[]= {-2,-2,1,-2};
		asteroidCollision(ast);

	}
	
	 public static int[] asteroidCollision(int[] asteroids) {
		 
		 Stack<Integer> st=new Stack();
		 int n=asteroids.length;
		 for(int i=0;i<n;i++)
		 {
			 if(asteroids[i]>0)
			 {
				 st.push(asteroids[i]);
			 }else
			 {
				 while(!st.isEmpty() && st.peek()>0 
						 && st.peek()<-asteroids[i])
				 {
					st.pop(); 
				 }
				 
				 if(st.isEmpty() || st.peek()<0)
				 {
					 st.push(asteroids[i]);
				 }
				 
				 if(st.peek()==-asteroids[i])
				 {
					 st.pop();
				 }
			 }


			 
		 }
		 
		 List<Integer> res=new ArrayList<>();
		 while(!st.isEmpty())
		 {
			 res.add(st.pop());
		 }
		 
	        int[]resArr=res.reversed().stream().mapToInt(x->x).toArray();
	        System.out.println(Arrays.toString(resArr));
	        return resArr;
	 }

}
