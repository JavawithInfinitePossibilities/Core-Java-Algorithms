/**
 * 
 */
package com.core.java.algorithms.custLinkedlist;

/**
 * @author Siddhant sahu
 *
 */
public class CustomLinkedList {
	private ListNode currentDataElement;

	public CustomLinkedList(int data) {
		super();
		this.currentDataElement = new ListNode(data);
	}

	public int listLength() {
		int length = 0;
		ListNode currentList = this.currentDataElement;
		while (currentList.getNext() != null) {
			++length;
			currentList = currentList.getNext();
		}
		return length;
	}

	public void inserInHead(int data) {
		ListNode currenthead = new ListNode(data);
		currenthead.setNext(this.currentDataElement);
	}

	public void insertInLast(int data) {
		ListNode lastNode = new ListNode(data);
		ListNode currentList = this.currentDataElement;
		if (this.currentDataElement == null) {
			this.currentDataElement = lastNode;
		}
		while (currentList.getNext() != null) {
			currentList = currentList.getNext();
		}
		currentList.setNext(lastNode);
	}

	public void insertInPosition(int data, int position) throws Exception {
		if (position < 0) {
			throw new Exception("The position is less then 0 :" + position);
		}
		ListNode nthNode = new ListNode(data);
		int currentCounter = 0;
		if (this.currentDataElement == null) {
			this.currentDataElement = nthNode;
		}
		if (position == 0) {
			inserInHead(data);
		}
		ListNode currentList = this.currentDataElement;
		while (currentList.getNext() != null && currentCounter < position) {
			currentList = currentList.getNext();
			++currentCounter;
		}
		nthNode.setNext(currentList.getNext());
		currentList.setNext(nthNode);
	}

	public void removeFromHead() {
		ListNode currentNode = this.currentDataElement;
		if (currentNode != null) {
			this.currentDataElement = currentNode.getNext();
			currentNode.setNext(null);
		}
	}

	public void removeFromTail() throws Exception {
		if (this.currentDataElement == null) {
			throw new Exception("There is no element for remove...");
		}
		ListNode currentNode = this.currentDataElement,next = this.currentDataElement.getNext(), temp = null ;
		if (next == null) {
			this.currentDataElement = null;
		}
		while ((next = currentNode.getNext()) != null) {
			temp = currentNode;
			currentNode = next;
		}
		temp.setNext(null);
	}

	public void remove(int position) throws Exception {
		if (position < 0) {
			throw new Exception("We can't remove from this " + position + " position...");
		}
		if (this.currentDataElement == null) {
			return;
		}
		if (position > listLength()) {
			return;
		}
		ListNode currentNode = this.currentDataElement;
		for (int i = 0; i < position; i++) {
			currentNode = currentNode.getNext();
		}
		currentNode.setNext(currentNode.getNext().getNext());
	}

	@Override
	public String toString() {
		String result = "[";
		if (this.currentDataElement == null) {
			result += "]";
			return result;
		}
		result += this.currentDataElement.getData() + " ";
		ListNode temp = this.currentDataElement.getNext();
		while (temp != null) {
			result += this.currentDataElement.getData() + " ";
			temp = temp.getNext();
		}
		result += "]";
		return result;
	}

}
