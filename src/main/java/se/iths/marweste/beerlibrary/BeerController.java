package se.iths.marweste.beerlibrary;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BeerController {

    private BeerRepository beerRepository;

    public BeerController(BeerRepository beerRepository){
        this.beerRepository = beerRepository;
    }

    @GetMapping("/beers")
    public List<Beer> getAll(){
        return beerRepository.findAll();
    }

    @GetMapping("/beers/{id}")
    public Beer getOne(@PathVariable Long id){
        return beerRepository.findById(id)
                .orElseThrow( () -> new BeerException("No beer with id " + id));
    }

    @PutMapping("/beers/{id}")
    public Beer update(@RequestBody Beer beer, @PathVariable Long id){
        return beerRepository.findById(id).map(storedBeer -> {
            storedBeer.setBrand(beer.getBrand());
            storedBeer.setRating(beer.getRating());
            return beerRepository.save(storedBeer);
        }).orElseThrow( () -> new BeerException("No beer with id " + id));
    }

    @PostMapping("/beers")
    public Beer create(@RequestBody Beer beer){

        return beerRepository.save(beer);
    }

    @DeleteMapping("/beers/{id}")
    public void delete(@PathVariable Long id){
        beerRepository.deleteById(id);
    }

}
