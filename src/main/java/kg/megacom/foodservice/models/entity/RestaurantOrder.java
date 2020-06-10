package kg.megacom.foodservice.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "restaurant_orders")
public class RestaurantOrder {
    @Id
    @GeneratedValue
    @Column(name = "rest_order_id")
    private Long Id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;
@ManyToOne
@JoinColumn(name = "order_id")
    private Order order;
@Column(name = "is_ready")
private boolean isReady;
private Date startDate;
private Date endDate;


}
