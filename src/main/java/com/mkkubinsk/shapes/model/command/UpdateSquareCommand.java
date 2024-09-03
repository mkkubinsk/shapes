package com.mkkubinsk.shapes.model.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateSquareCommand extends UpdateShapeCommand {

    private double dimensionA;
    private double dimensionB;

}
