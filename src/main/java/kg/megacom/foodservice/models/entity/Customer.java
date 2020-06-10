package kg.megacom.foodservice.models.entity;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Data
@Entity
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long  id;
    @Column(length = 150,nullable = false)
    private String  name;

    @Column(length = 100,nullable = false)
    private String addres;
    @Column(name = "house_num")
    private Integer houseNum;
    @Column(name = "flat_num")
    private int flatNum;
@Column(length = 20)
    private String phone;
}
