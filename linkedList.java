package Fourteen;

public class linkedList {
	node head;
	node tail;
	node previousNode;

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

	public void addAtTheBetween(node previousNode, node newNode) {
		node tempNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = tempNode;
	}

	public node popfirst(){
		node tempNode = this.head;
		this.head = head.next;
		return tempNode;
	}

	public node poplast(){		
		if(head == null) {
			System.out.println("List is empty");
		}		
		node lastNode = head;
		node previousToLastNode = null;
		while(lastNode.next != null) {
			previousToLastNode = lastNode;
			lastNode = lastNode.next;
		}
		previousToLastNode.next = null;
		return lastNode;
	}

	public void insertAtPosition(int nodeValue,int position) {
		if(position<0) {
			System.out.println("Invalid Value of position ="+position);
		}
		node newNode = new node(nodeValue);
		if(position == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		node currentNode = head;
		for (int i = 0; i < position-2; i++) {
			currentNode = currentNode.next;

			if(currentNode == null) {
				System.out.println("Valus of position ="+position+" is greater than number of nodes in the list!!");
			}
		}		
		newNode.next = currentNode.next;
		currentNode.next = newNode;
	}


	
	
}