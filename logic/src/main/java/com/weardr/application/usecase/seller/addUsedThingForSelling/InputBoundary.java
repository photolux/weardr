package com.weardr.application.usecase.seller.addUsedThingForSelling;

import com.weardr.application.dto.CategoryDTO;
import com.weardr.application.dto.ConditionDTO;
import com.weardr.application.dto.PriceDTO;
import com.weardr.application.dto.SellerDTO;

public interface InputBoundary {
    void addUsedThingForSelling(String title, CategoryDTO category, ConditionDTO condition, PriceDTO price, SellerDTO seller);
}
