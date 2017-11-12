package com.weardr.interfaces.rest;

import com.weardr.application.usecase.ViewRecentlyAddedThings.ViewRecentlyAddedThingsUseCase;
import com.weardr.domain.model.thing.UsedThing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@RestController
public class FirstController {

    @Autowired
    ViewRecentlyAddedThingsUseCase useCase;

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/recent")
    List<UsedThing> getRecentlyAdded() {
        final List<UsedThing> things = new ArrayList<UsedThing>();

        Consumer<List<UsedThing>> presenter = result -> things.addAll(result);

        useCase.execute(presenter);

        return things;
    }
}
