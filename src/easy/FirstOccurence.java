package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstOccurence {

	public static int strStr(String haystack, String needle) {
		for (int i = 0, j = 0; i < haystack.length(); i++) {
			if (haystack.charAt(i) == needle.charAt(j)) {
				j++;
			} else {
				i = i - j;
				j = 0;
			}
			if (j == needle.length()) {
				return i + 1 - j;
			}
		}
		return -1;

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String haystack = bf.readLine();
		String needle = bf.readLine();
		System.out.println(strStr(haystack, needle));

	}

}
