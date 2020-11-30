package ashish.springframework.msscbrewery.web.controller;

import ashish.springframework.msscbrewery.services.CustomerService;
import ashish.springframework.msscbrewery.web.model.CustomerDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerID}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable("customerID") UUID customerID){
        return new ResponseEntity<>(customerService.getCustomerById(customerID), HttpStatus.OK);
    }


}
