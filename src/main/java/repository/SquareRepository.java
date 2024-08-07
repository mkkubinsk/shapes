package repository;

import model.Square;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SquareRepository extends JpaRepository<Square, UUID> {
}
