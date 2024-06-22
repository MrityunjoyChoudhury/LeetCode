package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LE_0058_LengthOfLastWord {
	
	public static int lengthOfLastWord(String s) {
		int n = s.length();
		int lw = 0;
		for(int i = n-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				lw++;
			}else if(s.charAt(i)==' ' && lw >0) {
				break;
			}
		}
		return lw;
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter the string: ");
		String s = bf.readLine();
		System.out.println("Length of last word is : "+lengthOfLastWord(s));
		

	}

}
