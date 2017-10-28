package com.weardr.domain.model.things;

import com.weardr.domain.model.catalog.ThingId;
import com.weardr.domain.model.clients.Seller;

import java.util.Collection;

public abstract class Thing implements Sellable {

    ThingId id;
    String title;
    Seller seller;
    Collection<Photo> photos;

    public ThingId id() {
        return id;
    }

    public String title() {
        return title;
    }

    public Seller seller() {
        return seller;
    }

    public Collection<Photo> photos() {
        return photos;
    }
}
