package com.weardr.domain.model.thing;

import java.util.List;

public interface ThingRepository {

    List<Thing> getRecentlyAdded();

    ThingId nextThingId();

    void store(Thing thing);
}
