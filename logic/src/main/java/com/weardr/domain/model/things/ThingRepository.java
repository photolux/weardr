package com.weardr.domain.model.things;

import com.weardr.domain.model.catalog.ThingId;

public interface ThingRepository {

    ThingId nextThingId();

    void store(Thing thing);
}
