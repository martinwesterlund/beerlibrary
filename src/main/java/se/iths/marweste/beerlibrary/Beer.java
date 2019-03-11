package se.iths.marweste.beerlibrary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Beer {

    private @Id @GeneratedValue Long id;
    private String brand;
    private int rating;

    public Beer() {
    }

    public Beer(String brand, int rating) {
        this.brand = brand;
        this.rating = rating;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
