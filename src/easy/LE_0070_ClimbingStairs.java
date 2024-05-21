package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LE_0070_ClimbingStairs {

	public static int climbStairs(int n) {
		if (n < 4) {
			return n;
		}
		int[] a = new int[n];
		a[0] = 1;
		a[1] = 2;
		for (int i = 2; i < n; i++) {
			a[i] = a[i - 1] + a[i - 2];
		}
		return a[n - 1];

	}

	public static void printStais(int n) {
		for (int i = 0; i < (n / 2) + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("2 ");
			}
			for (int k = 0; k < n - 2 * i; k++) {
				System.out.print("1 ");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter n: ");
		int n = Integer.parseInt(bf.readLine());
		System.out.println("Output : " + climbStairs(n));
		printStais(n);

	}

}
