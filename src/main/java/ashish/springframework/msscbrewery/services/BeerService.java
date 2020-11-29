package ashish.springframework.msscbrewery.services;

import ashish.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerByID(UUID beerId);
}
