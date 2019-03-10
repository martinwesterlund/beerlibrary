package se.iths.marweste.beerlibrary;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends MongoRepository<Beer,String> {
}
