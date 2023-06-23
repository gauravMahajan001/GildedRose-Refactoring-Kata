package com.gildedrose.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.gildedrose.Item;

class ItemGeneralTest {
	private ItemUpdate itemUpdate = new ItemGeneral();

	@DisplayName(" Quantity > 0 then quatity decrease by 1")
	@Test
	void testQuantityGreaterThanZeroThenQuantityDecreaseBy1() {

		int quantity = 1;
		int expectedQuantity = 0;
		Item item = new Item("Test", 0, quantity);

		itemUpdate.update(item);
		assertEquals(expectedQuantity, item.quality);
	}

	@DisplayName("Quantity is negative then quatity remain same")
	@Test
	void testQuantityNegativeThenQuantityDecreaseBy1() {

		int quantity = -1;

		Item item = new Item("Test", 0, quantity);

		itemUpdate.update(item);
		assertEquals(quantity, item.quality);
	}

	@DisplayName("Sellin is negative then quantity increase by 2")
	@Test
	void testSellinNegativeThenOuantityDecreaseBy2() {

		int sellin = -1;
        int expectedQuantity = 8;
        
		Item item = new Item("Test", sellin, 10);

		itemUpdate.update(item);
		assertEquals(expectedQuantity, item.quality);
	}
	
	@DisplayName("Sellin is positve then quantity increase by 1")
	@Test
	void testSellinPostiveThenOuantityDecreaseBy1() {

		int sellin = 1;
        int expectedQuantity = 9;
        
		Item item = new Item("Test", sellin, 10);

		itemUpdate.update(item);
		assertEquals(expectedQuantity, item.quality);
	}

}
