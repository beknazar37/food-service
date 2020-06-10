package kg.megacom.foodservice.services.impl;

import kg.megacom.foodservice.database.AccountRepository;
import kg.megacom.foodservice.mappers.AccountMapper;
import kg.megacom.foodservice.models.dto.AccountDto;
import kg.megacom.foodservice.models.entity.Account;
import kg.megacom.foodservice.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public AccountDto saveAccount(AccountDto accountDto) {

        Account account = AccountMapper.INSTANCE.accountDtoToAccount(accountDto);
        account = accountRepository.save(account);
        accountDto = AccountMapper.INSTANCE.accountToAccountDto(account);

        return accountDto;
    }

    @Override
    public List<AccountDto> findAllAccount() {
        return accountRepository.findAll()
                .stream()
                .map(AccountMapper.INSTANCE::accountToAccountDto)
                .collect(Collectors.toList());
    }
}