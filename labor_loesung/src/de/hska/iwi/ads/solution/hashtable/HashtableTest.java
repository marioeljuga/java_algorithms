package de.hska.iwi.ads.solution.hashtable;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.MapTest;

public class HashtableTest extends MapTest {

	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		Hashtable<K, V> hashtable = new Hashtable<K, V>(91);
		return hashtable;
	}

	@Test
	void myTest() {
		// Map with 1,2,3,4, 6,7,8
		Map<String, String> commonTestMap = createMap();
		commonTestMap.put("negosnseg", "Sechs");
		commonTestMap.put("negosnsegaaa", "Drei");
		commonTestMap.put("gioejojw", "Eins");
		commonTestMap.put("j33jj33j", "Sieben");
		commonTestMap.put("9i9i9i9", "Acht");
		commonTestMap.put("negosnseg", "Vier");
		commonTestMap.put("sfhkla", "Zwei");
		
	     assertEquals("Acht", commonTestMap.get("9i9i9i9"));

	}
}
