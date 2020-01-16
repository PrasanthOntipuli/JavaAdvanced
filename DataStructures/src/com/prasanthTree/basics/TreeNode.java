package com.prasanthTree.basics;

public class TreeNode implements Comparable<TreeNode>{

	private int       data = 0;
	private TreeNode  left = null;
	private TreeNode right = null;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public TreeNode(int data, TreeNode left, TreeNode right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public TreeNode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TreeNode(int data) {
		super();
		this.data = data;
	}
	@Override
	public int compareTo(TreeNode o) {
	
		return 0;
	}
	
	
	
	
	
}
