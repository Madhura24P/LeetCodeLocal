package com.stack;

public class MaxStuderntsUnable1ToEat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int countStudents(int[] students, int[] sandwiches) {
		 int s=students.length;
		 int stu_1=0;
		 int stu_0=0;
		 for(int i=0;i<s;i++)
		 {
			 if(students[i]==1)stu_1++;
			 else stu_0++;
			 
		 }
		 int res=0;
		 int sd=sandwiches.length;
		 for(int i=0;i<sd;i++)
		 {
			 if(sandwiches[i]==1 && stu_1>0)
			 {
				 stu_1--;
			 }else if(sandwiches[i]==0 && stu_0>0)
			 {
				 stu_0--;
			 }else
			 {
				 res=sd-i;
				 break;
			 }
			 
		 }
		 
		 return res;
	        
	    }

}
