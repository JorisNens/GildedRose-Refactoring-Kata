package com.gildedrose.service;

public class BackstagePassesService extends ItemUpdaterService {
    public static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    @Override
    public int updateQuality(int quality, int sellIn) {
        int qualityIncrease = 1;
        if (sellIn < 0) {
            return  0;
        }
        if (sellIn < 10) {
            qualityIncrease = 2;
        }
        if (sellIn < 5) {
            qualityIncrease = 3;
        }

        return Math.min(50, quality + qualityIncrease);
    }

    @Override
    public int updateSellIn(int sellIn) {
        return sellIn - 1;
    }
}
