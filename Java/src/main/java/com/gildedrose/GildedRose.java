package com.gildedrose;

import com.gildedrose.service.AgedBrieService;
import com.gildedrose.service.BackstagePassesService;
import com.gildedrose.service.NormalItemService;
import com.gildedrose.service.SulfarasService;

class GildedRose {
    Item[] items;
    private AgedBrieService agedBrieService;
    private BackstagePassesService backstagePassesService;
    private SulfarasService sulfarasService;
    private NormalItemService normalItemService;
    public GildedRose(Item[] items) {
        this.items = items;
        this.agedBrieService = new AgedBrieService();
        this.backstagePassesService = new BackstagePassesService();
        this.sulfarasService = new SulfarasService();
        this.normalItemService = new NormalItemService();
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name){
                case AgedBrieService.NAME ->agedBrieService.updateItem(items[i]);
                case BackstagePassesService.NAME -> backstagePassesService.updateItem(items[i]);
                case SulfarasService.NAME -> sulfarasService.updateItem(items[i]);
                default -> normalItemService.updateItem(items[i]);
            }
        }
    }

    private void oldMethod(int i) {
        if(items[i].name.equals(AgedBrieService.NAME)){
            agedBrieService.updateItem(items[i]);
            return;
        }

        if (!items[i].name.equals("Aged Brie")
                && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (items[i].quality > 0) {
                if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                    items[i].quality = items[i].quality - 1;
                }
            }
        } else {
            if (items[i].quality < 50) {
                items[i].quality = items[i].quality + 1;

                if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (items[i].sellIn < 11) {
                        if (items[i].quality < 50) {
                            items[i].quality = items[i].quality + 1;
                        }
                    }

                    if (items[i].sellIn < 6) {
                        if (items[i].quality < 50) {
                            items[i].quality = items[i].quality + 1;
                        }
                    }
                }
            }
        }

        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
            items[i].sellIn = items[i].sellIn - 1;
        }

        if (items[i].sellIn < 0) {
            if (!items[i].name.equals("Aged Brie")) {
                if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (items[i].quality > 0) {
                        if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                            items[i].quality = items[i].quality - 1;
                        }
                    }
                } else {
                    items[i].quality = items[i].quality - items[i].quality;
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;
                }
            }
        }
    }
}
