package com.Array;

import java.util.Arrays;

public class TicTacWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]moves = {{0,0},{1,2},{0,2},{1,1}};
		tictactoe(moves);
		


	}
	
	  public static String tictactoe(int[][] moves) {
		  String winner="Pending";
		  int [][] grid=new int[3][3];
		  
		  
		  for(int i=0;i<moves.length;i++)
		  {
			  if(i%2==0)
			  {
				  grid[moves[i][0]][moves[i][1]]='X';
			  }else
			  {
				  grid[moves[i][0]][moves[i][1]]='O';
			  }
		  }
		  
		  for(int i=0;i<3;i++)
		  {
			  for(int j=0;j<3;j++)
			  {
				System.out.print(grid[i][j]+" ");  
				
			  }
			  System.out.println();
		  }
		  
		  for(int i=0;i<3;i++)
		  {
			  
			  if(grid[i][1]=='X' && grid[i][0]=='X' && grid[i][2]=='X')
			  {
				  winner=Character.toString('A');
			  }else if(grid[i][1]=='O' && grid[i][0]=='O' && grid[i][2]=='O')
			  {
				  winner=Character.toString('B');
			  }else if(grid[0][i]=='O' && grid[1][i]=='O' && grid[2][i]=='O')
			  {
				  winner=Character.toString('B');
			  }
			  else if(grid[0][i]=='X' && grid[1][i]=='X' && grid[2][i]=='X')
			  {
				  winner=Character.toString('A');
			  }
			  else if (i<1 && grid[i][i]=='X'&& grid[i+1][i+1]=='X' && grid[i+2][i+2]=='X')
			  {
				  winner=Character.toString('A');
			  }
			  else if (i<1 && grid[i][i]=='O'&& grid[i+1][i+1]=='O' && grid[i+2][i+2]=='O')
			  {
				  winner=Character.toString('B');
			  }else if (i<1 && grid[i][i+2]=='X'&& grid[i+1][i+1]=='X' && grid[i+2][i]=='X')
			  {
				  winner=Character.toString('A');
			  }
			  else if (i<1 && grid[i][i+2]=='O'&& grid[i+1][i+1]=='O' && grid[i+2][i]=='O')
			  {
				  winner=Character.toString('B');
			  }
		  }
		  
		  System.out.println("moves length"+moves.length);
		  if(winner.equals("Pending") && moves.length<9)
		  {
			  winner="Pending";
		  }else if(!(winner.equals("A") || winner.equals("B")))
		  {
			  winner="Draw";
		  }
		  
		  System.out.println(winner);
		  
		  return winner;
	        
	    }

}
