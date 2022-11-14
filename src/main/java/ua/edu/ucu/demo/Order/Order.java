package ua.edu.ucu.demo.Order;

import lombok.Getter;
import ua.edu.ucu.demo.Delivery.Delivery;
import ua.edu.ucu.demo.Item;
import ua.edu.ucu.demo.Payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    @Getter
    private List<Item> items = new ArrayList<>();
    @Getter
    private Payment payment = new Payment();
    @Getter
    private Delivery delivery = new Delivery();
    @Getter
    private boolean isProcessed = false;

    public void setPaymentStrategy(Payment payment){
        this.payment=payment;
    }

    public void setDeliveryStrategy(Delivery delivery){
        this.delivery = delivery;
    }

    public double CalculateTotalPrice(){
        double price = 0;
        for (Item item : items){
            price+= item.price();
        }
        return price;
    }

    public void processOrder(){
        isProcessed = true;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }
}
