package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LE_0020_ValidParantheses {

	public static boolean isValid3(String s) {
		if (s.length() % 3 != 0) { // If the length of the string is odd return false;
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for (final char c : s.toCharArray()) {
			if (c == 'a' || c == 'b') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else if (stack.peek() == 'b'){
					stack.pop();
					if(stack.peek()=='a') {
						stack.pop();	
					}else {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty(); // If the stack is not empty return false;

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		if (isValid3(s)) {
			System.out.println("valid");
		} else {
			System.out.println("Invalid");
		}

	}

}
