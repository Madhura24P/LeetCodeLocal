package com.search;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int firstBadVersion(int n) {
	        int start=0;
	        int end=n;
	        int bad=0;
	        while(start<=end)
	        {
	            int mid=start+(end-start)/2;
	            if(isBadVersion(mid) && !isBadVersion(mid-1))
	            {
	                
	                bad=mid;
	                break;
	            }else if(isBadVersion(mid-1) )
	            {
	                end=mid;
	            }else
	            {
	                start=mid+1;
	            }
	            
	        }

	    return bad;  
	    }
	  
	  public boolean isBadVersion(int n)
	  {
		  boolean flag=false;
		  
		  return flag;
	  }

}
