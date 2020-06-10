package kg.megacom.foodservice.database;

import kg.megacom.foodservice.models.entity.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends JpaRepository<Price,Long> {
}
