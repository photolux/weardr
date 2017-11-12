package com.weardr.application.usecase;

import com.weardr.domain.model.thing.UsedThing;

import java.util.List;
import java.util.function.Consumer;

public interface NoInputUseCase<O>{
    void execute(Consumer<List<UsedThing>> output);
}
