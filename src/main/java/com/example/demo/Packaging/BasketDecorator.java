package com.example.demo.Packaging;

import com.example.demo.Item;

public class BasketDecorator extends ItemDecorator{
    private Item item;
    public BasketDecorator(Item itm){
        super(itm.getDescription());
        item=itm;
    }

    @Override
    public double price() {
        return (4 + item.price());
    }

    @Override
    public String getDescription() {
        return "This is basket";
    }
}

