package Fourteen;

public class linkedList {
	private node head;
	private node tail;
	
	public void push(int data){
		node newNode = new node(data);		
		if(head == null){
			head = newNode;
			node tail = newNode;
		} else {
			node temp = (node) head;
			this.head = newNode;
			newNode.next = temp;
		}
	}

	public void print() {
		// TODO Auto-generated method stub
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
}
