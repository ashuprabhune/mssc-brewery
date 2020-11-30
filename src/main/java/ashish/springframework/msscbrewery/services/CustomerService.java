package ashish.springframework.msscbrewery.services;

import ashish.springframework.msscbrewery.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID id);
}
