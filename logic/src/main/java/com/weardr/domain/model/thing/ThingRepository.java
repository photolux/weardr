package com.weardr.domain.model.thing;

public interface ThingRepository {

    ThingId nextThingId();

    void store(Thing thing);
}
