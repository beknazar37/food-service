package kg.megacom.foodservice.models.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "statuses")
public class Status {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private boolean isActive;

}