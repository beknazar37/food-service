package kg.megacom.foodservice.database;

import kg.megacom.foodservice.models.entity.OrderHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHistoryRepository extends JpaRepository<OrderHistory,Long> {
}
