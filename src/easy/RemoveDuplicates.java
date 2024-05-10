package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicates {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the array: ");
		String[] inpArr = bf.readLine().split(" ");
		int prev, prevIndx;
		int[] num = new int[inpArr.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(inpArr[i]);
		}
		prev = num[0];
		prevIndx = 0;
		for (int i = 1; i < num.length; i++) {
			if (num[i] != prev) {
				prevIndx++;
				prev = num[i];
				num[prevIndx] = num[i];
			}
		}
		for (int i = 0; i < prevIndx + 1; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
