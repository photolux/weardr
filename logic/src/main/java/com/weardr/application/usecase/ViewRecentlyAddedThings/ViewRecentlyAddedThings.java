package com.weardr.application.usecase.ViewRecentlyAddedThings;

import com.weardr.application.usecase.UseCase;
import com.weardr.domain.model.thing.Thing;

import java.util.Optional;

public interface ViewRecentlyAddedThings extends UseCase<Optional<?>, Thing> {
}
