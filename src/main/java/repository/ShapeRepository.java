package repository;

import model.Shape;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShapeRepository extends JpaRepository<Shape, UUID> {
}
