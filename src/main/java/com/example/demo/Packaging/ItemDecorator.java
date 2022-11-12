package com.example.demo.Packaging;

import com.example.demo.Item;

abstract class ItemDecorator extends Item {

    public ItemDecorator(String description) {
        super(description);
    }

    public abstract String getDescription();
}
