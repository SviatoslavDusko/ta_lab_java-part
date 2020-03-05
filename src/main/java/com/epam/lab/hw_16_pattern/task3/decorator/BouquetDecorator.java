package com.epam.lab.hw_16_pattern.task3.decorator;

import com.epam.lab.hw_16_pattern.task3.bouquet.Bouquet;

import java.util.List;
import java.util.Optional;

public abstract class BouquetDecorator implements Bouquet {
    private Optional<Bouquet> bouquet;
    private int additionalPrice;
    private String toName = "";
    private List<String> additionalComponent;


    public void setBouquet(Bouquet bouquet) {
        this.bouquet = Optional.ofNullable(bouquet);
        if (additionalComponent != null) {
            this.bouquet.orElseThrow(IllegalArgumentException::new).getFlowersList().addAll(additionalComponent);
        }
    }

    protected void setAdditionalPrice(int additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    protected void setAdditionalComponent(List<String> additionalComponent) {
        this.additionalComponent = additionalComponent;
    }

    protected void setToName(String toName) {
        this.toName = toName;
    }

    @Override
    public int getPrice() {
        return bouquet.orElseThrow(IllegalArgumentException::new).getPrice() + additionalPrice;
    }

    @Override
    public String getName() {
        return bouquet.orElseThrow(IllegalArgumentException::new).getName() + toName;
    }

    @Override
    public String getEventType() {
        return bouquet.orElseThrow(IllegalArgumentException::new).getEventType();
    }

    @Override
    public List<String> getFlowersList() {
        return bouquet.orElseThrow(IllegalArgumentException::new).getFlowersList();
    }

    @Override
    public String toString() {
        return "BouquetDecorator: " + "\n" +
                "   Bouquet name: " + getName() + "\n" +
                "   Bouquet flowers list: " + getFlowersList() + "\n" +
                "   Bouquet event type: " + getEventType() + "\n" +
                "   Bouquet price: " + getPrice() + "\n";
    }
}
