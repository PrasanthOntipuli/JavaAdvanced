package com.prasanthTree.basics.structure;

import java.util.Random;

import com.prasanthTree.basics.BinarySearchTree;

public class BinaryTreeImplimentation {

static 	BinarySearchTree b=new BinarySearchTree();
	
	public static void main(String[] args) {
	Random ran=new Random();

    for(int i=0;i<24;i++)
    {
	    int a=ran.nextInt(23)+2;
    	b.add(a);	
    	System.out.print(" "+a);
    }
    System.out.println("\n "+b.getSize());
    b.display();
	}
	
}
