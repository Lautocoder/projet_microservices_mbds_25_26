package fr.antennes.mbds.customer;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerDto toCustomerDto(Customer customer);
    List<CustomerDto> toCustomerDtoList(List<Customer> customerList);
    Customer toCustomerEntity(CustomerDto customerDto);
    List<Customer> toCustomerEntityList(List<CustomerDto> customerDtoList);
}
