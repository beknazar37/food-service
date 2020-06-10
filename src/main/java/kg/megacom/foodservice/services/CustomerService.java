package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    CustomerDto saveCustomer(CustomerDto customerDto);
    List<CustomerDto>findAllCustomer();
}
