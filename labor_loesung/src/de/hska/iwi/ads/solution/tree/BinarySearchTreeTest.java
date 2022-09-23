package de.hska.iwi.ads.solution.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;

public class BinarySearchTreeTest extends MapTest {

	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		BinarySearchTree<K,V> binarySearchTree = new BinarySearchTree<K,V>();
		return binarySearchTree;
	}
	
	  @Test
	  void myTest() {
	    Map<Integer, String> map = createMap();
	    
	    map.put(3, "Drei");
	    assertEquals("Drei", map.get(3));
	    map.put(9, "Neun");
	    // overwrite value
	    map.put(3, "Drei Drei");
	    map.put(1, "Eins");
	    assertEquals("Drei Drei", map.get(3));
	    assertEquals("Eins", map.put(1, "Eins Eins"));
	    assertEquals("Eins Eins", map.get(1));

	  }

}
