package com.weardr.domain.model.shop;

import com.weardr.domain.model.thing.Thing;

public interface ShoppingCart {

    void add(Thing thing);
    void remove(Thing thing);
}
