package LinkedLists;

public interface MyLinkedlist {

	public void add(int index, Object element);

	public void add(Object element);

	public Object get(int index);

	public void set(int index, Object element);

	public void clear();

	public boolean isEmpty();

	public Object remove(int index);

	public int size();

	public MyLinkedlist sublist(int fromIndex, int toIndex);

	public boolean contains(Object o);
}
