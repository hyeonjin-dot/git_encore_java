package com.encore.data.structor.tree;

//main - node 연결
public class TreeServiceImpl {
	
	public TreeServiceImpl() {}
	
	public TreeNode makeTree(int data, TreeNode left, TreeNode right) {
		return new TreeNode(data, left, right);
	}
	
	
	// 전위 순회 (뿌 왼 오)
	//0 1 3 7 8 4 9 10 2 5 11 6
	public void preOrder(TreeNode node) { // root가 들어오는 경우
		if (node != null) {
			System.out.print(node.getData() + "\t");
			preOrder(node.getLeftNode());
			preOrder(node.getRightNode());
		}
	}
	
	// 중위 순회 (왼 뿌 오)
	// 7 3 8 1 9 4 10 0 11 5 2 6
	public void inOrder(TreeNode node) {
		if (node != null) {
			inOrder(node.getLeftNode());
			System.out.print(node.getData() + "\t");
			inOrder(node.getRightNode());
		}
	}
	
	// 후위 순위 (왼 오 뿌)
	// 7 8 3 9 10 4 1 11 5 6 2 0
	public void postOrder(TreeNode node) {
		if (node != null) {
			postOrder(node.getLeftNode());
			postOrder(node.getRightNode());
			System.out.print(node.getData() + "\t");
		}
	}
}
