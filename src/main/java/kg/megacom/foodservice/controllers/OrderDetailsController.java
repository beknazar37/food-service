package kg.megacom.foodservice.controllers;

import kg.megacom.foodservice.models.dto.OrderDetailsDto;
import kg.megacom.foodservice.models.entity.OrderDetails;
import kg.megacom.foodservice.services.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orderDetails")
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @PostMapping(value = "/save")
    public OrderDetailsDto saveOrderDetails(@RequestBody OrderDetailsDto orderDetailsDto){

        return orderDetailsService.saveOrderDetails(orderDetailsDto);
    }

    @GetMapping(value = "/list")
    public List<OrderDetailsDto> getAllOrderDetails(){

        return orderDetailsService.findAllOrderDetails();
    }
}
