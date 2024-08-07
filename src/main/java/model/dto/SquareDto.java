package model.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Getter
@Setter
public class SquareDto extends ShapeDto{

    private double dimensionA;
    private double dimensionB;

    public SquareDto(UUID id, String color, double dimensionA, double dimensionB) {
        super.setId(id);
        super.setColor(color);
        this.dimensionA = dimensionA;
        this.dimensionB = dimensionB;
    }
}
