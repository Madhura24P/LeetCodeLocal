package com.Array;

public class PlaceFlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nArr= {0,0,1,0,1};
		int n=1
				;
		System.out.println(canPlaceFlowers(nArr, n));

	}
	
	 public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		 for (int i = 0; i < flowerbed.length; i++) {
	            boolean left = i == 0 || flowerbed[i - 1] == 0;
	            boolean right = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
	            
	            if (left && right && flowerbed[i] == 0) {
	                flowerbed[i] = 1;
	                n--;
	            }
	        }
	        return n <= 0;        
		
	 }

}
