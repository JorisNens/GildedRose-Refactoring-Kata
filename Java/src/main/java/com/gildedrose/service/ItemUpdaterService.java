package com.gildedrose.service;

import com.gildedrose.Item;

public abstract class ItemUpdaterService {
    public static final String NAME = "default";
    public abstract int updateQuality(int quality, int sellIn);
    public abstract int updateSellIn(int sellIn);
    public void updateItem(Item item){
        item.sellIn = updateSellIn(item.sellIn);
        item.quality = updateQuality(item.quality, item.sellIn);
    }

}
