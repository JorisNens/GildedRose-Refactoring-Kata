package com.gildedrose;

import com.gildedrose.service.AgedBrieService;
import com.gildedrose.service.BackstagePassesService;
import com.gildedrose.service.ConjuredService;
import com.gildedrose.service.ItemUpdaterService;
import com.gildedrose.service.NormalItemService;
import com.gildedrose.service.SulfarasService;

import java.util.HashMap;
import java.util.Map;

class GildedRose {
    Item[] items;
    private final Map<String, ItemUpdaterService> serviceMap;
    private GildedRose() {
        this.serviceMap = new HashMap<>();
        this.serviceMap.put(AgedBrieService.NAME, new AgedBrieService());
        this.serviceMap.put(BackstagePassesService.NAME, new BackstagePassesService());
        this.serviceMap.put(SulfarasService.NAME, new SulfarasService());
        this.serviceMap.put(ConjuredService.NAME, new ConjuredService());
        this.serviceMap.put(NormalItemService.NAME, new NormalItemService());
    }
    public GildedRose(Item[] items) {
        this();
        this.items = items;
    }


    public void updateQuality() {
        for(Item item : items){
            ItemUpdaterService service = serviceMap.getOrDefault(item.name, serviceMap.get(NormalItemService.NAME));
            service.updateItem(item);
        }
    }
}
