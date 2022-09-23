package de.hska.iwi.ads.solution.hashtable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.dictionary.AbstractDictionary.DictionaryFullException;

public class HashtableTest2 {

	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		Hashtable<K, V> hashtable = new Hashtable<K, V>(7);
		return hashtable;
	}

//	@Test
//	void myTest() {
//		// Map with 1,2,3,4, 6,7,8
//		Map<String, String> commonTestMap = createMap();
//		commonTestMap.put("negosnseg", "Sechs");
//		commonTestMap.put("negosnsegaaa", "Drei");
//		commonTestMap.put("gioejojw", "Eins");
//		commonTestMap.put("j33jj33j", "Sieben");
//		commonTestMap.put("9i9i9i9", "Acht");
//		commonTestMap.put("negosnseg", "Vier");
//		commonTestMap.put("sfhkla", "Zwei");
//		
//	     assertEquals("Acht", commonTestMap.get("9i9i9i9"));
//
//	}
//	
//    public static String generateString() {
//        String uuid = UUID.randomUUID().toString();
//        return "uuid = " + uuid;
//    }
//	
//	@Test
//	void myTest2() {
//		Map<String, Integer> commonTestMap = createMap();
//		for (int i = 0; i < 10; i++) {
//			String key = generateString();
//			int value = i;
//			commonTestMap.put(key, value);
//		    assertEquals(value, commonTestMap.get(key));
//		}
//	}
	@Test
	void myTest3() {
		// Map with 1,2,3,4, 6,7,8
		Map<Integer, String> commonTestMap = createMap();
		commonTestMap.put(1, "Sechs");
		commonTestMap.put(8, "Drei");
		commonTestMap.put(15, "Eins");
		commonTestMap.put(22, "Sieben");
		//commonTestMap.put(29, "Acht");
		
		
	    //assertEquals("Sieben", commonTestMap.get(22));
	    assertThrows(DictionaryFullException.class, () -> commonTestMap.put(29, "Acht"));
	    //assertEquals("Acht", commonTestMap.get(29));

	}
	

}
