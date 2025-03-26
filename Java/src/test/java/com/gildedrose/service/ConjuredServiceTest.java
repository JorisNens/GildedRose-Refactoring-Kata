package com.gildedrose.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConjuredServiceTest {
    private ConjuredService conjuredService = new ConjuredService();
    @Test
    void updateQuality_whenQualityNotNull() {
        assertEquals(2, conjuredService.updateQuality(4, 1));
        assertEquals(6, conjuredService.updateQuality(8, 0));
        assertEquals(4, conjuredService.updateQuality(8, -1));
    }
    @Test
    void updateQuality_whenQualityIsNull() {
        assertEquals(0, conjuredService.updateQuality(2, 1));
        assertEquals(0, conjuredService.updateQuality(0, 0));
        assertEquals(0, conjuredService.updateQuality(0, -1));
        assertEquals(0, conjuredService.updateQuality(2, -1));
    }
}
