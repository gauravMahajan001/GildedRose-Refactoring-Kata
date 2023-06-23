package com.gildedrose.service;

import com.gildedrose.Item;
import com.gildedrose.constant.ApplicationConstant;

public class ItemUpdateFactory {

	public static ItemUpdate createItemUpate(Item item) {

		switch (item.name) {
		case ApplicationConstant.AGED_BRIE:
			return new ItemAgedBrie();
		
		default:
			return null;

		}

	}

}
