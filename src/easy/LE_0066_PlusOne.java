package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LE_0066_PlusOne {

	public static int[] plusOne(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] < 9) {
				a[i]++;
				return a;
			}
			a[i] = 0;
		}
		int[] x = new int[a.length + 1];
		x[0] = 1;
		return x;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		String[] strArr = s.split(" ");
		int[] a = new int[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			a[i] = Integer.parseInt(strArr[i]);
		}
		int[] x = plusOne(a);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
