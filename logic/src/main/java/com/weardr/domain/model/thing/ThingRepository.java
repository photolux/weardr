package com.weardr.domain.model.thing;

import java.util.Set;

public interface ThingRepository {

    Set<Thing> getRecentlyAdded();

    ThingId nextThingId();

    void store(Thing thing);
}
