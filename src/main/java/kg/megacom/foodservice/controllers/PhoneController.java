package kg.megacom.foodservice.controllers;

import kg.megacom.foodservice.models.dto.PhoneDto;
import kg.megacom.foodservice.services.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/phone")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;

    @PostMapping(value = "/save")
    public PhoneDto savePhone(@RequestBody PhoneDto phoneDto){

        return phoneService.savePhone(phoneDto);
    }

    @GetMapping(value = "/list")
    public List<PhoneDto> getAllPhone(){

        return phoneService.findAllPhone();
    }{

    }
}
