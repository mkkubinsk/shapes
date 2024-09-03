package com.mkkubinsk.shapes.model.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateSquareCommand extends CreateShapeCommand {

    private double dimensionA;
    private double dimensionB;

}
