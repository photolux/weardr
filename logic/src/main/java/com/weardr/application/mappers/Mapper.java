package com.weardr.application.mappers;

public interface Mapper<D, E> {
    D toDTO(E entity);
    E fromDTO(D dto);
}
