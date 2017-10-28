package com.weardr.domain.model.things;

import com.weardr.domain.model.catalog.ThingId;
import com.weardr.domain.model.clients.Seller;

import java.util.Collection;

public class UsedThing extends Thing {
    private Condition condition;

    public Condition condition() {
        return condition;
    }

    private UsedThing(Builder builder) {
        this.title = builder.title;
        this.seller = builder.seller;
        this.condition = builder.condition;
    }

    public static class Builder {

        private ThingId id;
        private String title;
        private Collection<Photo> photos;
        private Seller seller;
        private Condition condition;


        public Builder(ThingId id) {
            this.id = id;
        }

        public Builder fromSeller(Seller seller) {
            this.seller = seller;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder withPhotos(Collection<Photo> photos) {
            this.photos = photos;
            return this;
        }

        public Builder inCondition(Condition condition) {
            this.condition = condition;
            return this;
        }

        public UsedThing build() {
            return new UsedThing(this);
        }
    }
}
