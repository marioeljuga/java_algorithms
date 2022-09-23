package de.hska.iwi.ads.solution.list;

import de.hska.iwi.ads.dictionary.AbstractDoubleLinkedList;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K, V> {

	// constructor
	public DoubleLinkedList() {

		head = new ListElement(new SimpleEntry<K, V>(null, null), null, null);

	}

	// get element by key
	@SuppressWarnings("unchecked")
	public ListElement getElement(Object o) {

		o = (K) o;

		// iterate through the list and find the key

		ListElement currentElement = head;

		// check if key is in the head
		// if (((Comparable<K>) o).compareTo(currentElement.entry.getKey()) == 0) {
		if (o.equals(currentElement.entry.getKey())) {

			return currentElement;

		}

		while (currentElement.next != null) {

			currentElement = currentElement.next;

			// check if the key is in the next element
			// if (((Comparable<K>) o).compareTo(currentElement.entry.getKey()) == 0) {
			if (o.equals(currentElement.entry.getKey())) {

				return currentElement;

			}

		}

		// key doesn't exist, return null

		return null;
	}

	@SuppressWarnings("unchecked")
	public V get(Object o) {

		o = (K) o;

		ListElement requestedElement = getElement(o);

		// key doesn't exist, return null
		if (requestedElement == null)
			return null;

		return requestedElement.entry.getValue();
	}

	public V put(K key, V value) {

		// if key doesn't already exist, put it at the beginning of the list (head)

		ListElement requestedElement = getElement(key);

		if (requestedElement == null) {

			// copy head object into oldHead
			ListElement oldHead = new ListElement(head.entry, head, head.next);

			// update the head
			head.previous = null;
			head.next = oldHead;
			head.entry = new SimpleEntry<K, V>(key, value);

			// update the size of the list
			size = size + 1;

		} else {
			
			V oldValue = requestedElement.entry.getValue();
			requestedElement.entry.setValue(value);
			return oldValue;

		}

		// if key already exists, replace the old value with the new value, and return
		// the old value
		
		// TODO return oldValue

		return null;
	}

}
