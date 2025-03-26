package com.gildedrose.service;

import com.gildedrose.Item;

public abstract class ItemUpdaterService {
    public static final String NAME = "default";
    public static final int MAX_QUALITY = 50;
    public static final int MIN_QUALITY = 0;

    public abstract int updateQuality(int quality, int sellIn);

    public int updateSellIn(int sellIn) {
        return sellIn - 1;
    }

    public void updateItem(Item item) {
        item.sellIn = updateSellIn(item.sellIn);
        item.quality = updateQuality(item.quality, item.sellIn);
    }

}
