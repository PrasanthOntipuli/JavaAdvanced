package com.prasanthLinkedlist.basics;

import java.util.Random;

import LinkedListStructure.Linkedlist1;
import LinkedListStructure.Node;

public class Problem1 
{
	
    static	Linkedlist1 l=new Linkedlist1();
    
	public static void addNode(int data)
	{
		l.addAtFirst(new Node(null,data));	
	}
	
	public static void main(String[] args) {
	
		Random ran=new Random();
		
		
    for(int i=0;i<24;i++)
    {
	  
    	addNode(ran.nextInt(12)+3);	
    	
    }
    l.diplayData();
    for(int i=0;i<5;i++)
    {
  boolean flag=  l.swapTwoNodes(ran.nextInt(12)+3, ran.nextInt(12)+3);
  if(flag)
    {
    l.diplayData();
    System.out.println("");
    }
    }
	}
}
