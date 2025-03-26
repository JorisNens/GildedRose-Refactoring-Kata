package com.gildedrose.service;

public class AgedBrieService extends ItemUpdaterService {
    public static final String NAME = "Aged Brie";

    @Override
    public int updateQuality(int quality, int sellIn) {
        int improvementOfQuality = sellIn < 0?2:1;
        return Math.min(50, quality+improvementOfQuality);
    }

    @Override
    public int updateSellIn(int sellIn) {
        return sellIn - 1;
    }
}
