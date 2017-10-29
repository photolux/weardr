package com.weardr.usecase.seller.addUsedThingForSelling;

import com.weardr.domain.model.catalog.Category;
import com.weardr.domain.model.catalog.Price;
import com.weardr.domain.model.client.Seller;
import com.weardr.domain.model.thing.Condition;

public interface InputBoundary {
    void addUsedThingForSelling(String title, Category category, Condition condition, Price price, Seller seller);
}
