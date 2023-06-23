package com.gildedrose.service;

import com.gildedrose.Item;

public class ItemGeneral implements ItemUpdate {

	@Override
	public void update(Item item) {

		if (item.quality > 0) {

			this.decreaseQuantity(item);
		}

	}

}
