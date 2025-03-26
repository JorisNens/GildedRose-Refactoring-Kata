package com.gildedrose.service;

import com.gildedrose.Item;

public abstract class ItemUpdaterService {
    public static String name = "default";
    public abstract int updateQuality(int quality, int sellIn);
    public abstract int updateSellIn(int sellIn);
    public void updateItem(Item item){
        item.quality = updateQuality(item.quality, item.sellIn);
        item.sellIn = updateSellIn(item.sellIn);
    }

}
