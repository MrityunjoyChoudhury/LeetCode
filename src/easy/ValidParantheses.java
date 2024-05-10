package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidParantheses {
	
	public static boolean isValid(String s) {
		char[] strArr = new char[s.length()];
		for(int i=0,j=-1;i<s.length();i++) {
			char c = s.charAt(i);
			if(j>=0 && ((c ==']' && strArr[j]=='[') || 
					    (c =='}' && strArr[j]=='{') || 
					    (c ==')' && strArr[j]=='(') 
					   )
			  )
			{
				strArr[j]='#';
				j--;
			}else {
				j++;
				strArr[j]=c;
			}
			
		}
		System.out.println(strArr[0]);
		if(strArr[0]!='#') {
			return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		if(isValid(s)) {
			System.out.println("valid");
		}else {
			System.out.println("Invalid");
		}

	}

}
