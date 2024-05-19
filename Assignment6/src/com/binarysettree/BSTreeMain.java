package com.binarysettree;

public class BSTreeMain {

	public static void main(String[] args) {

		Tree t1 = new Tree();

		t1.addNode(8);
		t1.addNode(3);
		t1.addNode(10);
		t1.addNode(6);
		t1.addNode(1);
		t1.addNode(14);
		t1.addNode(13);
		t1.addNode(7);
		t1.addNode(4);
		
		t1.addNodeRecursion(89);

//		if(t1.binarySearch(7)!=null)
//			System.out.println("Key found");
//		else
//			System.out.println("Key not found");

//		if (t1.RecursiveBinarySearch(7) != null)
//			System.out.println("Key found");
//		else
//			System.out.println("Key not found");

		t1.preOrder();
		System.out.println();
		t1.inOrder();
		System.out.println();
		t1.postOrder();
	}
}
