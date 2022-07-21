package Fourteen;

public class linkedList {
	private node head;
	private node tail;
	private node previousNode;
	
	public node push(int data){
		node newNode = new node(data);		
		if(head == null){
			head = newNode;
			tail = newNode;
		} else {
			node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
		return newNode;
	}

	public void print() {
		if (head == null){
			System.out.println("LinkedList is empty");
		} else {
			node temp = head;
			while(temp != null){
				System.out.println(temp.data+ " ");
				temp = temp.next;
			}
		}
	}

	public void append(int data) {
		node newNode = new node(data);		
		if(head == null){
			head = newNode;
			tail = newNode;
		} else {
			
			this.tail.next = newNode;
			tail = newNode;
		}
	}

	public void addAtTheBetween(node firstNode, node newNode) {
		node tempNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = tempNode;
	}
}