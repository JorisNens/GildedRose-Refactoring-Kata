package com.gildedrose.service;

public class BackstagePassesService extends ItemUpdaterService {
    public static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    @Override
    public int updateQuality(int quality, int sellIn) {
        int qualityImprovementStep;
        if (sellIn < 0) {
            return  0;
        }
        if (sellIn < 5) {
            qualityImprovementStep = 3;
        }else if (sellIn < 10) {
            qualityImprovementStep = 2;
        }else{
            qualityImprovementStep = 1;
        }

        return Math.min(MAX_QUALITY, quality + qualityImprovementStep);
    }
}
