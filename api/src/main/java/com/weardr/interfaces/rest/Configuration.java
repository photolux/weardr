package com.weardr.interfaces.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.weardr.application.usecase.ViewRecentlyAddedThings.ViewRecentlyAddedThingsUseCase;
import com.weardr.domain.model.thing.Thing;
import com.weardr.domain.model.thing.ThingId;
import com.weardr.domain.model.thing.ThingRepository;
import com.weardr.domain.model.thing.UsedThing;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.Arrays;
import java.util.List;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    ThingRepository thingRepository() {
        return new ThingRepository() {
            @Override
            public List<UsedThing> getRecentlyAdded() {

                return Arrays.asList(
                        new UsedThing.Builder(null, null).build(),
                        new UsedThing.Builder(null, null).build(),
                        new UsedThing.Builder(null, null).build()
                );
            }

            @Override
            public ThingId nextThingId() {
                return null;
            }

            @Override
            public void store(Thing thing) {

            }
        };
    }

    @Bean
    ViewRecentlyAddedThingsUseCase useCase() {
        return new ViewRecentlyAddedThingsUseCase(thingRepository());
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        MappingJackson2HttpMessageConverter converter =
                new MappingJackson2HttpMessageConverter(mapper);
        return converter;
    }
}
