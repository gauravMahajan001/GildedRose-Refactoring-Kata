package com.gildedrose.service;

import com.gildedrose.Item;
import com.gildedrose.constant.ApplicationConstant;

public class ItemUpdateFactory {

	public static ItemUpdate createItemUpate(Item item) {

		switch (item.name) {
		case ApplicationConstant.AGED_BRIE:
			return new ItemAgedBrie();
			
		case ApplicationConstant.BACKSTAGE:
			return new ItemBackstage();	
			
		case ApplicationConstant.SULFURAS:
			return new ItemSulfuras();	
		
		default:
			return new ItemGeneral();

		}

	}

}
