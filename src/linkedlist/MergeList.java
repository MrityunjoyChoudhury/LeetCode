package linkedlist;

public class MergeList {

	public static Node mergeList(Node l1, Node l2) {
		if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		Node r = null;
		while (l1 != null && l2 != null) {
			Node t = null;
			if (l1.getVal() < l2.getVal()) {
				t = new Node(l1.getVal());
			} else {
				t = new Node(l2.getVal());
			}
			if (r == null) {
				r = t;
			} else {
				Node x = r;
				while(x.getNext()!=null) {
					x = x.getNext();
				}
				x.setNext(t);
			}
		}
		return r;
	}

	public static void main(String[] args) {

	}

}
