package com.weardr.application;

import com.weardr.domain.model.catalog.Category;
import com.weardr.domain.model.catalog.Price;
import com.weardr.domain.model.things.Thing;
import com.weardr.domain.model.things.ThingRepository;

public class SellerService {

    private ThingRepository thingRepository;

    public SellerService(ThingRepository thingRepository) {
        this.thingRepository = thingRepository;
    }

    public void addForSelling(Thing thing, Category category, Price price) {

    }

}
