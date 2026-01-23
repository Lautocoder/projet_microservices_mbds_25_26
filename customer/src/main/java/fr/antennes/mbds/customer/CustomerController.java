package fr.antennes.mbds.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/customers")
@RestController
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public CustomerDto getCustomerById(@PathVariable Long id)
    {
        return customerService.findById(id);
    }

    @GetMapping
    public List<CustomerDto> getCustomers()
    {
        return customerService.findAll();
    }
}
