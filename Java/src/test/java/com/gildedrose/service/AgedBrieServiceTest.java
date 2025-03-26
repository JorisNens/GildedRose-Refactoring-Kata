package com.gildedrose.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgedBrieServiceTest {
    private AgedBrieService agedBrieService = new AgedBrieService();

    @Test
    void updateQuality_whenQualityIsLow() {
        assertEquals(1, agedBrieService.updateQuality(0, 1));
        assertEquals(1, agedBrieService.updateQuality(0, 0));
        assertEquals(2, agedBrieService.updateQuality(0, -1));
    }

    @Test
    void updateQuality_whenQualityIsMaximum() {
        assertEquals(50, agedBrieService.updateQuality(49, 1));
        assertEquals(50, agedBrieService.updateQuality(50, 1));
        assertEquals(50, agedBrieService.updateQuality(49, -1));
    }
}
