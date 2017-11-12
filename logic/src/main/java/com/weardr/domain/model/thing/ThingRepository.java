package com.weardr.domain.model.thing;

import java.util.List;

public interface ThingRepository {

    List<UsedThing> getRecentlyAdded();

    ThingId nextThingId();

    void store(Thing thing);
}
