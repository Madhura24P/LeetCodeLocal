package com.DFS;

public class FloofFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int[][] floodFill(int[][] image, int sr, int sc, int color) {
	
	int newColor=color;
	 color=image[sr][sc];
	 if(color!=newColor)
	 {
		 helper(image,sr,sc,newColor,color);
	 }
	
        return image;
    }

public void helper(int[][] image,int i,int j,int newColor,int color)
{
	if(i<0 ||j <0 || i>=image.length || j>=image[i].length
	 || image[i][j]!=color)
	{ return;}
	
	image[i][j]=newColor;
	helper(image,i,j-1,newColor,color);
	helper(image,i,j+1,newColor,color);
	helper(image,i+1,j,newColor,color);
	helper(image,i-1,j,newColor,color);
	
	
}
}
