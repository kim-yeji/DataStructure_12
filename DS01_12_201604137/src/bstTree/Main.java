package bstTree;

public class Main {

	public static void main(String[] args) {
		BinaryTree treeA = new BinaryTree("C");
		treeA.insertKey("D");
		treeA.insertKey("B");
		treeA.insertKey("G");
		treeA.insertKey("A");
		treeA.insertKey("E");
		treeA.insertKey("F");
		System.out.println("treeA: "+treeA);
		System.out.println("treeA.isBST(): "+treeA.isBST());
	}

}
