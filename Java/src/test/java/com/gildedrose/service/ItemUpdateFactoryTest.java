package com.gildedrose.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.gildedrose.Item;
import com.gildedrose.constant.ApplicationConstant;

class ItemUpdateFactoryTest {
	
	@DisplayName("Should have Aged Brie Object")
	@Test
	void testObjectAgeDBrie () {
		Item item = new Item(ApplicationConstant.AGED_BRIE, 2, 0);
		
		ItemUpdate factoryObj =  ItemUpdateFactory.createItemUpate(item);
		
		assertTrue(factoryObj instanceof ItemAgedBrie);
	}
	
}
