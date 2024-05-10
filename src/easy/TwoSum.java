package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TwoSum {
	public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] twoSum(int[] arr, int target) {
		int[] out = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(target - arr[i])) {
				out[0] = map.get(target - arr[i]);
				out[1] = i;
				return out;
			}
			map.put(arr[i], i);
		}
		return out;
	}

	public static void main(String args[]) {

		System.out.print("enter the array: ");
		try {
			String[] lineInput = bf.readLine().split(" ");
			int[] arr = new int[lineInput.length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(lineInput[i]);
			}
			System.out.println();
			System.out.print("the array is: ");
			display(arr);
			System.out.println();
			System.out.print("enter the target: ");
			int target = Integer.parseInt(bf.readLine());
		    display(twoSum(arr, target));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
