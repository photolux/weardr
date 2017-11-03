package com.weardr.application.usecase.impl.AddUsedThingForSelling;

import com.weardr.application.model.Thing;
import com.weardr.application.usecase.AddUsedThingForSelling.AddUsedThingForSelling;
import com.weardr.application.usecase.AddUsedThingForSelling.UsedThingProvidedDetails;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class AddUsedThingForSellingImpl implements AddUsedThingForSelling {
    @Override
    public void execute(Supplier<UsedThingProvidedDetails> input, Consumer<Thing> output) {

    }
}
