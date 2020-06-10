package kg.megacom.foodservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "accaunts")
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "accaunt_id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(length = 50)
    private String login;
    @Column(length = 50)
    private String password;

}
