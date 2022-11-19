package com.example.data.domain;

import java.io.Serializable;

/**
 * @Author lyra
 * @Date 2022 11 19 10 55
 **/

public class testData implements Serializable {
    private Integer index;
    private String color;
    private String object;
    private double price;
    private double price2;

    public testData() {
        super();
    }

    public testData(Integer index, String color, String object, double price, double price2) {
        this.index = index;
        this.color = color;
        this.object = object;
        this.price = price;
        this.price2 = price2;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice2() {
        return price2;
    }

    public void setPrice2(double price2) {
        this.price2 = price2;
    }

    @Override
    public String toString() {
        return "testData{" +
                "index=" + index +
                ", color='" + color + '\'' +
                ", object='" + object + '\'' +
                ", price=" + price +
                ", price2=" + price2 +
                '}';
    }
}
