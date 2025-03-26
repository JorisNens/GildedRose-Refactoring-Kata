package com.gildedrose.service;

public class NormalItemService extends ItemUpdaterService {
    public static final String name = "Normal";

    @Override
    public int updateQuality(int quality, int sellIn) {
        if (quality > 0) {
            quality = quality - 1;
        }
        if (sellIn < 0 && quality > 0) {
            quality = quality - 1;
        }
        return quality;
    }

    @Override
    public int updateSellIn(int sellIn) {
        return sellIn - 1;
    }
}
