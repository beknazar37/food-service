package kg.megacom.foodservice.models.entity;

import kg.megacom.foodservice.enums.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "order_histry")
public class OrderHistory {
    @Id
    @GeneratedValue
private Long id;
    private Date startDate;
    private Date endDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Order order;
    @Enumerated(value =EnumType.STRING )
    private OrderStatus orderStatus;

}
