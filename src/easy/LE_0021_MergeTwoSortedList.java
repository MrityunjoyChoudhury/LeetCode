package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LE_0021_MergeTwoSortedList {

	public static ListNode createList(String s) {
		String[] strArr = s.split(" ");
		ListNode list = null;
		for (int i = 0; i < strArr.length; i++) {

			addNode(list, Integer.parseInt(strArr[i]));
			//System.out.println("i: " + i +" arr val:  "+Integer.parseInt(strArr[i])+" List so far " + showList(list)+" list Val : "+list.val);
		}
		return list;
	}

	public static void addNode(ListNode head, int n) {

		ListNode newNode = new ListNode(n);
		
		if (head == null) {
			System.out.println("in add node");
			head = newNode;
		} else {
			ListNode t = head;
			while (t.next != null) {
				t = t.next;
			}
			System.out.println(t.val);
			t.next = newNode;
		}

	}

	public static String showList(ListNode head) {
		StringBuffer sb = new StringBuffer();
		while (head != null) {
			sb.append(head.val);
			head = head.next;
		}
		return sb.toString();
	}

	public static ListNode mergeLists(ListNode n1, ListNode n2) {

		ListNode mergedList = null;

		if (n2 == null) {
			return n1;
		} else if (n1 == null) {
			return n2;
		}

		if (n1.val < n2.val) {
			mergedList = n1;
			n1 = n1.next;
		} else {
			mergedList = n2;
			n2 = n2.next;
		}

		ListNode nextNode = n1;
		while (nextNode != null) {

		}

		return mergedList;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		ListNode l1 = null, l2 = null;
		System.out.print("enter the first list: ");
		l1 = createList(bf.readLine());
		// System.out.println();
		System.out.print("enter the second list: ");
		l2 = createList(bf.readLine());
		System.out.println("the first list: " + showList(l1));
		System.out.println("the second list: " + showList(l2));
	}

}
