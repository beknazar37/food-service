package kg.megacom.foodservice.controllers;

import kg.megacom.foodservice.models.dto.StatusDto;
import kg.megacom.foodservice.services.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @PostMapping(value = "/save")
    public StatusDto saveStatus(@RequestBody StatusDto statusDto){

        return statusService.saveStatus(statusDto);
    }

    @GetMapping(value = "/list")
    public List<StatusDto> getAllStatus(){

        return statusService.findAllStatus();
    }
}
