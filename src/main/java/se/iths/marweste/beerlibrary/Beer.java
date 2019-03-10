package se.iths.marweste.beerlibrary;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Beers")
public class Beer {
    @Id
    private String id;
    private String brand;
    private int rating;

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getRating() {
        return rating;
    }

    public Beer(String brand, int rating) {
        this.brand = brand;
        this.rating = rating;
    }
}
