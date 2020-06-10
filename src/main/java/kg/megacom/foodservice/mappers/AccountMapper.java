package kg.megacom.foodservice.mappers;

import kg.megacom.foodservice.models.dto.AccountDto;
import kg.megacom.foodservice.models.entity.Account;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface AccountMapper {
    AccountMapper INSTANCE= Mappers.getMapper(AccountMapper.class);

    Account accountDtoToAccount(AccountDto accountDto);
    AccountDto accountToAccountDto(Account account);

    List<Account> accountDtoToAccounts(List<AccountDto> accountDtos);
    List<AccountDto> accountsToAccountDtos(List<Account> accounts);
}
