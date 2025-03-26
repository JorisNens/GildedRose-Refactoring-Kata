package com.gildedrose.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalItemServiceTest {
    private NormalItemService normalItemService = new NormalItemService();
    @Test
    void updateQuality_whenQualityNotNull() {
        assertEquals(3, normalItemService.updateQuality(4, 1));
        assertEquals(7, normalItemService.updateQuality(8, 0));
        assertEquals(6, normalItemService.updateQuality(8, -1));
    }
    @Test
    void updateQuality_whenQualityIsNull() {
        assertEquals(0, normalItemService.updateQuality(1, 1));
        assertEquals(0, normalItemService.updateQuality(0, 0));
        assertEquals(0, normalItemService.updateQuality(0, -1));
        assertEquals(0, normalItemService.updateQuality(1, -1));
    }
}
