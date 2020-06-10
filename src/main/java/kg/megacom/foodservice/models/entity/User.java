package kg.megacom.foodservice.models.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;
        @OneToOne
        @JoinColumn(name = "accaunt_id")
    private Account accaunt;
    @Column(length = 100)
private String name;
private boolean active;
@OneToOne
@JoinColumn(name = "position_id")
private Position position;
@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
private List<Phone> phones;


}
