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
        List<Beer> beers = this.beerRepository.findAll();
        return beers;
    }

    @GetMapping("/beers/{id}")
    public Beer getOne(String id){
        return this.beerRepository.findById(id)
                .orElseThrow( () -> new BeerException("No beer with id " + id));
    }

    @PutMapping("/beers/{id}")
    public void insert(@RequestBody Beer beer){
        this.beerRepository.insert(beer);
    }

    @PostMapping("/beers")
    public void update(@RequestBody Beer beer){
        this.beerRepository.save(beer);
    }
    @DeleteMapping("/beers/{id}")
    public void delete(@PathVariable("id") String id){
        this.beerRepository.deleteById(id);
    }

}
