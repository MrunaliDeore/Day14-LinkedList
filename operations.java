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

	public static void addAtTheEnd() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Ability to create Linked List by appending 30 and 70 to 56 - UC3");
		linkedList linkedList = new linkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();
	}

	public static void addAtTheBetween() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Ability to insert 30 between 56 and 70 - UC4");
		linkedList linkedList = new linkedList();
		node secondNode = linkedList.push(70);
		node firstNode = linkedList.push(56);
		node newNode = new node(30);
		System.out.println("Before : ");
		linkedList.print();
		linkedList.addAtTheBetween(firstNode, newNode);
		System.out.println("After : ");
		linkedList.print();
	}

	public static void deleteAtFirst() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Ability to delete the first element in the LinkedList of sequence 56->30->70 - Write pop method - UC5");
		linkedList linkedList = new linkedList();		
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);		
		System.out.println("Original LinkedList:");
		linkedList.print();
		node popfirst = linkedList.popfirst();
		System.out.println("After removing first Elememnt:");
		linkedList.print();
	}

	
}