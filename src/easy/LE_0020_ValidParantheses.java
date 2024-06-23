package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class LE_0020_ValidParantheses {

	public static char[] stack;
	public static int top = -1;

	public static boolean isEmpty() {
		if (stack == null || stack.length == 0 || top == -1) {
			return true;
		}
		return false;
	}

	public static char pop() {
		if (isEmpty()) {
			return '#';
		}
		char x = stack[top];
		top--;
		return x;
	}

	public static void push(char c) {
		top++;
		stack[top] = c;

	}

	public static boolean isValid2(String s) {
		stack = new char[s.length()];
		top = -1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '{' || c == '(') {
				push(c);
			} else {
				char t = pop();
				if ((t != '[' && c == ']') || (t != '{' && c == '}') || (t != '(' && c == ')')) {
					return false;
				}
			}
		}
		if (!isEmpty()) {
			return false;
		}
		return true;

	}

	public static boolean isValid(String s) {
		char[] strArr = new char[s.length()];
		for (int i = 0, j = -1; i < s.length(); i++) {
			char c = s.charAt(i);
			if (j >= 0 && ((c == ']' && strArr[j] == '[') || (c == '}' && strArr[j] == '{')
					|| (c == ')' && strArr[j] == '('))) {
				strArr[j] = '#';
				j--;
			} else {
				j++;
				strArr[j] = c;
			}

		}
		System.out.println(strArr[0]);
		if (strArr[0] != '#') {
			return false;
		}
		return true;
	}

	public static boolean isValid3(String s) {

		 Stack<String> stack = new Stack<String>();
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
	                stack.push(s.charAt(i) + "");
	            } else {
	                if (
	                    (!stack.isEmpty() && stack.peek().equals("[") && s.charAt(i) == ']') || 
	                    (!stack.isEmpty() && stack.peek().equals("{") && s.charAt(i) == '}') || 
	                    (!stack.isEmpty() && stack.peek().equals("(") && s.charAt(i) == ')')
	                   ) 
	                {
	                    stack.pop();
	                } else {
	                    return false;
	                }
	            }
	        }
	        if (!stack.isEmpty()) {
	            return false;
	        }
	        return true;
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
