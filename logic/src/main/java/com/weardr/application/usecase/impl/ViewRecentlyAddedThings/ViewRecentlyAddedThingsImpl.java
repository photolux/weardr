package com.weardr.application.usecase.impl.ViewRecentlyAddedThings;

import com.weardr.application.usecase.ViewRecentlyAddedThings.ViewRecentlyAddedThings;
import com.weardr.domain.model.thing.Thing;
import com.weardr.domain.model.thing.ThingRepository;

import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ViewRecentlyAddedThingsImpl implements ViewRecentlyAddedThings {

    ThingRepository thingRepository;

    public ViewRecentlyAddedThingsImpl(ThingRepository thingRepository) {
        this.thingRepository = thingRepository;
    }

    @Override
    public void execute(Supplier input, Consumer output) {
        Set<Thing> recentlyAddedThings = thingRepository.getRecentlyAdded();
        recentlyAddedThings.stream().forEach(output);
    }
}
