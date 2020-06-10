package kg.megacom.foodservice.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "prices")
public class Price {
    @Id
    @GeneratedValue
    @Column(name = "price_id")
    private Long id;
    private Date startDate;
    private Date endDate;
    private double price;
@ManyToOne
@JoinColumn(name = "dish_id")
    private Dish dish;
}
