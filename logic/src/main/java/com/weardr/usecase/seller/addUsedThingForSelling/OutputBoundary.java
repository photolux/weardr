package com.weardr.usecase.seller.addUsedThingForSelling;

import com.weardr.domain.model.thing.ThingId;

public interface OutputBoundary {
    void send(ThingId thingId);
}
