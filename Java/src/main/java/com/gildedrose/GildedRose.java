package com.gildedrose;

import java.util.Arrays;

import com.gildedrose.constant.ApplicationConstant;
import com.gildedrose.service.ItemUpdate;

class GildedRose implements ItemUpdate {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		Arrays.stream(items).forEach(item -> {
			
			if (item.name.equals(ApplicationConstant.AGED_BRIE) || item.name.equals(ApplicationConstant.BACKSTAGE)) {

				if (item.quality < 50) {
					this.increaseQuantity(item);

					if (item.name.equals(ApplicationConstant.BACKSTAGE)) {
						if (item.sellIn < 11) {
							if (item.quality < 50) {

								this.increaseQuantity(item);
							}
						}

						if (item.sellIn < 6) {
							if (item.quality < 50) {
								this.increaseQuantity(item);
							}
						}
					}
				}
			} else {
				if (item.quality > 0) {
					if (!item.name.equals(ApplicationConstant.SULFURAS)) {
						this.decreaseQuantity(item);
					}
				}
			}

			if (!item.name.equals(ApplicationConstant.SULFURAS)) {
				this.decreaseSellin(item);
			}

			if (item.sellIn < 0) {
				if (item.name.equals("Aged Brie")) {

					if (item.quality < 50) {
						this.increaseQuantity(item);
					}
				} else {
					if (item.name.equals(ApplicationConstant.BACKSTAGE)) {

						item.quality = 0;
					} else {
						if (item.quality > 0) {
							if (!item.name.equals(ApplicationConstant.SULFURAS)) {
								this.decreaseQuantity(item);
							}
						}
					}

				}
			}
		});
	}
}