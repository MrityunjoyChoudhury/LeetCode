package commonFunctions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonFunctions {

	public static int[] inputNumArr() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number array: ");
		String[] inputArr = null;
		int[] numArray = null;
		try {
			inputArr = bf.readLine().split("\\s+");
		} catch (IOException e) {
			e.printStackTrace();
		}
		numArray = new int[inputArr.length];
		int i = 0;
		for (String s : inputArr) {
			numArray[i] = Integer.parseInt(s);
			i++;
		}
		return numArray;

	}
	
	public static String showNumArr(int[] arr) {
		StringBuilder sb = new StringBuilder();
		for(int i : arr) {
			sb.append(i+" ");
		}
		return sb.toString();
	}

}
