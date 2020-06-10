package kg.megacom.foodservice.database;

import kg.megacom.foodservice.models.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DishRepository extends JpaRepository<Dish,Long> {
}
