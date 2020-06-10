package kg.megacom.foodservice.database;

import kg.megacom.foodservice.models.entity.RestaurantOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantOrderRepository extends JpaRepository<RestaurantOrder,Long> {
}
