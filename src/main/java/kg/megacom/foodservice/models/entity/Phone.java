package kg.megacom.foodservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "phones")
public class Phone {
    @Id
    @GeneratedValue
    @Column(name = "phone_id")
    private Long id;
    @Column(length = 20)
    private String name;
    private boolean active;

}
