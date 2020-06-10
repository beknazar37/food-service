package kg.megacom.foodservice.controllers;

import kg.megacom.foodservice.models.dto.AccountDto;
import kg.megacom.foodservice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/save")
    public AccountDto saveAccount(@RequestBody AccountDto accountDto) {

        return accountService.saveAccount(accountDto);
    }

    @GetMapping(value = "/list")
    public List<AccountDto> getAllAccounts() {

        return accountService.findAllAccount();
    }
}