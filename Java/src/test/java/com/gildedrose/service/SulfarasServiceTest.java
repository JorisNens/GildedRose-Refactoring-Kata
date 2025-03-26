package com.gildedrose.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SulfarasServiceTest {
    private SulfarasService sulfarasService = new SulfarasService();

    @Test
    void updateQuality() {
        assertEquals(80, sulfarasService.updateQuality(80, 1));
        assertEquals(80, sulfarasService.updateQuality(80, 0));
        assertEquals(80, sulfarasService.updateQuality(80, -1));
    }

    @Test
    void updateSellIn() {
        assertEquals(1, sulfarasService.updateSellIn(1));
        assertEquals(0, sulfarasService.updateSellIn(0));
        assertEquals(-1, sulfarasService.updateSellIn(-1));
    }
}
