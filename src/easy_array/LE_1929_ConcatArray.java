package easy_array;

import commonFunctions.CommonFunctions;

public class LE_1929_ConcatArray {

	public static int[] concatArry(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		int[] ans = new int[2 * nums.length];
		for (int i = 0; i < 2 * nums.length; i++) {
			ans[i] = nums[i % nums.length];
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = CommonFunctions.inputNumArr();
		System.out.println("The array: " + CommonFunctions.showNumArr(nums));
		System.out.println("The concatenated array: " + CommonFunctions.showNumArr(concatArry(nums)));

	}
}
