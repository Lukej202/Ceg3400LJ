package Labs;
public class LinkedList {

	private Node head;
	private Node tail;
	/**
	 * takes an item puts it into a node and puts that node into the List
	 * @param item the item to be put in the list
	 */
	public void add(String item) {
		
		Node newItem = new Node(item);
		
		// handles the case where the new item 
		// is the only thing in the list
		if (head == null) {
			head = newItem;
			tail = newItem;
			return;
		}
		
		tail.next = newItem;
		tail = newItem;
	}
	
	/**
	 * prints each node in the list by setting a new node current = to the head node
	 * and in the while loop it makes current = to whatever current.next is pointing too
	 * and if currents next pointer is null it stops
	 */
	public void print() {
		Node current = head;
		while (current != null) {
			System.out.println(current.item);
			current = current.next;
		}
	}
	
	/**
	 * gets the second to last item in the list
	 * it checks if there are no items in the list or only one if so it returns null
	 * if the list has more than 1 node in it, a new node current is created which is set = to head
	 * the while loop checks if two nodes from current = null by using .next.next on current 
	 * if it finds null it stops and returns currents item
	 * @return returns the second to last item in the list if 1 or less items are in the list it returns null
	 */
	public String getPenultimate() {
		if(head == null || head.next == null){
			return null;
		}
		Node current = head;
		while(current.next.next != null){
			current = current.next;
		}
		return current.item;
	}

	//named inner class for creating a node
	class Node {
		String item;
		Node next;
		/**
		 * constructor for the Node class sets the nodes item and the nodes next pointer to null
		 * @param item the item to be put in the node
		 */
		public Node(String item) {
			this.item = item;
			this.next = null;
		}
	}
}
