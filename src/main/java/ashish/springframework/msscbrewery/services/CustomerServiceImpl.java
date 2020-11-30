package ashish.springframework.msscbrewery.services;

import ashish.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return new CustomerDTO().builder().id(UUID.randomUUID())
                .name("Girish").build();
    }
}
