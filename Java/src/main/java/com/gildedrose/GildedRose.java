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
    private Map<String, ItemUpdaterService> initializeServiceMap() {
        Map<String, ItemUpdaterService> serviceMap = new HashMap<>();
        serviceMap.put(AgedBrieService.NAME, new AgedBrieService());
        serviceMap.put(BackstagePassesService.NAME, new BackstagePassesService());
        serviceMap.put(SulfarasService.NAME, new SulfarasService());
        serviceMap.put(ConjuredService.NAME, new ConjuredService());
        serviceMap.put(NormalItemService.NAME, new NormalItemService());
        return serviceMap;
    }
    public GildedRose(Item[] items) {
        this.items = items;
        this.serviceMap = initializeServiceMap();
    }


    public void updateQuality() {
        for(Item item : items){
            ItemUpdaterService service = serviceMap.getOrDefault(item.name, serviceMap.get(NormalItemService.NAME));
            service.updateItem(item);
        }
    }
}
