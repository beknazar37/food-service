package kg.megacom.foodservice.controllers;

import kg.megacom.foodservice.models.dto.PriceDto;
import kg.megacom.foodservice.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/price")
public class PriceController {

    @Autowired
    private PriceService priceService;

    @PostMapping(value = "/save")
    PriceDto savePrice(@RequestBody PriceDto priceDto){

        return priceService.savePrice(priceDto);
    }

    @GetMapping(value = "/list")
    public List<PriceDto> getAllPrice(){

        return priceService.findAllPrice();
    }
}
