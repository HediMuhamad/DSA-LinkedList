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

	private Node<T> firstNode = null;
	private Node<T> lastNode = null;
	private int size=0;
	

	/** Gets the node in the specified index.
	 * @param from Specified index.
	 * @return The node in the specified index.
	 */
	private Node<T> getAsNode(int from) {
		return null;
	}
	
	/** Gets the node's value in the specified index.
	 * @param from Specified index.
	 * @return The node's value in the specified index.
	 */
	public T get(int from) {
		return null;
	}
	
	/** Gets the first node's value.
	 * @return The first node's value in the LinkedList.
	 * */
	public T getFirst() {
		return null;
	}
	
	/** Gets the last node's value.
	 * @return The last node's value in the LinkedList.
	 * */
	public T getLast() {
		return null;
	}
	
	/** Gets the first node's value and removes the node.
	 * @return The first node's value in the LinkedList.
	 */
	public T popFirst() {
		return null;
	}
	
	/** Gets the last node's value and removes the node.
	 * @return The the last node's value in the LinkedList.
	 */
	public T popLast() {
		return null;
	}
	
	/** Sets the specified value into specified index.
	 * @param in Specified index.
	 * @param value Specified value.
	 * @return A boolean variable type, True if succeed, False if failed.
	 */
	public boolean set(int in, T value) {
		return false;
	}
	
	/** Sets the specified values into specified index.
	 * @param in Specified index which the process starts from.
	 * @param values Specified values.
	 */
	public boolean setAll(int in, T[] values) {
		return false;
	}
	
	/** Sets the specified values into specified indexes.
	 * @param in Specified indexes.
	 * @param values Specified values.
	 */
	public boolean setAll(int[] in, T[] values) {
		return false;
	}

	/** Adds a single node with specified value to the end of the LinkedList.
	 * @param value Specified value.
	 */
	public boolean add(T value) {
		return false;
	}
	
	/** Adds a single node from the specified index with specified value.
	 * @param from Specified index.
	 * @param value Specified value.
	 */
	public boolean add(int from, T value) {
		return false;
	}
	
	/** Adds multiple nodes from the specified indexes with specified value.
	 * @param from Specified index which process starts from.
	 * @param values Specified values.
	 */
	public boolean addAll(int from, T[] values) {
		return false;
	}
	
	/** Adds multiple nodes to specified indexes with specified values.
	 * @param from Specified indexes indicates the index of corresponding specified values.
	 * @param values Specified values.
	 */
	public boolean addAll(int[] from, T[] values) {
		return false;
	}

	/** Adds a single node at first with specified value.
	 * @param value Specified value.
	 */
	public boolean pushFirst(T value) {
		return false;
	}

	/** Adds a single node to the end with specified value.
	 * @param value Specified value.
	 */
	public boolean pushLast(T value) {
		return false;
	}
	
	/** Removes a single node in the array if it's value is equal to specified value.
	 * @param value The specified value.
	 * @return The removed index or (-1) if failed.
	 * */
	public int remove(T value) {
		return -1;
	}
	
	/** Removes a single node in the array which placed in or after index {@code from} and it's value is equal to specified value.
	 * @param from The specified index.
	 * @param value The specified value.
	 * @return The removed index or (-1) if failed.
	 * */	
	public int remove(int from, T value) {
		return -1;
	}
	
	/** Removes all nodes in the array which their values is equal to specified values.
	 * @param values The specified values.
	 * @return The removed indexes or (null) if failed.
	 * */	
	public int[] removeAll(T[] values) {
		return null;
	}

	/** Removes all nodes in the array which they placed in or after index {@code from} and their values are equal to specified values.
	 * @param from The specified index.
	 * @param values The specified values.
	 * @return The removed indexes or (null) if failed.
	 * */	
	public int[] removeAll(int from, T[] values) {
		return null;
	}


	/** Removes all nodes in the array which they placed in or after index corresponding index and their values are equal to specified values.
	 * @param from The specified indexes.
	 * @param values The specified values.
	 * @return The removed indexes or (null) if failed.
	 * */	
	public int[] removeAll(int[] from, T[] values) {
		return null;
	}

	/**	Deletes the node at specified index.
	 * @param index The specified index
	 * */
	public boolean delete(int index) {
		return false;
	}

	/**	Deletes all nodes at specified indexes.
	 * @param indexes The specified indexes.
	 * */
	public boolean deleteAll(int[] indexes) {
		return false;
	}	

	/**	Deletes all elements at specified indexes.
	 * @param length Specified length to detect a limit to the deleting process.
	 * @param indexes The specified indexes.
	 * */
	public boolean deleteAll(int length, int[] indexes) {		
		return false;
	}
	
	/**	Searches for a specific value using Linear Search.
	 * @param value Specified value.
	 * @return The first index which the value found in, if didn't it will return -1.
	 * */
	public int find(T value) {
		return -1;
	}

	/**	Searches for a specific value using Linear Search, it starts at specified index.
	 * @param from Specified index which the process starts from.
	 * @param value Specified value.
	 * @return The first index which the value found in, if the index is equal or greater to {@code from}, if didn't it will return -1.
	 * */
	public int find(int from, T value) {
		return -1;
	}
	
	/**	Searches for a specific value using Linear Search.
	 * @param value Specified value.
	 * @return The last index which the value found in, if didn't it will return -1.
	 * */
	public int findInLast(T value) {
		return -1;
	}

	/**	Searches for a specific value using  Linear Search, it starts at specified index.
	 * @param from Specified index which the process starts from.
	 * @param value Specified value.
	 * @return The first index which the value found in, if the index is equal or minor to {@code from}, if didn't it will return -1.
	 * */
	public int findInLast(int from, T value) {
		return -1;
	}
	
	/**	Returns the size of the LinkedList.
	 * @return An integer value which represent the size of the LinkedList.
	 * */
	public int size() {
		return -1;
	}
	
	/** Checks for the emptiness of the LinkedList.
	 * @return A boolean value, true if empty, and false if not.
	 * */
	public boolean isEmpty() {
		return false;
	}
	
	/**	Reverses the LinkedList nodes order.
	 * @throws CloneNotSupportedException 
	 * */
	public void reverse() throws CloneNotSupportedException {
	}
	
	/**	Returns the values of the nodes in a readable text.
	 * @return A string value which contain all nodes value's.
	 * */
	@Override
	public String toString() {
		return super.toString();
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
	}
	
	/**	Returns the node value
	 * @return Node value
	 * */
	public T getValue() {
		return null;
	}
	
	/** Sets the node value.
	 * @param value The value which user want to set.
	 * */
	public void setValue(T value) {
	}
	
	/** Returns the next node of the current node.
	 * @return The next node of the current node.
	 * */
	public Node<T> getNextNode() {
		return null;
	}

	/** Sets the next node of the current node.
	 * */
	public void setNextNode(Node<T> nextNode) {
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Node<T> clone() throws CloneNotSupportedException {
		return (Node<T>) super.clone();
	}

	@Override
	public int compareTo(T o) {
		return -1;
	}
	
}