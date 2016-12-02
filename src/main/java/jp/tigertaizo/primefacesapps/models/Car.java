package jp.tigertaizo.primefacesapps.models;

import lombok.Data;

/**
 *
 * @author tigertaizo
 */
@Data
public class Car {

    public String id;
    public String brand;
    public int year;
    public String color;
    public int price;
    public boolean sold;

    public Car() {
    }

    public Car(String id, String brand, int year, String color) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public Car(String id, String brand, int year, String color, int price, boolean sold) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.price = price;
        this.sold = sold;
    }
}
