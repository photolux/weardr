package com.weardr.interfaces.dto;

public class CategoryDTO {
    private long id;
    private String title;

    public CategoryDTO(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public long id() {
        return id;
    }

    public String title() {
        return title;
    }
}
