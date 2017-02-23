package LinkedLists;

public class Node {
	private Object data;
	private Node next;

	public Object getData() {
		return data;
	}

	public void setData(Object element) {
		data = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString(){
		return data + " " + next;
	}

}
