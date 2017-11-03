package com.weardr.application.usecase.AddUsedThingForSelling;

import com.weardr.application.usecase.AddUsedThingForSelling.AddUsedThingForSelling;
import com.weardr.application.usecase.AddUsedThingForSelling.UsedThingProvidedDetails;
import com.weardr.domain.model.thing.ThingId;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class AddUsedThingForSellingImpl implements AddUsedThingForSelling {
    @Override
    public void execute(Supplier<UsedThingProvidedDetails> input, Consumer<ThingId> output) {

    }
}
