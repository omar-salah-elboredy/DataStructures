package LinkedLists;

public class LL implements MyLinkedlist {

	private Node head = null;

	public void add(int index, Object element) {
		Node NEW = new Node();
		NEW.setData(element);
		if (index == 0) {
			head = NEW;
			return;
		} else {
			Node temp = head;
			int tempI = 0;
			while (temp.getNext() != null) {
				if (tempI == index) {
					break;
				}
				tempI++;
				temp = temp.getNext();
			}
			temp.setNext(NEW);
		}

	}

	public void add(Object element) {
		Node NEW = new Node();
		NEW.setData(element);
		if (head == null) {
			head = NEW;
		} else {
			Node temp = head;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(NEW);
		}

	}

	public Object get(int index) {
		Node temp = head;
		int k = 0;
		if (k == index) {
			return temp.getData();
		}
		while (temp != null) {
			temp = temp.getNext();
			k++;
			if (k == index) {
				return temp.getData();
			}
		}
		return null;
	}

	public void set(int index, Object element) {

		if (index == 0) {
			head.setData(element);
			;
			return;
		} else {
			Node temp = head;
			int tempI = 0;
			while (temp.getNext() != null) {
				if (tempI == index) {
					break;
				}
				tempI++;
				temp = temp.getNext();
			}
			temp.setData(element);
		}

	}

	public void clear() {
		head = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public Object remove(int index) {
		Node temp = head;
		Node prev = head;
		if (head == null) {
			throw new IndexOutOfBoundsException("Linked list is already null");
		}
		if (index == 0) {
			head = head.getNext();
			return prev.getData();
		}
		int K = 0;
		while (temp.getNext() != null) {
			prev = temp.getNext();
			K++;
			if (K == index) {
				temp.setNext(temp.getNext().getNext());
				return prev.getData();
			}
			temp = temp.getNext();
		}
		throw new NullPointerException("Index out of boundaries");
	}

	public int size() {
		if (isEmpty()) {
			return 0;
		} else {
			int S = 0;
			Node temp = head;
			while (temp != null) {
				S++;
				temp = temp.getNext();
			}
			return S;
		}
	}

	public MyLinkedlist sublist(int fromIndex, int toIndex) {
		MyLinkedlist sl = new LL();
		if(toIndex > this.size()){
			throw new RuntimeException("Specified End Index out of boundaries!");
		}
		for (int i = fromIndex; i <= toIndex; i++) {
			sl.add(this.get(i));
		}
		return sl;
	}

	public boolean contains(Object o) {
		Node temp = head;
		if (isEmpty()) {
			return false;
		}
		while (temp != null) {
			if (temp.getData() == o) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

}
