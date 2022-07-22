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

	public static void deleteAtLast() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Ability to delete the last element in the LinkedList of sequence 56->30->70 - UC6");
		linkedList linkedList = new linkedList();		
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);		
		System.out.println("Original LinkedList:");
		linkedList.print();
		node poplast = linkedList.poplast();
		System.out.println("After removing last Elememnt:");
		linkedList.print();

	}

	public static void insertAtPosition() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Ability to insert 40 after 30 to the Linked List sequence of 56->30->70 - UC8");
		linkedList linkedList = new linkedList();		
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);		
		System.out.println("Original LinkedList:");
		linkedList.print();
		int position = 2;
		int nodeValue = 40;
		System.out.println("Adding a Node with Value:"+nodeValue+" at position:"+position);
		linkedList.insertAtPosition(nodeValue, position);
		linkedList.print();
	}

	public static void deleteAtMiddle() {
		System.out.println("------------------------------------------------------------");
		System.out.println("Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3 - UC9");
		linkedList linkedList = new linkedList();		
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);		
		System.out.println("Original LinkedList:");
		linkedList.print();
		int position = 2;
		int nodeValue = 40;
		System.out.println("Adding a Node with Value:"+nodeValue+" at position:"+position);
		linkedList.insertAtPosition(nodeValue, position);
		linkedList.print();

		System.out.println("Delete a Node with Value:"+nodeValue+" at position:"+position);
		linkedList.deleteMid();
		linkedList.print();
	}

	public static void ascendingOrder() {
		linkedList linkedList = new linkedList();	
		node newNode;
		newNode = linkedList.newNode(70);
		linkedList.sortedInsert(newNode);
		newNode = linkedList.newNode(30);
		linkedList.sortedInsert(newNode);
		newNode = linkedList.newNode(40);
		linkedList.sortedInsert(newNode);
		newNode = linkedList.newNode(56);
		linkedList.sortedInsert(newNode);	
		System.out.println("Created Linked List");
		linkedList.print();
	}
}