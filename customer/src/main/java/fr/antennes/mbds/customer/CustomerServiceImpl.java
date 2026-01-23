package fr.antennes.mbds.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<CustomerDto> findAll() {
        List<Customer> customerList = customerRepository.findAll();
        return customerMapper.toCustomerDtoList(customerList);
    }

    @Override
    public CustomerDto findById(Long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
//        if (customerOptional.isPresent())
//            return ResponseEntity.ok(customerOptional.get());
//        return ResponseEntity.notFound().build();
        Customer customer = customerOptional.orElse(null);
        return customerMapper.toCustomerDto(customer);
    }
}
