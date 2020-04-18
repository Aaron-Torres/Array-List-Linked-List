

// A simple Java program for traversal of a linked list 
class LinkedList { 
	static Node head; // head of list 

	/* Linked list Node. This inner class is made static so that 
	main() can access it */
	static class Node { 
		int data; 
		Node next; 
		Node(int d) { data = d; next=null; } // Constructor 
} 

	/* This function prints contents of linked list starting from head */
	public void printList() { 
		Node n = head; 
		while (n != null) { 
			System.out.print(n.data+" "); 
			n = n.next; 
		} //end while
	} //end printList
	
	/*This function insert node in front of linked list*/
	public void push(int new_data) { 
		/* 1 & 2: Allocate the Node & 
		Put in the data*/
		Node new_node = new Node(new_data); 

		/* 3. Make next of new Node as head */	
		new_node.next = head; 

		/* 4. Move the head to point to new Node */
		head = new_node; 
	}//end push method 

	/* Appends a new node at the end.  This method is  
   	defined inside LinkedList class shown above */
	public void append(int new_data) { 
    /* 1. Allocate the Node & 
       2. Put in the data 
       3. Set next as null */
		Node new_node = new Node(new_data); 
  
		/* 4. If the Linked List is empty, then make the 
           new node as head */
		if (head == null) { 
        head = new_node;
        return; 
    } //end if statement
  
    /* 4. This new node is going to be the last node, so 
         make next of it as null */
		new_node.next = null; 
  
    /* 5. Else traverse till the last node */
		Node last = head;  
		while (last.next != null) 
        last = last.next; 
  
    /* 6. Change the next of last node */
		last.next = new_node; 
		return; 
	}//end append
	
	/* Inserts a new node after the given prev_node. */
	public void insertAfter(Node prev_node, int new_data) { 
		/* 1. Check if the given Node is null */
		if (prev_node == null) { 
			System.out.println("The given previous node cannot be null"); 
			return; 
		}//end if statement 

		/* 2 & 3: Allocate the Node & 
		Put in the data*/
		Node new_node = new Node(new_data); 

		/* 4. Make next of new Node as next of prev_node */
		new_node.next = prev_node.next; 

		/* 5. make next of prev_node as new_node */
		prev_node.next = new_node; 
	}//end insertAfter
	
	/* Given a key, deletes the first occurrence of key in linked list */
	void deleteNode(int key) { 
		// Store head node 
		Node temp = head, prev = null; 

		// If head node itself holds the key to be deleted 
		if (temp != null && temp.data == key) { 
			head = temp.next; // Changed head 
			return; 
		}//end if statement 

		// Search for the key to be deleted, keep track of the 
		// previous node as we need to change temp.next 
		while (temp != null && temp.data != key) { 
			prev = temp; 
			temp = temp.next; 
		}//end while loop   

		// If key was not present in linked list 
		if (temp == null) return; 

		// Unlink the node from linked list 
		prev.next = temp.next; 
	}//end delete node 

	/* This function get data of first node of linked list */
	public void first_data() { 
		Node n = head; 
		System.out.println(n.data+" "); 
	}//end firstData 

	/* This function get data of last node of linked list */
	public void last_data() { 
		Node n = head; 
		while (n.next!= null) {  
			n = n.next; 
		}//end while loop
		
		System.out.print(n.data+" ");
	}//end last data
	
	//get specific node data
	public void specific_data(Node prev_node){
		Node n = head;
		while (n!=prev_node){
			n=n.next;
		}//end while
		System.out.print(n.data+" ");
	}//end specific data

	/* This function determines size of linkedlist */
	public int size() { 
		Node n = head; 
		int size = 0;
		while (n != null) {  
			n = n.next; 
			size++;
		} 
		return size;
	}//end size 

//Checks whether the value x is present in linked list 
    public boolean search(Node head, int x) 
    { 
        Node current = head;    //Initialize current 
        while (current != null) 
        { 
            if (current.data == x) 
                return true;    //data found 
            current = current.next; 
        } 
        return false;    //data not found 
    } 
    
     /* Function to reverse the linked list */
    public Node reverse(Node node) { 
    	
        Node prev = null; 
        Node current = node; 
        Node next = null; 
        
        while (current != null) { 
        	
        	//stores the next nodes after the current node
            next = current.next; 
            //stores the current.next as the previous node
            current.next = prev; 
            //our current node with be the previous node
            prev = current; 
            //continue the revers and goes to the next node
            current = next; 
        } 
        node = prev; 
        return node; 
    } //end reverse
  

    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) { 
    	/* Start with the empty list. */
    	LinkedList llist = new LinkedList(); 
    	
    	//added to the linked list
    	llist.append(101);
    	llist.append(34);
    	//deleted from the linkedlist
    	llist.deleteNode(34);
    	System.out.println("The size of the LinkedList is " + llist.size());
		
    } 
	}//end class