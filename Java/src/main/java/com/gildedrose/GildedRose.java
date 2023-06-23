package com.gildedrose;

import com.gildedrose.constant.ApplicationConstant;
import com.gildedrose.service.ItemUpdate;

class GildedRose implements ItemUpdate {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			if (items[i].name.equals(ApplicationConstant.AGED_BRIE)
					|| items[i].name.equals(ApplicationConstant.BACKSTAGE)) {

				if (items[i].quality < 50) {
					this.increaseQuantity(items[i]);

					if (items[i].name.equals(ApplicationConstant.BACKSTAGE)) {
						if (items[i].sellIn < 11) {
							if (items[i].quality < 50) {

								this.increaseQuantity(items[i]);
							}
						}

						if (items[i].sellIn < 6) {
							if (items[i].quality < 50) {
								this.increaseQuantity(items[i]);
							}
						}
					}
				}
			} else {
				if (items[i].quality > 0) {
					if (!items[i].name.equals(ApplicationConstant.SULFURAS)) {
						this.decreaseQuantity(items[i]);
					}
				}
			}

			if (!items[i].name.equals(ApplicationConstant.SULFURAS)) {
				this.decreaseSellin(items[i]);
			}

			if (items[i].sellIn < 0) {
				if (items[i].name.equals("Aged Brie")) {

					if (items[i].quality < 50) {
						this.increaseQuantity(items[i]);
					}
				} else {
					if (items[i].name.equals(ApplicationConstant.BACKSTAGE)) {

						items[i].quality = 0;
					} else {
						if (items[i].quality > 0) {
							if (!items[i].name.equals(ApplicationConstant.SULFURAS)) {
								this.decreaseQuantity(items[i]);
							}
						}
					}

				}
			}
		}
	}
}