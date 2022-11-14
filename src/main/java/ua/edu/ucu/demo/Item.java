package ua.edu.ucu.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Item {
    private String description;

    public abstract double price();
//    Item(String descr, double pr){
//        description=descr;
//    }

}
