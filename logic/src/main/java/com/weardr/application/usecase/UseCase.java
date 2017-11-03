package com.weardr.application.usecase;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface UseCase<I extends RequestModel, O extends ResponseModel> {
    void execute(Supplier<I> input, Consumer<O> output);
}
