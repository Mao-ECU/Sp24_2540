package Lists;

public class SinglyLinkedList {
	class Node
	{
		int data;
		Node next;
	}
	
	private Node head;
	private int count;
	
	public SinglyLinkedList()
	{
		head = null;
		count = 0;
	}
	
	public void append(int a)
	{
		Node newNode = new Node();
		newNode.data = a;
		newNode.next = null;
		count++; 
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		Node c = head;
		while(c.next != null)
		{
			c = c.next;
		}
		
		c.next = newNode;
		
	}
	
	public void prepend(int a)
	{
		Node newNode = new Node();
		newNode.data = a;
		count++;
		
		newNode.next = head;
		head = newNode;
	}
	
	public boolean remove(int a)
	{
		Node c = head; 
		Node prev = null;

		while(c.data != a && c != null)
		{
			prev = c;
			c = c.next;
		}
		
		if(c == null)
		{
			return false;
		}
		
		prev.next = c.next;
		return true;
	}
	
	public void display()
	{
		Node c = head;
		
		while(c != null)
		{
			System.out.print(c.data + " ");
			c = c.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		SinglyLinkedList myList = new SinglyLinkedList();
		
		myList.append(10);
		myList.append(12);
		myList.prepend(5);
		myList.display();
		myList.remove(10);
		myList.display();
		
	}
}
