package kg.megacom.foodservice.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "orderDetails")
public class OrderDetails {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    @JoinTable
    @JoinColumn(name = "dishes")
    private List<Dish> dishes;
    private int amount;
}
