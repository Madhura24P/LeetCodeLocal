package com.String;

public class DefangIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public String defangIPaddr(String address) {
	
	/*
	 * String res=""; for(char c:address.toCharArray()) { if(c=='.') { res+="[.]";
	 * continue; } res+=c; }
	 * 
	 * return res;
	 */
	
	address=address.replace(".", "[.]");

    return address;
        
    }

}
