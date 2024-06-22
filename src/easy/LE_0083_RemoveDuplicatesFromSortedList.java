package easy;

import java.io.IOException;
import java.util.Scanner;

public class LE_0083_RemoveDuplicatesFromSortedList {

	public static void removeDup(ListNode head) {
		if (head == null)
			return;
		ListNode prevNode = head;
		int prevVal = head.val;

		ListNode t = head.next;
		while (t != null) {
			int curVal = t.val;
			if (curVal == prevVal) {
				prevNode.next = t.next;
			} else {
				prevVal = curVal;
				prevNode = t;
			}
			t = t.next;
		}

	}

	public static void showList(ListNode head) {
		StringBuilder sb = new StringBuilder();
		ListNode t = head;
		while (t != null) {
			sb.append(t.val + " ");
			t = t.next;
		}
		System.out.println("The list is : " + sb);
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ListNode head = null;
		String userInput;
		while (true) {
			System.out.print("do you want to insert a node : (val|N)? ");
			userInput = scanner.next();
			if (userInput.charAt(0) == 'N') {
				break;
			}
			if (head == null) {
				head = new ListNode(Integer.parseInt(userInput), null);
			} else {
				ListNode t = head;
				while (t.next != null) {
					t = t.next;
				}
				t.next = new ListNode(Integer.parseInt(userInput), null);
			}
		}

		showList(head);
		removeDup(head);
		showList(head);
		scanner.close();
	}
}
