package kg.megacom.foodservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "restaurant_id")
    private Long id;
    @Column(length = 100)
    private String name;
    private boolean active;
}
