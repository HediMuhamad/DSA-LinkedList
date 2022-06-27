package data_structures.LinkedList;

/**
 * @author Hedi Muhammad
 * @version 1.0
 * @since 27 June 2022
 * @see https://github.com/HediMuhamad/DSA-LinkedList.git
 * 
 * {@code LinkedList} is a Java class which it's object represents a LinkedList data structure.
 * We built some methods in order to increase the speed of using while development, the list of
 * the methods: {@code getAsNode, get, getFirst, getLast, popFirst, popLast, set, setAll, add, addAll, pushFirst,
 * pushLast, remove, removeAll, delete, deleteAll, find, findInLast, size, isEmpty, reverse, toString}.
 * 
 * */

public class LinkedList<T>{

	private Node<T> lastNode = null;
	private int size=0;
	

	/** Gets the node in the specified index.
	 * @param from Specified index.
	 * @return The node in the specified index.
	 */
	private Node<T> getAsNode(int from) {
		
		if(from>=size || 0>from) {
			return null; 
		}
				
		if(from==size-1) {
			return lastNode;
		}
		
		Node<T> node = lastNode.getNextNode();
		
		for(int i=0;i<from;i++) {
			node = node.getNextNode();
		}
		
		return node;
	}
	
	/** Gets the node's value in the specified index.
	 * @param from Specified index.
	 * @return The node's value in the specified index.
	 */
	public T get(int from) {
		return getAsNode(from).getValue();
	}
	
	/** Gets the first node's value.
	 * @return The first node's value in the LinkedList.
	 * */
	public T getFirst() {
		return get(0);
	}
	
	/** Gets the last node's value.
	 * @return The last node's value in the LinkedList.
	 * */
	public T getLast() {
		return get(size-1);
	}
	
	/** Gets the first node's value and removes the node.
	 * @return The first node's value in the LinkedList.
	 */
	public T popFirst() {
		T firstNodeValue = get(0);
		getAsNode(size-1).setNextNode(getAsNode(1));
		return firstNodeValue;
	}
	
	/** Gets the last node's value and removes the node.
	 * @return The the last node's value in the LinkedList.
	 */
	public T popLast() {
		T lastNodeValue = get(size-1);
		Node<T> firstNode = getAsNode(0);
		lastNode = getAsNode(size-2);
		getAsNode(size-1).setNextNode(firstNode);
		return lastNodeValue;
	}
	
	/** Sets the specified value into specified index.
	 * @param in Specified index.
	 * @param value Specified value.
	 * @return A boolean variable type, True if succeed, False if failed.
	 */
	public boolean set(int in, T value) {
		Node<T> node = getAsNode(in);
		
		if(node!=null) {
			node.setValue(value);
			return true;
		}
		
		return false;
	}
	
	/** Sets the specified values into specified index.
	 * @param in Specified index which the process starts from.
	 * @param values Specified values.
	 */
	public boolean setAll(int in, T[] values) {
		if(0>in || size-in<values.length) {
			return false;
		}
		
		for(int i=0;i<values.length;i++) {
			set(i+in, values[i]);
		}
		
		return true;
	}
	
	/** Sets the specified values into specified indexes.
	 * @param in Specified indexes.
	 * @param values Specified values.
	 */
	public boolean setAll(int[] in, T[] values) {
		if(values.length!=in.length || size-values.length<values.length) {
			return false;
		}

		for(int i=0;i<in.length;i++) {
			if(0>in[i] || in[i]>=size) {
				return false;
			}
		}
		
		for(int i=0;i<values.length;i++) {
			set(in[i], values[i]);
		}
		
		return true;
	}

	/** Adds a single node with specified value to the end of the LinkedList.
	 * @param value Specified value.
	 */
	public boolean add(T value) {
		Node<T> newNode = new Node<T>(value);
		
		if(size==0) {
			newNode.setNextNode(newNode);
		}else {
			newNode.setNextNode(getAsNode(0));
			getAsNode(size-1).setNextNode(newNode);			
		}
		
		lastNode = newNode;
		size++;
		
		return true;
	}
	
	/** Adds a single node from the specified index with specified value.
	 * @param from Specified index.
	 * @param value Specified value.
	 */
	public boolean add(int from, T value) {
		
		if(0>from) {
			return false;
		}

		if(from>=size) {
			for(int i=size;i<size+(from-size);i++) {
				add(null);
			}
			add(value);
			return true;
		}
		

		Node<T> newNode= new Node<T>(value),
				previousNode=null,
				nextNode=null;
		
		if(from==0) {
			newNode.setNextNode(getAsNode(0));
			getAsNode(size-1).setNextNode(newNode);
			size++;
		}else if(from==size){
			add(value);
		}else {
			previousNode = getAsNode(from-1);
			nextNode = previousNode.getNextNode();
			
			newNode.setNextNode(nextNode);
			previousNode.setNextNode(newNode);

			size++;
		}
		
		
		return true;
	}
	
	/** Adds multiple nodes from the specified indexes with specified value.
	 * @param from Specified index which process starts from.
	 * @param values Specified values.
	 */
	public boolean addAll(int from, T[] values) {
		if(0>from) {
			return false;
		}
		
		for(int i=0;i<values.length;i++) {
			add(i+from, values[i]);
		}
		
		return true;
	}
	
	/** Adds multiple nodes to specified indexes with specified values.
	 * @param from Specified indexes indicates the index of corresponding specified values.
	 * @param values Specified values.
	 */
	public boolean addAll(int[] from, T[] values) {
		
		if(from.length!=values.length) {
			return false;
		}
		
		for(int i=0;i<from.length;i++) {
			if(0>from[i]) {
				return false;
			}
		}
		
		for(int i=0;i<values.length;i++) {
			add(from[i], values[i]);
		}
		
		return true;
	}

	/** Adds a single node at first with specified value.
	 * @param value Specified value.
	 */
	public boolean pushFirst(T value) {
		add(0, value);
		return true;
	}

	/** Adds a single node to the end with specified value.
	 * @param value Specified value.
	 */
	public boolean pushLast(T value) {
		add(value);
		return true;
	}
	
	/** Removes a single node in the array if it's value is equal to specified value.
	 * @param value The specified value.
	 * @return The removed index or (-1) if failed.
	 * */
	public int remove(T value) {
		return remove(0, value);
	}
	
	/** Removes a single node in the array which placed in or after index {@code from} and it's value is equal to specified value.
	 * @param from The specified index.
	 * @param value The specified value.
	 * @return The removed index or (-1) if failed.
	 * */	
	public int remove(int from, T value) {
		return delete(find(from, value))==true ? 1 : -1 ;
	}
	
	/** Removes all nodes in the array which their values is equal to specified values.
	 * @param values The specified values.
	 * @return The removed indexes or (null) if failed.
	 * */	
	public int[] removeAll(T[] values) {
		return removeAll(0, values);
	}

	/** Removes all nodes in the array which they placed in or after index {@code from} and their values are equal to specified values.
	 * @param from The specified index.
	 * @param values The specified values.
	 * @return The removed indexes or (null) if failed.
	 * */	
	public int[] removeAll(int from, T[] values) {
		int[] result = new int[values.length];
		for(int i=0; i<result.length; i++) {
			result[i] = remove(from, values[i]);
		}
		return result;
	}


	/** Removes all nodes in the array which they placed in or after index corresponding index and their values are equal to specified values.
	 * @param from The specified indexes.
	 * @param values The specified values.
	 * @return The removed indexes or (null) if failed.
	 * */	
	public int[] removeAll(int[] from, T[] values) {
		if(from.length != values.length) {
			return null;
		}
		
		int[] result = new int[values.length];
		for(int i=0; i<result.length; i++) {
			result[i] = remove(from[i], values[i]);
		}
		return result;
	}

	/**	Deletes the node at specified index.
	 * @param index The specified index
	 * */
	public boolean delete(int index) {
		if(0>index || index>=size) {
			return false;
		}
		
		if(index==0) {
			getAsNode(size-1).setNextNode(getAsNode(1));
		}
		
		Node<T> previousNode = getAsNode(index-1);
		Node<T>	nextNode= previousNode.getNextNode().getNextNode();
		
		previousNode.setNextNode(nextNode);
		
		size--;
		
		return true;
	}

	/**	Deletes all nodes at specified indexes.
	 * @param indexes The specified indexes.
	 * */
	public boolean deleteAll(int[] indexes) {
		return deleteAll(indexes.length, indexes);
	}	

	/**	Deletes all elements at specified indexes.
	 * @param length Specified length to detect a limit to the deleting process.
	 * @param indexes The specified indexes.
	 * */
	public boolean deleteAll(int length, int[] indexes) {

		for(int i=0;i<length;i++) {
			if(0>indexes[i] || indexes[i]>=size) {
				return false;
			}
		}
		
		for(int i=0;i<length;i++) {
			delete(indexes[i]);
		}
		
		return true;
		
	}
	
	/**	Searches for a specific value using Linear Search.
	 * @param value Specified value.
	 * @return The first index which the value found in, if didn't it will return -1.
	 * */
	public int find(T value) {
		return find(0, value);
	}

	/**	Searches for a specific value using Linear Search, it starts at specified index.
	 * @param from Specified index which the process starts from.
	 * @param value Specified value.
	 * @return The first index which the value found in, if the index is equal or greater to {@code from}, if didn't it will return -1.
	 * */
	public int find(int from, T value) {

		if(0>from || from>=size) {
			return -1;
		}
		
		if(from==size-1) {
			return getAsNode(size-1).compareTo(value)==0 ? size-1 : -1;
		}
		
		Node<T> currentNode = getAsNode(0);
		
		for(int i=from;i<size;i++) {
			if(currentNode.compareTo(value)==0) {
				return i;
			}
			currentNode = currentNode.getNextNode();
		}
		
		return -1;
	}
	
	/**	Searches for a specific value using Linear Search.
	 * @param value Specified value.
	 * @return The last index which the value found in, if didn't it will return -1.
	 * */
	public int findInLast(T value) {
		return findInLast(size-1, value);
		
	}

	/**	Searches for a specific value using  Linear Search, it starts at specified index.
	 * @param from Specified index which the process starts from.
	 * @param value Specified value.
	 * @return The first index which the value found in, if the index is equal or minor to {@code from}, if didn't it will return -1.
	 * */
	public int findInLast(int from, T value) {

		if(0>from || from>=size) {
			return -1;
		}
		
		if(from==0) {
			return getAsNode(0).compareTo(value)==0 ? 0 : -1;
		}
		
		int foundIndex = -1;

		Node<T> currentNode = getAsNode(0);
		
		for(int i=0;i<=from;i++) {
			if(currentNode.compareTo(value)==0) {
				foundIndex = i;
			}
			currentNode = currentNode.getNextNode();
		}
		
		return foundIndex;
	}
	
	/**	Returns the size of the LinkedList.
	 * @return An integer value which represent the size of the LinkedList.
	 * */
	public int size() {
		return size;
	}
	
	/** Checks for the emptiness of the LinkedList.
	 * @return A boolean value, true if empty, and false if not.
	 * */
	public boolean isEmpty() {
		return size==0;
	}
	
	/**	Reverses the LinkedList nodes order.
	 * @throws CloneNotSupportedException 
	 * */
	public void reverse() throws CloneNotSupportedException {
		
		if(size<=1) {
			return;
		}
		
		Node<T> y = getAsNode(0);
		Node<T> x = getAsNode(size-1);
		lastNode = getAsNode(0);
		
		for(int i=0;i<size;i++) {
			Node<T> z = y.getNextNode();
			y.setNextNode(x);
			x=y;
			y=z;
		}
		
	}

	
	/**	Returns the values of the nodes in a readable text.
	 * @return A string value which contain all nodes value's.
	 * */
	@Override
	public String toString() {
		super.toString();

		if(size==0) {
			return "[]";
		}
		
		StringBuilder str = new StringBuilder();
		str.append("[");
		
		Node<T> node = getAsNode(0);
		
		for(int i=0;i<size-1;i++) {
			str.append(node.getValue() + ", ");
			node = node.getNextNode();
		}
		str.append(getAsNode(size-1).getValue() + "]");
		
		return str.toString();
	}
	
	
}

/** Node class, which it's instances are using to create nodes in the LinkedList.
 * */
class Node<T> implements Cloneable, Comparable<T>{
	
	private T value;
	private Node<T> nextNode = null;
	
	/** Default Constructor
	 * */
	Node() {
		
	}
	
	/**	Defined Constructor that sets node value directly.
	 * @param value The Node value.
	 * */
	Node(T value) {
		this.value = value;
	}
	
	/**	Returns the node value
	 * @return Node value
	 * */
	public T getValue() {
		return value;
	}
	
	/** Sets the node value.
	 * @param value The value which user want to set.
	 * */
	public void setValue(T value) {
		this.value = value;
	}
	
	/** Returns the next node of the current node.
	 * @return The next node of the current node.
	 * */
	public Node<T> getNextNode() {
		return nextNode;
	}

	/** Sets the next node of the current node.
	 * */
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Node<T> clone() throws CloneNotSupportedException {
		return (Node<T>) super.clone();
	}

	@Override
	public int compareTo(T o) {
		
		if(this.getValue()==null) {
			return o==null ? 0 : -1;
		}
		
		return this.getValue().equals(o) ? 0 : -1;
	}
	
}