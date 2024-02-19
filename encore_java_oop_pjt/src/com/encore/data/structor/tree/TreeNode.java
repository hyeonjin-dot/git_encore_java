package com.encore.data.structor.tree;

//이진 트리를 만들고 순회 방법을 확인해 볼 예정
public class TreeNode {

	private int data;
	private TreeNode leftNode;
	private TreeNode rightNode;
	
	public TreeNode() {}
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public TreeNode(int data, TreeNode leftNode, TreeNode rightNode) {
		this.data = data;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	
}
