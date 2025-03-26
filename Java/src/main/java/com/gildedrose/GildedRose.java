package com.gildedrose;

import com.gildedrose.service.AgedBrieService;
import com.gildedrose.service.BackstagePassesService;
import com.gildedrose.service.ConjuredService;
import com.gildedrose.service.NormalItemService;
import com.gildedrose.service.SulfarasService;

class GildedRose {
    Item[] items;
    private AgedBrieService agedBrieService;
    private BackstagePassesService backstagePassesService;
    private SulfarasService sulfarasService;
    private NormalItemService normalItemService;
    private ConjuredService conjuredService;
    public GildedRose(Item[] items) {
        this.items = items;
        this.agedBrieService = new AgedBrieService();
        this.backstagePassesService = new BackstagePassesService();
        this.sulfarasService = new SulfarasService();
        this.normalItemService = new NormalItemService();
        this.conjuredService = new ConjuredService();
    }

    public void updateQuality() {
        for(Item item : items){
            switch (item.name){
                case AgedBrieService.NAME ->agedBrieService.updateItem(item);
                case BackstagePassesService.NAME -> backstagePassesService.updateItem(item);
                case SulfarasService.NAME -> sulfarasService.updateItem(item);
                case ConjuredService.NAME -> conjuredService.updateItem(item);
                default -> normalItemService.updateItem(item);
            }
        }
    }
}
