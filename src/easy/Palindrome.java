package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static boolean isPalinDrome(int num) {

		if (num < 0) {
			return false;
		}
		int oppNum = 0;
		int numLength = 0;
		int x = num;
		while (x > 0) {
			numLength++;
			x = x / 10;
		}
		// System.out.println("numlength: " + numLength);
		x = num;
		int i = numLength - 1;
		while (x > 0) {
			oppNum = (int) (oppNum + (x % 10) * Math.pow(10, i));
			i--;
			x = x / 10;
		}
		// System.out.println("oppnum: " + oppNum);
		if (num == oppNum) {
			return true;
		}
		return false;

	}

	public static boolean isPalinDrome2(int num) {

		int numLength = 0;
		int x = num;
		while (x > 0) {
			x = x / 10;
			numLength++;
		}
		int[] outNum = new int[numLength];
		x = num;
		int i = 0;
		while (x > 0) {
			outNum[i] = x % 10;
			x = x / 10;
			i++;
		}
		System.out.println("arr: ");
		display(outNum);

		x = num;
		i = numLength-1;
		while (x > 0) {
			if (outNum[i] != (x%10)) {
				return false;
			}
			x = x / 10;
			i--;
		}
		return true;
	}
	
	public static boolean isPalinDrome3(int num) {
		int x = num;
		int y = num;
		int multiplier = 1;
		int length=0;
		while(x>0) {
			length = length +1;
			
			x=x/10;
		}
		length = length - 1;
		while(length >0) {
			multiplier = multiplier*10;
			length--;
		}
		x=num;
		//multiplier = multiplier/10;
		System.out.println(multiplier);
		while(x>0) {
			if(x%10 != y/multiplier ) {
				return false;
			}
			y = y%multiplier;
			multiplier=multiplier/10;
			x = x/10;
		}
		return true;
	}
	
	public static boolean isPalinDrome4(int num) {
		if(num== reverseNum(num)) {
			return true;
		}
		return false;
			
	}
	
	public static int reverseNum(int num) {
		
		int x = num;
		int reverseNum=x%10;
		x = x/10;
		while (x>0) {
			reverseNum=reverseNum*10 + (x%10);
			x = x/10;
		}
		System.out.println("reversenum: "+reverseNum);
		return reverseNum;
		
	}
	
	public static boolean isPalinDrome5(int num) {
	
		if(num<0) {
			return false;
		}
		int x = num;
		int multi=1;
		
		while(x >=10 ) {
			multi*=10;
			x/=10;
		}
		//multi/=10;
		System.out.println("Multi: "+multi);
		x = num;
		while(x>0){
			if(x/multi != x%10) {
				return false;
			}
			x%=multi;
			x/=10;
			multi/=100;
		}
		return true;
	}
	
	
	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter the number: ");
		try {
			int num = Integer.parseInt(bf.readLine());
			//System.out.println(reverseNum(num));
			if (isPalinDrome5(num)) {
				System.out.println("Palindrome");
			} else {
				System.out.println("Not a Palindrome");
			}

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
