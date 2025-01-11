package com.KthSeries;

import java.util.Arrays;
import java.util.*;

public class KthLargestElement {
	int []nums=null;
	List<Integer> l=new ArrayList<>();
	private PriorityQueue<Integer> minHeap;
	int k=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[]= {4,5,8,2};
		KthLargestElement k1=new KthLargestElement(3, n);
		k1.add(3);
		k1.add(5);
		k1.add(10);
		k1.add(9);
		k1.add(4);
		
		
		

	}
	

    public KthLargestElement(int k, int[] nums) {
     this.nums=nums;  
     Arrays.sort(nums);
     int n=nums.length-k;
     int count=3;
     while(count>0)
     {
    	 l.add(nums[n]);
    	 n++;
    	 count--;
     }
     this.k=k;
     
     minHeap = new PriorityQueue<>(k);
     for (int num : nums) {
         if (minHeap.size() < k) {
             minHeap.offer(num);
         } else if (num > minHeap.peek()) {
             minHeap.offer(num);
             if (minHeap.size() > k) {
                 minHeap.poll();
             }
         }}
    }
    
    public int add(int val) {
    	 //nums=Arrays.copyOf(nums, nums.length+1);
    	//nums=Arrays.copyOf(nums, val)
			/*
			 * int n=nums.length-1; nums[n]=val; System.out.println(Arrays.toString(nums));
			 * 
			 * int
			 * ans=Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(k-1).
			 * findFirst().get();
			 * 
			 * System.out.println(ans);
			 */
    	if(val>l.getLast())
    	{
    		l.removeFirst();
    		l.addLast(val);
    		
    	}
    	else if(val>l.getFirst())
    	{
    		l.removeFirst();
    		l.addFirst(val);
    	}
    	System.out.println(l.toString());
		
		 int ans=
				 l.stream().sorted(Comparator.reverseOrder()).
		  skip(k-1).mapToInt(m->(int)m).findFirst().getAsInt();
		 
    	//System.out.println(0);
    	return ans;
        
    }
    
    public int addOpt(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (val > minHeap.peek()) {
            minHeap.offer(val);
            minHeap.poll();
        }
        return minHeap.peek();
    }
    
    

}
