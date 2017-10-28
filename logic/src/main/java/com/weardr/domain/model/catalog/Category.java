package com.weardr.domain.model.catalog;

public class Category {

    private Category parentCategory;

    String title;

    private Category(Category parentCategory, String title) {
        this.parentCategory = parentCategory;
        this.title = title;
    }
}
