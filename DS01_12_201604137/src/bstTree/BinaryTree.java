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
		
		 //key���� ����Ʈ������ ��Ʈ���� ������ �ȵ�
		if(key.compareTo(this.left.getRoot())<0) return false; 
		
		return true;
	}
	
	public void insertKey(Object data) {
		Comparable key = (Comparable) root;
		if(key.compareTo(data)<0) { //�߰��Ϸ��� �����Ͱ� root���� Ŭ ��� (������)
			//root�� right�� null�� �ƴ� �� ���ȣ��
			if(this.right != null) {
				this.right.insertKey(data);
			}
			//root�� right�� null�� �� ��ü ���� �� ���� �ִ´�
			else {
				right = new BinaryTree(data);
			}
		}
		else { //�߰��Ϸ��� �����Ͱ� root���� ���� ���(����)
			//root�� left�� null�� �ƴ� ��
			if(this.left != null) {
				this.left.insertKey(data);
			}
			//root�� left�� null�� ��
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
