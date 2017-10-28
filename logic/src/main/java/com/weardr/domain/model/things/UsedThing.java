package com.weardr.domain.model.things;

import com.weardr.domain.model.catalog.Category;
import com.weardr.domain.model.catalog.Price;
import com.weardr.domain.model.catalog.ThingId;
import com.weardr.domain.model.clients.Seller;

import java.util.Collection;

public class UsedThing extends Thing {
    private Condition condition;

    public Condition condition() {
        return condition;
    }

    private UsedThing(Builder builder) {
        this.id = builder.id;
        this.seller = builder.seller;
        this.title = builder.title;
        this.photos = builder.photos;
        this.condition = builder.condition;
        this.category = builder.category;
        this.price = builder.price;
    }

    public static class Builder {

        private ThingId id;
        private Seller seller;
        private String title;
        private Collection<Photo> photos;
        private Condition condition;
        private Category category;
        private Price price;


        public Builder(ThingId id, Seller seller) {
            this.id = id;
        }

        public Builder withDescription(String title, Condition condition, Category category) {
            this.title = title;
            this.condition = condition;
            this.category = category;
            return this;
        }

        public Builder withPhotos(Collection<Photo> photos) {
            this.photos = photos;
            return this;
        }

        public Builder withPrice(Price price) {
            this.price = price;
            return this;
        }

        public UsedThing build() {
            return new UsedThing(this);
        }
    }
}
