package com.gildedrose.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.gildedrose.Item;
import com.gildedrose.constant.ApplicationConstant;

class ItemBackstageTest {
	
	private ItemUpdate itemUpdate = new ItemBackstage();
	
	@DisplayName("should quantity remain same when Quantity >50 and Sellin >0 ")
	@Test
	void  testOuantityGreaterThanMaxAndSellinGreaterThan0ThenQuantitySame() {
		int quantity =51;
		Item item = new Item(ApplicationConstant.BACKSTAGE, 1, quantity);
		
		itemUpdate.update(item);
		assertEquals(quantity, item.quality);
	}
	
	@DisplayName("should quantity 0 when Quantity >50 and Sellin is negative ")
	@Test
	void  testOuantityGreaterThanMaxAndSellinLessThan0ThenQuantityZeor() {
		int quantity =51;
		int expectedQuantity = 0;
		Item item = new Item(ApplicationConstant.BACKSTAGE, -1, quantity);
		
		itemUpdate.update(item);
		assertEquals(expectedQuantity, item.quality);
	}
	
	
	@DisplayName("should increase quatity by 2 when quatity <50 and Sellin>6 and sellin <11")
	@Test
	void testQuantityLessThanMaxAndSellinGreaterThan6AndLessThan11ThenQuantityIncreaseBy2() {
		int quantity =45;
		int expectedQuantity = 47;
		
		Item item = new Item(ApplicationConstant.BACKSTAGE, 7, quantity);
		
		itemUpdate.update(item);
		assertEquals(expectedQuantity, item.quality);
	}
	
	@DisplayName("should increase quatity by 3 when quatity <50 and Sellin<6 ")
	@Test
	void testQuantityLessThanMaxAndSellinLessThan6ThanQuantityIncreaseBy1() {
		int quantity =45;
		int expectedQuantity = 48;
		int sellin =5;
		Item item = new Item(ApplicationConstant.BACKSTAGE, sellin, quantity);
		
		itemUpdate.update(item);
		assertEquals(expectedQuantity, item.quality);
	}
	
	@DisplayName("should quantity increment by one when quatity is 49")
	@Test
	void testQuantityEqual49AndSellinLessthan11ThenQuanityIncreaseBy1() {
		
		int quantity =49;
		int expectedQuantity = 50;
		
		Item item = new Item(ApplicationConstant.BACKSTAGE, 10, quantity);
		
		itemUpdate.update(item);
		assertEquals(expectedQuantity, item.quality);
	}
}
