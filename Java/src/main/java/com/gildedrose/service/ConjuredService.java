package com.gildedrose.service;

public class ConjuredService extends ItemUpdaterService {
    public static final String NAME = "Conjured Mana Cake";


    @Override
    public int updateQuality(int quality, int sellIn) {
        int qualityDecreaseStep= sellIn < 0 ? 4 : 2;
        return Math.max(MIN_QUALITY, quality - qualityDecreaseStep);
    }
}
