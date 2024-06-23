package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LE_0027_RemoveElement {

	static int[] num;

	public static int removeNum(int val) {
		int[] B = new int[num.length];
		int j = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] != val) {
				B[j] = num[i];
				j++;
			}
		}
		for (int i = 0; i < j; i++) {
			num[i] = B[i];
		}
		return j;

	}

	public static int removeNum2(int val) {
		int prevIndx = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			if (num[i] != val) {
				int a = num[i];
				int b = num[prevIndx];
				a = a + b;
				b = a - b;
				a = a - b;
				// System.out.println("a : "+a+" b: "+b+" num[i]: "+num[i]+" num[prevIndx]:
				// "+num[prevIndx]);
				num[prevIndx] = b;
				num[i] = a;

				// System.out.println("After SWAP: a : "+a+" b: "+b+" num[i]: "+num[i]+"
				// num[prevIndx]: "+num[prevIndx]);
				prevIndx++;
			}
		}
		return prevIndx;

	}

	public static int removeNum3(int val) {
		
		int p =num.length;
		for(int i=0;i<num.length;) {
			if(num[i]==val && p==num.length) {
				p=i;
				i++;
			}else if(num[i]!= val && p!=num.length) {
				int x = num[i];
				num[i]=num[p];
				num[p]=x;
				i=p+1;
				p=num.length;
			}else {
				i++;
			}
			
		}
		return p;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array: ");
		String[] inpArr = bf.readLine().split(" ");
		LE_0027_RemoveElement.num = new int[inpArr.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(inpArr[i]);
		}
		System.out.println("enter the element to be removed: ");
		int val = Integer.parseInt(bf.readLine());
		int j = removeNum3(val);
		for (int i = 0; i < j; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
