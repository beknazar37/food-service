package kg.megacom.foodservice.models.dto;

import lombok.Data;

import javax.persistence.Column;
@Data
public class CustomerDto {
    private Long  id;
    private String  name;
    private String addres;
    private Integer houseNum;
    private int flatNum;
    private String phone;
}
