package com.gildedrose;

import java.util.Arrays;

import com.gildedrose.service.ItemUpdate;
import com.gildedrose.service.ItemUpdateFactory;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {

		Arrays.stream(items).forEach(item -> {
			ItemUpdate itemUpdate = ItemUpdateFactory.createItemUpate(item);
			itemUpdate.update(item);
		});
	}

}