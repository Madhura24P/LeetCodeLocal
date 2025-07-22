package com.greedy;

public class LemonChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean lemonadeChange(int[] bills) {
		int countF = 0;
		int countT = 0;
		for (int i : bills) {
			if (i == 5) {
				countF++;
			} else if (i == 10) {
				if (countF > 0) {
					countF--;
					countT++;
				} else {
					return false;
				}

			} else if (i == 20) {
				if (countF > 0 && countT > 0) {
					countF--;
					countT--;
				} else if (countF >= 3) {
					countF = countF - 3;
				} else {
					return false;
				}
			}
		}
		return true;
	}

}
