package com.weardr.application.usecase.ViewRecentlyAddedThings;

import com.weardr.application.usecase.NoInputUseCase;
import com.weardr.domain.model.thing.Thing;
import com.weardr.domain.model.thing.ThingRepository;
import com.weardr.domain.model.thing.UsedThing;

import java.util.List;
import java.util.function.Consumer;

public class ViewRecentlyAddedThingsUseCase implements NoInputUseCase<List<Thing>> {

    ThingRepository thingRepository;

    public ViewRecentlyAddedThingsUseCase(ThingRepository thingRepository) {
        this.thingRepository = thingRepository;
    }

    @Override
    public void execute(Consumer<List<UsedThing>> output) {
        output.accept(thingRepository.getRecentlyAdded());
    }
}
