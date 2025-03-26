package com.gildedrose.service;

public class ConjuredService extends ItemUpdaterService {
    public static final String NAME = "Conjured Mana Cake";


    @Override
    public int updateQuality(int quality, int sellIn) {
        int qualityDecrease= sellIn < 0 ? 4 : 2;
        return Math.max(0, quality - qualityDecrease);
    }

    @Override
    public int updateSellIn(int sellIn) {
        return sellIn - 1;
    }
}
