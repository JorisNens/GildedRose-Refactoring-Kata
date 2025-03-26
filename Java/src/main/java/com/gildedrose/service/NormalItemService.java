package com.gildedrose.service;

public class NormalItemService extends ItemUpdaterService {
    public static final String NAME = "Normal";

    @Override
    public int updateQuality(int quality, int sellIn) {
        int qualityDecreaseStep= sellIn < 0 ? 2 : 1;
        return Math.max(MIN_QUALITY, quality - qualityDecreaseStep);
    }

}
