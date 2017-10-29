package com.weardr.usecase.seller.addUsedThingForSelling;

import com.weardr.domain.model.catalog.Category;
import com.weardr.domain.model.catalog.Price;
import com.weardr.domain.model.client.Seller;
import com.weardr.domain.model.thing.Condition;
import com.weardr.domain.model.thing.ThingId;
import com.weardr.domain.model.thing.ThingRepository;
import com.weardr.domain.model.thing.UsedThing;

public class Interactor implements InputBoundary {

    private ThingRepository thingRepository;
    private OutputBoundary output;

    public Interactor(ThingRepository thingRepository, OutputBoundary output) {
        this.thingRepository = thingRepository;
        this.output = output;
    }

    public void addUsedThingForSelling(String title, Category category, Condition condition, Price price, Seller seller) {

        final ThingId thingId = thingRepository.nextThingId();

        UsedThing thing = new UsedThing.Builder(thingId, seller)
                .withDescription(title, condition, category)
                .withPrice(price)
                .build();

        thingRepository.store(thing);

        output.send(thingId);
    }
}
