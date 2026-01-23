package fr.antennes.mbds.customer;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> findAll();

    CustomerDto findById(Long id);
}
