package kg.megacom.foodservice.services;

import kg.megacom.foodservice.models.dto.AccountDto;

import java.util.List;

public interface AccountService {
AccountDto saveAccount(AccountDto accountDto);
List<AccountDto>findAllAccount();
}
