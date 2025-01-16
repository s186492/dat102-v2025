package dat102.f02.tabellbag;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TabellBagTest {

	@Test
	void test() {
		
		BagADT<String> bag = new TabellBag<String>(2);
		
		assertEquals(0, bag.getCurrentSize());
		assertTrue(bag.isEmpty());
		
		assertFalse(bag.contains("Eple"));
		
		assertTrue(bag.add("Eple"));
		assertTrue(bag.add("Banan"));
		assertFalse(bag.add("Pære"));
		
		assertEquals(2, bag.getCurrentSize());
		assertFalse(bag.isEmpty());
		
		assertTrue(bag.contains("Eple"));
		assertTrue(bag.contains("Banan"));
		assertFalse(bag.contains("Pære"));
		
		assertNotNull(bag.remove());
		assertNotNull(bag.remove());
		assertNull(bag.remove());
		
		assertEquals(0, bag.getCurrentSize());
		assertTrue(bag.isEmpty());

		assertFalse(bag.contains("Eple"));
		assertFalse(bag.contains("Banan"));
		assertFalse(bag.contains("Pære"));
	}

}
