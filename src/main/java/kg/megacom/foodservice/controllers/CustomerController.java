package kg.megacom.foodservice.controllers;

import kg.megacom.foodservice.models.dto.CustomerDto;
import kg.megacom.foodservice.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/save")
    public CustomerDto saveCustomer(@RequestBody CustomerDto customerDto){

        return customerService.saveCustomer(customerDto);
    }

    @GetMapping(value = "/list")
    public List<CustomerDto> getAllCustomers(){

        return customerService.findAllCustomer();
    }
}
