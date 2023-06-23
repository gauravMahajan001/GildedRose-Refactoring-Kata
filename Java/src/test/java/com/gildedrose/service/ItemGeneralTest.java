package com.gildedrose.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.gildedrose.Item;

class ItemGeneralTest {
	private ItemUpdate itemUpdate = new ItemGeneral();
	
	@DisplayName("Quantity > 0 then quatity decrease by 1")
	@Test
	 void testQuatityGreaterThanZeroThenQuantityDecreaseBy1() {
		
		int quantity = 1;
		int expectedQuantity =0;
		Item item = new Item("Test", 0, quantity);
		
		itemUpdate.update(item);
		assertEquals(expectedQuantity, item.quality);
	}
	
	@DisplayName("Quantity < 0 then quatity remain same")
	@Test
	 void testQuatityLessThanZeroThenQuantityDecreaseBy1() {
		
		int quantity = -1;
		
		Item item = new Item("Test", 0, quantity);
		
		itemUpdate.update(item);
		assertEquals(quantity, item.quality);
	}
	

}
