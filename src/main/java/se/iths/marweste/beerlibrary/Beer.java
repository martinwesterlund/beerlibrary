package se.iths.marweste.beerlibrary;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Beer {

    private @Id @GeneratedValue Long id;
    private String brand;
    private String description;
    private int rating;


}
