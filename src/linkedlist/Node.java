package linkedlist;

public class Node {
	private int val;
	private Node next;

	public Node(int x) {
		this.val = x;
		this.next = null;
	}

	public Node(int x, Node n) {
		this.val = x;
		this.next = n;
	}

	public int getVal() {
		return this.val;
	}

	public Node getNext() {
		return this.next;
	}

	public void setVal(int x) {
		this.val = x;
	}

	public void setNext(Node n) {
		this.next = n;
	}

	public String showNextNodes() {
		StringBuffer sb = new StringBuffer();
		Node tmpNode = this;
		while (tmpNode != null) {
			sb.append(this.getVal());
			tmpNode = tmpNode.getNext();
		}
		return sb.toString();
	}
	
	public Node getLastNode() {
		Node tmpNode = this;
		while (tmpNode.getNext() != null) {
			tmpNode = tmpNode.getNext();
		}
		return tmpNode;
	}
	
	public void addNode(Node  n) {
		this.getLastNode().setNext(n);
	}
	

}
