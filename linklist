package Linklist;

public class Linklist {

	private Link first;

	public Linklist()// constructor
	{

		first = null;
	}

	public boolean isEmpty() // this will return true once our list is empty
	{

		return (first == null);
	}

	public void insertfirst(String name, double avg) {

		Link newLink = new Link(name, avg);// create new link
		newLink.Next = first;// link new link with the existing link list
		first = newLink;// make the new link as the first in the link list

	}

	public Link deleteFirst() {
		Link temp = first;// save the reference of the current first to temp
		first = first.Next;// change the first reference to next available link
		return temp;// this will return the previous first reference

	}

	public Link deleteLink(String name) {
		Link current = first;
		Link previous = first;
		while (current.Name != name) {
			if (current.Next == null) {
				return null;
			} else {
				previous = current;
				current = current.Next;
			}

		}
		if (current == first) {
			first = first.Next;
		} else {
			previous.Next = current.Next;
		}
		return current;

	}

	public void displayList() {
		System.out.println("list from first link to the last link");
		Link current = first;// in order to start from the beggining
		while (current != null) {
			current.displayDetails();// display the details
			current = current.Next;
		}
	}

}
