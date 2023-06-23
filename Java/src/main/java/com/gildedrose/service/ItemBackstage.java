package com.gildedrose.service;

import com.gildedrose.Item;
import com.gildedrose.constant.ApplicationConstant;

public class ItemBackstage implements ItemUpdate {

	@Override
	public void update(Item item) {

		if (item.quality < ApplicationConstant.MAX_QUANTITY) {
			this.increaseQuantity(item);

			if (item.sellIn < 11 && item.quality < ApplicationConstant.MAX_QUANTITY) {

				this.increaseQuantity(item);
			}
			if (item.sellIn < 6 && item.quality < ApplicationConstant.MAX_QUANTITY) {

				this.increaseQuantity(item);
			}
		}

		this.decreaseSellin(item);

		if (item.sellIn < ApplicationConstant.MIN_SELLIN) {
			item.quality = 0;
		}
	}
}