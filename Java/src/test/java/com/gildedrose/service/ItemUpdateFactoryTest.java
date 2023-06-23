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
	
	@DisplayName("Should have BackStage Object")
	@Test
	void testObjectBackStage () {
		Item item = new Item(ApplicationConstant.BACKSTAGE, 2, 0);
		
		ItemUpdate factoryObj =  ItemUpdateFactory.createItemUpate(item);
		
		assertTrue(factoryObj instanceof ItemBackstage);
	}
	
	@DisplayName("Should have sulfuras Object")
	@Test
	void testObjectSulfuras() {
		Item item = new Item(ApplicationConstant.SULFURAS, 2, 0);
		
		ItemUpdate factoryObj =  ItemUpdateFactory.createItemUpate(item);
		
		assertTrue(factoryObj instanceof ItemSulfuras);
	}
	
	@DisplayName("Should have general type Object")
	@Test
	void testObjectGeneral() {
		Item item = new Item("test", 2, 0);
		
		ItemUpdate factoryObj =  ItemUpdateFactory.createItemUpate(item);
		
		assertTrue(factoryObj instanceof ItemGeneral);
	}
	
}
