package com.stack;

import java.util.Arrays;
import java.util.Stack;

public class FinalPriceSpecialDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] prices= {8,4,6,2,3};
		finalPrices(prices);

	}
	
public static int[] finalPrices(int[] prices) {
    
	int n=prices.length;
	int res[]=new int[prices.length];
	Stack<Integer> st=new Stack<>();
	for(int i=n-1;i>=0;i--)
	{
		if(i==n-1)
		{
			res[i]=prices[i];
			st.push(prices[i]);
			continue;
		}
		
		if(!st.isEmpty() && prices[i]>st.peek())
		{
			res[i]=prices[i]-st.peek();
			st.push(prices[i]);
			continue;
		}
		
		while(!st.isEmpty() && prices[i]<st.peek())
		{
			st.pop();
		}
		
		res[i]=st.isEmpty()?prices[i]:prices[i]-st.peek();
		st.push(prices[i]);
		
		
		
	}
	System.out.println(Arrays.toString(res));
	return res;
    }

public int[] finalPricesOpt1(int[] prices) {
    int n=prices.length;
    for(int i=0; i<n; i++){            
        prices[i] = getDiscount(prices, i, n);         
    }

    return prices;
}

int getDiscount(int[] prices, int i, int n){        
    for(int j=i+1; j<n; j++){
        if(prices[j]<=prices[i]){                
            return prices[i]-prices[j];
        }
    }

    return prices[i];
}

public int[] finalPricesOpt2(int[] prices) {
    int n=prices.length;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(prices[j]<=prices[i]){
                prices[i]-=prices[j];
                break;
            }
        }
    }

    return prices;
}

public int[] finalPricesOpt3(int[] prices) {
    int n=prices.length;
    Stack<Integer> st=new Stack();

    for(int i=n-1; i>=0; i--){
        // Remove elements from the stack that are greater than the current price
        while(!st.isEmpty() && st.peek()>prices[i]){
            st.pop();
        }
        
        // Get the discount from the stack or 0 if no valid discount
        int discount=st.isEmpty()?0:st.peek();
        
        // Push the original value before updating
        st.push(prices[i]);

        // Update the current price with the discount
        prices[i]-=discount;           
    }

    return prices;
}

}
