package com.Array;

public class IslandPeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public int islandPerimeter(int[][] grid) {
	int peri=0;
	for(int i=0;i<grid.length;i++)
	{
		for(int j=0;j<grid[i].length;j++)
		{
			if(grid[i][j]==1)
			{
				 peri=peri+check(grid,i,j);
			}
			
		}
	}
	System.out.println(peri);
	
	return peri;
        
    }

private int check(int[][] grid,int i,int j)
{
	int c=4;
	if(j<grid[i].length-1 && grid[i][j+1]==1)
	{
		c--;
	}
	if(j!=0 && grid[i][j-1]==1)
	{
		c--;
	}
	
	if(i<grid.length-1 &&  grid[i+1][j]==1)
	{
		c--;
	}
	
	if(i!=0 && grid[i-1][j]==1)
	{
		c--;
	}
	
	return c;
}

}
