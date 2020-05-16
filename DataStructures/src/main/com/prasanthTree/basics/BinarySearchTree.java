package com.prasanthTree.basics;

import java.util.LinkedList;

public class BinarySearchTree {

	private TreeNode root=null;
	private int size=0;
	private int height=0;
	private Boolean leftBalanced=null;
	public TreeNode getRoot() {
		return root;
	}
	private void setRoot(TreeNode root) {
		this.root = root;
	}
	public int getSize() {
		return size;
	}
	private void setSize(int size) {
		this.size = size;
	}
	public int getHeight() {
		return height;
	}
	private void setHeight(int height) {
		this.height = height;
	}
	public Boolean getLeftBalanced() {
		return leftBalanced;
	}
	private void setLeftBalanced(Boolean leftBalanced) {
		this.leftBalanced = leftBalanced;
	}
	public BinarySearchTree(int size, int height, Boolean leftBalanced) {
		super();
		this.size = size;
		this.height = height;
		this.leftBalanced = leftBalanced;
	}
	public BinarySearchTree() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/// methods 
	
	public void add(Integer data)
	{
		if(root==null)
		{
			this.root=new TreeNode(data);
			size++;
			return;
		}
		//System.out.println("size "+size);
		int temp=this.getSize();
		TreeNode tempNode=null;
		TreeNode node=this.getRoot();
		while(temp>0)
		{
			//System.out.println("entred");
			if(node.getData()>data)
			{
				if(node.getLeft()==null)
				{
					node.setLeft(new TreeNode(data));
					this.size++;
					break;
				}
				node=node.getLeft();
			//	System.out.println("left data ::"+data+ "  Node is"+node);
				
				//continue;
			}
			else
			{
				if(node.getRight()==null)
				{
					node.setRight(new TreeNode(data));
					this.size++;
					break;
				}
				
				node=node.getRight();
				//System.out.println("right data ::"+data+ "  Node is"+node);
			}
			
			temp--;
			
		}
			
	}
	
	
	public void display()
	{
		if(this.root==null)
		{
			return;
		}
		
		int temp=this.getSize();
		TreeNode node=this.root; 
		System.out.println("");
		LinkedList<TreeNode> que=new  LinkedList<TreeNode>();
		que.add(node);
		while(!que.isEmpty())
		{
			
			try
			{
				node=que.removeFirst();
			     System.out.print(" "+node.getData());
		//	System.out.println("current data ::"+q2);
			}
			catch (Exception npex) {
				
				System.out.println("execption"+npex);
			}
			
			
			if(node.getLeft()!=null)
			{
				//System.out.println("left data ::"+node.getLeft().getData());
                que.addLast(node.getLeft());
				
			}
			if(node.getRight()!=null)
			{
				
				//System.out.println("Right data ::"+node.getRight().getData());
				que.addLast(node.getRight());
				
			}
		
		}
		
	}
	
	
}
