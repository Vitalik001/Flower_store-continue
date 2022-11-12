package com.example.demo.Flowers;

import com.example.demo.Item;
import lombok.Getter;

public class Flower extends Item {
    @Getter
    private double sepalLength;
    @Getter
    private String color;
    @Getter
    private double price;
    Flower(String descript, double pr, String col, double sepalLen){
        super(descript);
        color=col;
        sepalLength=sepalLen;
        price=pr;
    }
    @Override
    public double price(){
        return price;
    }
}