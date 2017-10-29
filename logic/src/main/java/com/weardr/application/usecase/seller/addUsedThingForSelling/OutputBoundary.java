package com.weardr.application.usecase.seller.addUsedThingForSelling;

import com.weardr.application.dto.ThingDTO;

public interface OutputBoundary {
    void send(ThingDTO thing);
}
