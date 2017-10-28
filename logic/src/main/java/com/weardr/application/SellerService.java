package com.weardr.application;

import com.weardr.domain.model.catalog.Category;
import com.weardr.domain.model.catalog.Price;
import com.weardr.domain.model.catalog.ThingId;
import com.weardr.domain.model.clients.Seller;
import com.weardr.domain.model.things.Condition;
import com.weardr.domain.model.things.ThingRepository;
import com.weardr.domain.model.things.UsedThing;

public class SellerService {

    private ThingRepository thingRepository;

    public SellerService(ThingRepository thingRepository) {
        this.thingRepository = thingRepository;
    }

    public void addUsedThingForSelling(String title, Category category, Condition condition, Price price, Seller seller) {

        final ThingId thingId = thingRepository.nextThingId();

        UsedThing thing = new UsedThing.Builder(thingId, seller)
                .withDescription(title, condition, category)
                .withPrice(price)
                .build();

        thingRepository.store(thing);

    }

}
