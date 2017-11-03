package com.weardr.domain.model.thing;

import com.weardr.domain.model.shop.Price;
import com.weardr.domain.model.client.Seller;

import java.util.Collection;

public abstract class Thing implements Sellable {

    ThingId id;
    String title;
    Collection<Photo> photos;
    Seller seller;
    Price price;

    Category category;

    public ThingId id() {
        return id;
    }

    public String title() {
        return title;
    }

    public Collection<Photo> photos() {
        return photos;
    }

    public Category category() {
        return category;
    }

    public Seller seller() {
        return seller;
    }

    public Price price() {
        return price;
    }
}
