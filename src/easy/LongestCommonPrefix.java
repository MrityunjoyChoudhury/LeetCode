package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonPrefix {
	
	public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	public static String commonPrefix(String[] strs) {
        boolean prefixExist = true;
        String  prefix="";
        int k=0;
        int min=0;
        int minLength=200;
        for(int i=0;i<strs.length;i++) {
        	if(strs[i].length() < minLength) {
        		minLength=strs[i].length();
        		min=i;
        	}
        }
        while(prefixExist && k <minLength){
         char temp=strs[min].charAt(k);
         System.out.println("temp: "+temp);
         for(int i=0;i<strs.length;i++){
          System.out.println("string: "+strs[i]+" char: "+strs[i].charAt(k)); 
          if(strs[i].charAt(k) != temp){
            prefixExist = false;
            return prefix;
          }
         }
         prefix+=temp+"";
         k++;
        }
        return prefix;
		
	}

	public static String commonPrefix_2(String[] strs) {
        boolean prefixExist = true;
        String  prefix="";
        int k=0;
        int min=0;
        int minLength=200;
        for(int i=0;i<strs.length;i++) {
        	if(strs[i].length() < minLength) {
        		minLength=strs[i].length();
        		min=i;
        	}
        }
        for(int i=0;i<strs.length;i++) {
        	
        }
        while(prefixExist && k <minLength){
         char temp=strs[min].charAt(k);
         System.out.println("temp: "+temp);
         for(int i=0;i<strs.length;i++){
          System.out.println("string: "+strs[i]+" char: "+strs[i].charAt(k)); 
          if(strs[i].charAt(k) != temp){
            prefixExist = false;
            return prefix;
          }
         }
         prefix+=temp+"";
         k++;
        }
        return prefix;
		
	}
	
	public static String commonPrefix_3(String[] strs) {
		if(strs.length == 0) {
			System.out.println("first");
			return ""; 
		}
		String t1 = strs[0];
		for(int i = 1;i<strs.length;i++) {
			String t2 = strs[i];
			int j =0;
			while(j < t1.length() && j < t2.length()) {
				if(t1.charAt(j) == t2.charAt(j)) {
					j++;
				}else {
					break;
				}
			}
			if(j==0) {
				return "";
			}
			t1 = t1.substring(0,j);
		}
		return t1;
	}
	
	public static void main(String[] args) {
		System.out.print("enter the array:");
		try {
			String[] strArr = bf.readLine().split(" ");
			System.out.println("common prefix: "+commonPrefix_3(strArr));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
