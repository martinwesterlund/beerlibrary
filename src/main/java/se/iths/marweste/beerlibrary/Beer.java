package se.iths.marweste.beerlibrary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Beer {

    private @Id @GeneratedValue Long id;
    private String brand;
    private String description;
    private int rating;

    public Beer() {
    }

    public Beer(String brand, String description, int rating) {
        this.brand = brand;
        this.description = description;
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
