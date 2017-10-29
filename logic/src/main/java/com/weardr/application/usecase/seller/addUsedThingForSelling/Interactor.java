package com.weardr.application.usecase.seller.addUsedThingForSelling;

import com.weardr.application.dto.CategoryDTO;
import com.weardr.application.dto.ConditionDTO;
import com.weardr.application.dto.PriceDTO;
import com.weardr.application.dto.SellerDTO;
import com.weardr.application.mappers.*;
import com.weardr.domain.model.thing.ThingId;
import com.weardr.domain.model.thing.ThingRepository;
import com.weardr.domain.model.thing.UsedThing;

public class Interactor implements InputBoundary {

    private ThingRepository thingRepository;

    private OutputBoundary output;

    private SellerMapper sellerMapper;
    private ConditionMapper conditionMapper;
    private PriceMapper priceMapper;
    private CategoryMapper categoryMapper;
    private ThingMapper thingMapper;

    public Interactor(ThingRepository thingRepository, OutputBoundary output) {
        this.thingRepository = thingRepository;
        this.output = output;
    }

    public void addUsedThingForSelling(String title, CategoryDTO category, ConditionDTO condition, PriceDTO price, SellerDTO seller) {

        final ThingId thingId = thingRepository.nextThingId();

        UsedThing thing = new UsedThing.Builder(thingId, sellerMapper.fromDTO(seller))
                .withDescription(title, conditionMapper.fromDTO(condition), categoryMapper.fromDTO(category))
                .withPrice(priceMapper.fromDTO(price))
                .build();

        thingRepository.store(thing);

        output.send(thingMapper.toDTO(thing));
    }
}
