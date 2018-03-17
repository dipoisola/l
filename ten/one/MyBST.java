package l.ten.one;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

// Demo code for the user implementation of Binary search tree
public class MyBST {
	/** The tree root. */
	private BinaryNode root;
	int size;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(BinaryNode t) {
		if (t != null) {
			System.out.print(t.element + ",");
			printTree(t.left);
			printTree(t.right);
		}
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			printTree(t.right);
			System.out.print(t.element + ",");
		}
	}

	public boolean contains(Integer key) {
		while (root != null) {
			if (root.element.compareTo(key) == 0) {
				return true;
			} else if (key.compareTo(root.element) < 0 && root.left != null) {
				root = root.left;
				contains(key);
			} else if (key.compareTo(root.element) > 0 && root.right != null) {
				root = root.right;
				contains(key);
			} else {
				return false;
			}
		}

		return false;
	}

	public Integer getRoot() {
		return root.element;
	}

	public Integer leafNodes() {
		return leafNodes(root);
	}

	private int leafNodes(BinaryNode t) {
		BinaryNode temp = t;
		
		if (t == null) return 0;
		
		if (temp.right == null && temp.left == null) {
			return 1;
		} else if (temp.right != null) {
			return 1 + leafNodes(temp.right);
		} else {
			return 1 + leafNodes(temp.right);
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public Integer findMin() {
	      return findMin(root);
	}
	
	private Integer findMin(BinaryNode t) {
		BinaryNode temp = t;
		
		while (temp.left != null) {
			temp = temp.left;
		}
		
		return temp.element;
	}
	
	public Integer findMax() {
	      return findMax(root);
	}
	
	private Integer findMax(BinaryNode t) {
		BinaryNode temp = t;
		
		while(temp.right != null) {
			temp = temp.right;
		}
		
		return temp.element;
	}

	// Assume the data in the Node is an Integer.
	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}

				}
				// if a node already exists
				else {
					inserted = true;
				}

			}

		}
		
		size++;
	}

	private class BinaryNode {

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
		// Constructors

		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {

		MyBST mybst = new MyBST();

		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };

		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);

		}
		mybst.insert(12);
		mybst.printTree();
//		System.out.println(mybst.contains(2));
		System.out.println(mybst.leafNodes());

		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int j = 0; j < a.length; j++) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();
			Integer nextItem = null;
			while (it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			}
			System.out.println();
		}

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11) + ", " + map.get(10);
		System.out.println(str);

	}
}
