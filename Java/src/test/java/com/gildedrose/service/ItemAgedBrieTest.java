package com.gildedrose.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.gildedrose.Item;
import com.gildedrose.constant.ApplicationConstant;

class ItemAgedBrieTest {
	
	private ItemAgedBrie itemAgedBrie = new ItemAgedBrie();
	
	@DisplayName("Item quantity greater than max quantity then quantity same")
	@Test
	void testQuantityGreaterThanMaxQuantityThenQuantitySame() {
		int quantity = 60;
		Item item = new Item(ApplicationConstant.AGED_BRIE, 0, quantity);
		
		itemAgedBrie.update(item);
		assertEquals(quantity, item.quality);
	}
	
	@DisplayName("Quantity less than Max Quantity and Sellin greater than min value then quantity increase by 1")
	@Test
	void testQuantityLessThanMaxQuantityAndSellinGreaterThanMinSellinThenQuantityInreaseBy1() {
		int quantity = 45;
		int sellin = 1;
		int expectedQuantity = 46;
		Item item = new Item(ApplicationConstant.AGED_BRIE, sellin, quantity);
		
		itemAgedBrie.update(item);
		assertEquals(expectedQuantity, item.quality);
	}
	
	@DisplayName("Quantity less than Max Quantity and Sellin less than min value then quantity increase by 2")
	@Test
	void testQuantityLessThanMaxQuantityAndSellinLessThanMinSellinThenQuantityIncreaseBy2() {
		int quantity = 45;
		int sellin = -1;
		int expectedQuantity = 47;
		Item item = new Item(ApplicationConstant.AGED_BRIE, sellin, quantity);
		
		itemAgedBrie.update(item);
		assertEquals(expectedQuantity, item.quality);
	}
	
}
