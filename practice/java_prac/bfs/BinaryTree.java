public class BinaryTree {
	Node root;

	public Node add(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.left = add(current.left, value);
		} else if (value > current.value) {
			current.right = add(current.right, value);
		} else {
			return current;
		}
		return current;
	}

	public void insert(int value) {
		root = add(root, value);
	}

	public BinaryTree createBinaryTree() {
		BinaryTree bt = new BinaryTree();

		bt.insert(5);
		bt.insert(4);
		bt.insert(8);
		bt.insert(3);
		bt.insert(2);
		bt.insert(1);

		return bt;
	}
}