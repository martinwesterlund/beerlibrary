package se.iths.marweste.beerlibrary;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {
    private BeerRepository beerRepository;

    public DbSeeder(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... strings) throws Exception{
//        Beer heineken = new Beer("Heineken", "Like water, but easy to drink for novice drinkers", 2);
//        Beer falcon = new Beer("Falcon", "Decent beer, but too much fusel oil",3);
//        Beer poppels = new Beer("Poppels APA", "Great taste, great beer!", 5);
//
//        List<Beer> beers = Arrays.asList(heineken, falcon, poppels);
//        this.beerRepository.saveAll(beers);


    }
}
