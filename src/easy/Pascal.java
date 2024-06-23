package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pascal {

	public static void pascal(int n) {
		int p;
		int x = 0;
		int[] a = new int[n];
		a[0] = 1;
		for (int i = 0; i < n; i++) {
			p = 0;
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				x = a[j];
				a[j] = p + x;

				System.out.print(a[j] + " ");

				p = x;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("please enter n: ");
		int n = Integer.parseInt(bf.readLine());
		pascal(n);
	}

}
