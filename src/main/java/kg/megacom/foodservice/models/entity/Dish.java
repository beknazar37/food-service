package kg.megacom.foodservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "dishs")
public class Dish {
    @Id
    @GeneratedValue
    @Column(name = "dish_id")
    private long id;
    @Column(length = 100)
    private String name;
    private boolean active;
    private float size;
    private String photo;
@ManyToOne(fetch = FetchType.EAGER)
@JoinColumn(name = "medu_id")
    private Menu menu;
}
