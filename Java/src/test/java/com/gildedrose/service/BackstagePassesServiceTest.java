package com.gildedrose.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackstagePassesServiceTest {
    private BackstagePassesService backstagePassesService = new BackstagePassesService();

    @Test
    void updateQuality_whenSellInIsCloseToZero() {
        assertEquals(3, backstagePassesService.updateQuality(0, 1));
        assertEquals(3, backstagePassesService.updateQuality(0, 0));
        assertEquals(0, backstagePassesService.updateQuality(0, -1));
    }

    @Test
    void updateQuality_whenSellInIsCloseToFive() {
        assertEquals(3, backstagePassesService.updateQuality(0, 4));
        assertEquals(2, backstagePassesService.updateQuality(0, 5));
        assertEquals(2, backstagePassesService.updateQuality(0, 6));
    }

    @Test
    void updateQuality_whenSellInIsCloseToTen() {
        assertEquals(2, backstagePassesService.updateQuality(0, 9));
        assertEquals(1, backstagePassesService.updateQuality(0, 10));
        assertEquals(1, backstagePassesService.updateQuality(0, 11));
    }

    @Test
    void updateQuality_whenQualityIsAtMaximum() {
        assertEquals(50, backstagePassesService.updateQuality(49, 1));
        assertEquals(50, backstagePassesService.updateQuality(50, 1));
        assertEquals(50, backstagePassesService.updateQuality(49, 5));
        assertEquals(50, backstagePassesService.updateQuality(49, 10));
    }
}
