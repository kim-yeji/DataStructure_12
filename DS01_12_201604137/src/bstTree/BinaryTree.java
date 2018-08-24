package bstTree;

public class BinaryTree {
	private Object root;
	private BinaryTree left,right;
	
	public BinaryTree(Object root) {
		this.root=root;
		this.left=null;
		this.right=null;
	}
	
	public String toString() {
		StringBuffer buf = new StringBuffer("[");
		if(left!=null) buf.append(left+",");
		buf.append(root);
		if(right!=null) buf.append(","+right);
		return buf + "]";
	}

	public Boolean isBST() { 

		if(!(root instanceof Comparable)) return false;
		Comparable key = (Comparable) root;
		
		 //key값이 왼쪽트리들의 루트보다 작으면 안됨
		if(key.compareTo(this.left.getRoot())<0) return false; 
		
		return true;
	}
	
	public void insertKey(Object data) {
		Comparable key = (Comparable) root;
		if(key.compareTo(data)<0) { //추가하려는 데이터가 root보다 클 경우 (오른쪽)
			//root의 right가 null이 아닐 때 재귀호출
			if(this.right != null) {
				this.right.insertKey(data);
			}
			//root의 right가 null일 때 객체 생성 후 값을 넣는다
			else {
				right = new BinaryTree(data);
			}
		}
		else { //추가하려는 데이터가 root보다 작을 경우(왼쪽)
			//root의 left가 null이 아닐 때
			if(this.left != null) {
				this.left.insertKey(data);
			}
			//root의 left가 null일 때
			else {
				left = new BinaryTree(data);
			}
		}		
		
	}
	
	
	public Object getRoot() {
		return root;
	}

	public void setRoot(Object root) {
		this.root = root;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	
}
