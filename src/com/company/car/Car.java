package com.company.car;

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private Integer year;

    public Car(String brand, Integer year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Brand: %s | Year: %s",
                this.brand,
                this.year);
    }
}
