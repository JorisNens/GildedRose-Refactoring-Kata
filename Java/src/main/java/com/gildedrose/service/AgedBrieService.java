package com.gildedrose.service;

public class AgedBrieService extends ItemUpdaterService {
    public static final String NAME = "Aged Brie";

    @Override
    public int updateQuality(int quality, int sellIn) {
        int qualityImprovementStep = sellIn < 0 ? 2 : 1;
        return Math.min(MAX_QUALITY, quality + qualityImprovementStep);
    }
}
