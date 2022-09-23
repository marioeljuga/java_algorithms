package de.hska.iwi.ads.solution.hashtable;

import de.hska.iwi.ads.dictionary.AbstractHashMap;

public class Hashtable<K extends Comparable<K>, V> extends AbstractHashMap<K, V> {

	public Hashtable(int capacity) {
		super(capacity);
	}

	// get element by key
	public Entry<K, V> getElement(K key) {
		for (int i = 0; i < hashtable.length; i++) {
			int hashValue = hashFunction(key, i);
			// if entry is not null
			if (hashtable[hashValue] != null) {
				// if key found
				if (key.equals(hashtable[hashValue].getKey())) {
					return hashtable[hashValue];
				}
			} else // key does not exist
				return null;
		}
		// key does not exist
		return null;
	}

	@SuppressWarnings("unchecked")
	public V get(Object o) {

		Entry<K, V> requestedElement = getElement((K) o);
		// if key found
		if (requestedElement != null) {
			return requestedElement.getValue();
		}
		// key not found
		return null;
	}

	public V put(K key, V value) {
		for (int i = 0; i < hashtable.length; i++) {
			int hashValue = hashFunction(key, i);
			// if entry is not null
			if (hashtable[hashValue] != null) {
				// if key already exists
				if (key.equals(hashtable[hashValue].getKey())) {
					// overwrite the old value
					V oldValue = hashtable[hashValue].getValue();
					hashtable[hashValue].setValue(value);
					return oldValue;
				}
			}
			// key not already there and empty space found
			else {
				// insert element
				SimpleEntry<K, V> entry = new SimpleEntry<K, V>(key, value);
				hashtable[hashValue] = entry;
				size = size + 1;
				return null;
			}
		}
		// key not already there and no empty space
		throw new DictionaryFullException();
	}

	// i is collision step
	public int hashFunction(K key, int i) {
		// use abs because hashcode can also be negative
		int hashValue = (Math.abs(key.hashCode()) + i * i) % hashtable.length;
		return hashValue;
	}

}
