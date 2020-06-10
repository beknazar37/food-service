package kg.megacom.foodservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "positions")
public class Position {
    @Id
    @GeneratedValue
    @Column(name = "position_id")
    private Long id;
    @Column(length = 50)
    private String name;
        private boolean active;
}
