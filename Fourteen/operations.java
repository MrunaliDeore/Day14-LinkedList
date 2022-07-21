package Fourteen;

public class operations {
	
	public static void addDataAtTheStart(){
		System.out.println("------------------------------------------------------------");
		System.out.println("Ability to create Linked List by adding 30 and 56 to 70 - UC2");
		linkedList linkedList = new linkedList();
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);
		linkedList.print();
	}
}
