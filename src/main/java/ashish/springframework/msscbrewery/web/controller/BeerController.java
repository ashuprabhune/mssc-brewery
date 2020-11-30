package ashish.springframework.msscbrewery.web.controller;

import ashish.springframework.msscbrewery.services.BeerService;
import ashish.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer( @PathVariable("beerId") UUID beerId){
        return new ResponseEntity<>(beerService.getBeerByID(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){
        BeerDto savedBeer = beerService.saveNewBeer(beerDto);

        HttpHeaders header = new HttpHeaders();
        header.add("Location","/api/v1/beer"+savedBeer.getId().toString());
        return new ResponseEntity(header,HttpStatus.CREATED);

    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerData){
        beerService.updateBeer(beerId,beerData);
        return  new ResponseEntity(HttpStatus.NO_CONTENT);

    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("beerId") UUID beerId){
        beerService.deleteBeer(beerId);
    }

}
