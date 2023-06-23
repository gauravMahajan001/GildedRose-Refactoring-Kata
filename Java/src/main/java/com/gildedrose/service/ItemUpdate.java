package com.gildedrose.service;

import com.gildedrose.Item;

public interface ItemUpdate {
	
	public void update(Item item);
	
	default void increaseQuantity(Item item) {
		item.quality++;
	}
	
	default  void decreaseQuantity(Item item) {
		item.quality--;
	}
	
	default void decreaseSellin(Item item) {
		item.sellIn--;
	}

}
