package com.gildedrose.service;

public class NormalItemService extends ItemUpdaterService {
    public static final String name = "Normal";

    @Override
    public int updateQuality(int quality, int sellIn) {
        int qualityDecrease= sellIn < 0 ? 2 : 1;
        return Math.max(0, quality - qualityDecrease);
    }

    @Override
    public int updateSellIn(int sellIn) {
        return sellIn - 1;
    }
}
