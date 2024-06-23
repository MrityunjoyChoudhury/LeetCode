package medium;

import java.util.Scanner;

public class ListDemo {

	static ListNode head;

	public static ListNode createEmptyList() {
		head = new ListNode();
		return head;
	}

	public static ListNode addAtEnd(int x) {
		if (head == null) {
			head = new ListNode(x);
			return head;
		}
		ListNode t = head;
		while (t.next != null) {
			t = t.next;
		}
		t.next = new ListNode(x);
		return head;
	}

	public static ListNode addAtStart(int x) {
		if (head == null) {
			head = new ListNode(x);
			return head;
		}
		head = new ListNode(x, head);
		return head;
	}

	public static void showList() {
		ListNode t = head;
		StringBuilder sb = new StringBuilder();
		while (t != null) {
			sb.append(t.val + " ");
			t = t.next;
		}
		System.out.print(sb);
	}

	public static void showOptions() {
		System.out.println("******** Welcome to Lists ********");
		System.out.println("Options : ");
		System.out.println("1. Create an empty list");
		System.out.println("2. Add element at the end of list");
		System.out.println("3. Add element at the start of list");
		System.out.println("4. Show the list");
		System.out.println("5. Remove an elemnet from the list");
		System.out.println("6. Find an elemnet in the list");
		System.out.println("7. Delete the list");
		System.out.println("8. Reverse the list");
		System.out.println("9. Exit");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			showOptions();
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				head = createEmptyList();
				break;
			}
			case 2: {
				System.out.print("Enter value : ");
				int x = sc.nextInt();
				head = addAtEnd(x);
				break;
			}
			case 3: {
				System.out.print("Enter value : ");
				int x = sc.nextInt();
				head = addAtStart(x);
				break;
			}
			case 4: {
				System.out.print("The List  : ");
				showList();
				break;

			}
			default:
				
				break;
			}
		}
		sc.close();
	}
}
