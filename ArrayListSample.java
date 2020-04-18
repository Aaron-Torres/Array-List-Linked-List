import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSample {
	
	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	
	public ArrayListSample() {
		
		 arrayList = new ArrayList<Integer>();
		
	}//default constructor
	
	public ArrayListSample(int arraySize) {
		
		 arrayList = new ArrayList<Integer>(arraySize);
		
	}//Constructor with parameters
	
	//gets the element from the corresponded index starting from zero
	public int getElement(int element) {
		element = arrayList.get(element);
		return element;
	}//end getElement
	
	//add element to the arrayList
	public void addElement(int element) {
		
		arrayList.add(element);
		
	}//end addElement method
	
	//removes an element from the arryList
	public void removeElement(int element) {
		arrayList.remove(element);
	}//end removeElement
	
	//resize the arrayList if needed
	public void resizeArrayList(int arraySize) {
		
		arrayList = new ArrayList<Integer>(arraySize);
	}//end resizeArrayList method
	

	public static void main(String[] args) {
		
		ArrayListSample ar1 = new ArrayListSample();
		
		boolean enterNumber = true; 
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int num = sn.nextInt();
		ar1.addElement(num);
		
		while (enterNumber == true) {
			
			System.out.print("Are you done entering number (y/n)?");
			String answer = sn.next();
			
			if(answer.equals("n")) {
				System.out.print("Please enter a number: ");
				num = sn.nextInt();
				ar1.addElement(num);
			}else {
				enterNumber = false;
				break;
			}//end if-else statement
			
		}//end while
		
		/***************************************************/
		System.out.print("\nInitial contents of the list: ");
		for(int i = 0; i < ar1.arrayList.size(); i++) {
			
			if(i != ar1.arrayList.size()-1) {
			System.out.print(ar1.getElement(i) + ", ");
		}
			else {
				System.out.print(ar1.getElement(i));
			}//end if-else statement
			
		}//end for loop
		
		/***************************************************/
		System.out.print("\n\nContents before adding another item: ");
		for(int i = 0; i < ar1.arrayList.size(); i++) {
			
			if(i != ar1.arrayList.size()-1) {
			System.out.print(ar1.getElement(i) + ", ");
		}
			else {
				System.out.print(ar1.getElement(i));
			}//end if-else statement
			
		}//end for loop
		
		System.out.print("\nPlease enter another number to add: ");
		int num1 = sn.nextInt();
		ar1.addElement(num1);
		
		System.out.print("Contents after adding another item: ");
		for(int i = 0; i < ar1.arrayList.size(); i++) {
			
			if(i != ar1.arrayList.size()-1) {
			System.out.print(ar1.getElement(i) + ", ");
		}
			else {
				System.out.print(ar1.getElement(i));
			}//end if-else statement
			
		}//end for loop
		
		System.out.println("\n");
		
		/***************************************************/
		System.out.print("\nContents before removing an item: ");
		for(int i = 0; i < ar1.arrayList.size(); i++) {
			
			if(i != ar1.arrayList.size()-1) {
			System.out.print(ar1.getElement(i) + ", ");
		}
			else {
				System.out.print(ar1.getElement(i));
			}//end if-else statement
			
		}//end for loop
		
		System.out.print("\nPlease enter the index of the element to remove: ");
		int numRemove = sn.nextInt();
		ar1.removeElement(numRemove);
		
		System.out.print("Contents after removing an item: ");
		for(int i = 0; i < ar1.arrayList.size(); i++) {
			
			if(i != ar1.arrayList.size()-1) {
			System.out.print(ar1.getElement(i) + ", ");
		}
			else {
				System.out.print(ar1.getElement(i));
			}//end if-else statement
			
		}//end for loop
		System.out.println("\n");
		
		/***************************************************/
		System.out.print("\nContents before retrieving values from the list: ");
		for(int i = 0; i < ar1.arrayList.size(); i++) {
			
			if(i != ar1.arrayList.size()-1) {
			System.out.print(ar1.getElement(i) + ", ");
		}
			else {
				System.out.print(ar1.getElement(i));
			}//end if-else statement
			
		}//end for loop
		
		System.out.print("\nPlease enter the index of the element to retrieve: ");
		int numGet = sn.nextInt();
		System.out.print("Element at position " + numGet + " is: " + ar1.getElement(numGet));
		
		System.out.print("\nContents after retriving from the list: ");
		for(int i = 0; i < ar1.arrayList.size(); i++) {
			
			if(i != ar1.arrayList.size()-1) {
			System.out.print(ar1.getElement(i) + ", ");
		}
			else {
				System.out.print(ar1.getElement(i));
			}//end if-else statement
			
		}//end for loop
		System.out.println("\n");
		
		/***************************************************/
		System.out.print("\nThe sum of all the items in the ArrayList: ");
		int sum = 0;
		for(int i = 0; i < ar1.arrayList.size(); i++) {
			
			sum += ar1.getElement(i);
		}//end for loop
		
		System.out.print(sum);
		

	}//end main method

}//end class
