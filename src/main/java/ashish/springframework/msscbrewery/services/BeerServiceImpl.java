package ashish.springframework.msscbrewery.services;

import ashish.springframework.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerByID(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Blue Moon")
                .beerStyle("Kadu").build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder().id(beerDto.getId()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerData) {

    }

    @Override
    public void deleteBeer(UUID beerId) {

    }
}
