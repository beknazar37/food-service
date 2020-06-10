package kg.megacom.foodservice.controllers;

import kg.megacom.foodservice.models.dto.OrderHistoryDto;
import kg.megacom.foodservice.models.entity.OrderHistory;
import kg.megacom.foodservice.services.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orderHistory")
public class OrderHistoryController {
    @Autowired
    private OrderHistoryService orderHistoryService;
    @PostMapping(value = "/save")
    public OrderHistoryDto saveOrderHistory(@RequestBody OrderHistoryDto orderHistoryDto){
        return orderHistoryService.saveOrderHistory(orderHistoryDto);
    }
    public List<OrderHistoryDto>getAllOrderHistory(){
        return orderHistoryService.findAllOrderHistory();
    }
}
