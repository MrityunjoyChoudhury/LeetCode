package tree;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class ViewTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Demo");
		
		DefaultMutableTreeNode node = new DefaultMutableTreeNode("1 \n + +");
		//DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("+");
		//DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("+");
		//node.add(node1);
		//node.add(node2);
		JTree tree = new JTree(node);
		tree.setDragEnabled(true);
		tree.putClientProperty("JTree.lineStyle", "Vertical");
		frame.add(tree);
	      frame.setSize(550,400);
	      frame.setVisible(true);

	}

}
