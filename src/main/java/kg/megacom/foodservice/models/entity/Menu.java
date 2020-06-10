package kg.megacom.foodservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "menus")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "menu_id")
    private Long id;
    @OneToOne
    @JoinColumn(name = "restorant_id")
    private Restaurant restaurant;

    private Data dateCreate;
}
