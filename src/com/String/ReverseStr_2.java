package com.String;
public class ReverseStr_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abcdefg";
		reverseStr(a, 3);

	}
	
	public static String reverseStr(String s, int k) {
        char[] charArr = s.toCharArray();
        int n = charArr.length;

        for(int start = 0; start < n; start += 2*k) {
            int end  = Math.min(start + k - 1, n - 1);
            reverse(charArr, start, end);
        }
        return new String(charArr);
    }
    private static void reverse(char[] arr, int left, int right) {
        while(left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    } 

}
