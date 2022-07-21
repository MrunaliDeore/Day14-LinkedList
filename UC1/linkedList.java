package UC1;

public class linkedList {
	public static void main(String[] args){
		node firstNode = new node(56);
		node secondNode = new node(30);
		node thirdNode = new node(70);

		node head = firstNode;
		firstNode.next = secondNode;
		secondNode.next = thirdNode;

		node temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
