package com.weardr.application.usecase;

import java.util.function.Consumer;

public interface NoInputUseCase<O>{
    void execute(Consumer<O> output);
}
