package com.gildedrose;

import com.gildedrose.constant.ApplicationConstant;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.length; i++) {
			if (items[i].name.equals(ApplicationConstant.AGED_BRIE)
					|| items[i].name.equals(ApplicationConstant.BACKSTAGE)) {

				if (items[i].quality < 50) {
					items[i].quality = items[i].quality + 1;

					if (items[i].name.equals(ApplicationConstant.BACKSTAGE)) {
						if (items[i].sellIn < 11) {
							if (items[i].quality < 50) {
								items[i].quality = items[i].quality + 1;
							}
						}

						if (items[i].sellIn < 6) {
							if (items[i].quality < 50) {
								items[i].quality = items[i].quality + 1;
							}
						}
					}
				}
			} else {
				if (items[i].quality > 0) {
					if (!items[i].name.equals(ApplicationConstant.SULFURAS)) {
						items[i].quality = items[i].quality - 1;
					}
				}
			}

			if (!items[i].name.equals(ApplicationConstant.SULFURAS)) {
				items[i].sellIn = items[i].sellIn - 1;
			}

			if (items[i].sellIn < 0) {
				if (items[i].name.equals("Aged Brie")) {

					if (items[i].quality < 50) {
						items[i].quality = items[i].quality + 1;
					}
				} else {
					if (items[i].name.equals(ApplicationConstant.BACKSTAGE)) {

						items[i].quality = items[i].quality - items[i].quality;
					} else {
						if (items[i].quality > 0) {
							if (!items[i].name.equals(ApplicationConstant.SULFURAS)) {
								items[i].quality = items[i].quality - 1;
							}
						}
					}

				}
			}
		}
	}
}