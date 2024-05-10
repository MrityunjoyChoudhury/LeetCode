package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class RomanToInteger {

	public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static int roman_to_int(String s) {
		int outNum = 0;
		int i;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'I') {
				if (i < s.length() - 1 && s.charAt(i + 1) == 'V') {
					outNum += 4;
					i++;
				} else if (i < s.length() - 1 && s.charAt(i + 1) == 'X') {
					outNum += 9;
					i++;
				} else {
					outNum += 1;
				}
			} else if (s.charAt(i) == 'X') {

				if (i < s.length() - 1 && s.charAt(i + 1) == 'L') {
					outNum += 40;
					i++;
				} else if (i < s.length() - 1 && s.charAt(i + 1) == 'C') {
					outNum += 90;
					i++;
				} else {
					outNum += 10;
				}
			} else if (s.charAt(i) == 'C') {

				if (i < s.length() - 1 && s.charAt(i + 1) == 'D') {
					outNum += 400;
					i++;
				} else if (i < s.length() - 1 && s.charAt(i + 1) == 'M') {
					outNum += 900;
					i++;
				} else {
					outNum += 100;
				}
			} else if (s.charAt(i) == 'V') {
				outNum += 5;
			} else if (s.charAt(i) == 'L') {
				outNum += 50;
			} else if (s.charAt(i) == 'D') {
				outNum += 500;
			} else if (s.charAt(i) == 'M') {
				outNum += 1000;
			}
		}
//		if (s.charAt(i) == 'I') {
//			outNum += 1;
//		} else if (s.charAt(i) == 'X') {
//			outNum += 10;
//		} else if (s.charAt(i) == 'C') {
//			outNum += 100;
//		} else if (s.charAt(i) == 'V') {
//			outNum += 5;
//		} else if (s.charAt(i) == 'L') {
//			outNum += 50;
//		} else if (s.charAt(i) == 'D') {
//			outNum += 500;
//		} else if (s.charAt(i) == 'M') {
//			outNum += 1000;
//		}

		return outNum;
	}

	public static int roman_to_int2(String s) {
		
		int num=0;
		int prev=0;
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		
		
		for(int i=s.length()-1;i>=0;i--) {
		 if(map.get(s.charAt(i)+"") < prev) {
			 num-=map.get(s.charAt(i)+"");
		 }else {
			 num+=map.get(s.charAt(i)+"");
		 }
		 prev = map.get(s.charAt(i)+"");
		}
		
		return num;
		
	}
	
    public static int roman_to_int3(String s) {
		
		int num=0;
		int prev=0;
		
		for(int i=s.length()-1, temp=0;i>=0;i--,temp=0) {
		 if(s.charAt(i)=='I') {
			 temp=1;
		 }else if(s.charAt(i)=='V') {
			 temp=5;
		 }else if(s.charAt(i)=='X') {
			 temp=10;
		 }else if(s.charAt(i)=='L') {
			 temp=50;
		 }else if(s.charAt(i)=='C') {
			 temp=100;
		 }else if(s.charAt(i)=='D') {
			 temp=500;
		 }else if(s.charAt(i)=='M') {
			 temp=1000;
		 }
		 
		 if(temp < prev) {
			 num-=temp;
		 }else {
			 num+=temp;
		 }
		 prev = temp;
		}
		
		return num;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("");
		System.out.println("enter the roman number: ");
		try {
			s = bf.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(roman_to_int3(s));

	}

}
