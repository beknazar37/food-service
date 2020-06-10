package kg.megacom.foodservice.mappers;

import kg.megacom.foodservice.models.dto.CustomerDto;
import kg.megacom.foodservice.models.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE= Mappers.getMapper(CustomerMapper.class);

    Customer customerDtoToCustomer(CustomerDto customerDto);
    CustomerDto customerToCustomerDto(Customer customer);
    List<Customer> customerDtoToCustomers(List<CustomerDto>customerDtos);
    List<CustomerDto>customerToCustomerDtos(List<Customer>customers);

}
