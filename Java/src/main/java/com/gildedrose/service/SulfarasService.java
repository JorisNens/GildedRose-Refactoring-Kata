package com.gildedrose.service;

public class SulfarasService extends ItemUpdaterService {
    public static final String NAME = "Sulfuras, Hand of Ragnaros";

    @Override
    public int updateQuality(int quality, int sellIn) {
        return quality;
    }

    @Override
    public int updateSellIn(int sellIn) {
        return sellIn;
    }
}
