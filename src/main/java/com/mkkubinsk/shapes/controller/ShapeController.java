package com.mkkubinsk.shapes.controller;

import com.mkkubinsk.shapes.mapper.ShapeToDtoMapper;
import com.mkkubinsk.shapes.mapper.SquareToDtoMapper;
import com.mkkubinsk.shapes.model.Shape;
import com.mkkubinsk.shapes.model.command.CreateShapeCommand;
import com.mkkubinsk.shapes.model.command.CreateSquareCommand;
import com.mkkubinsk.shapes.model.command.UpdateShapeCommand;
import com.mkkubinsk.shapes.model.dto.ShapeDto;
import com.mkkubinsk.shapes.model.dto.SquareDto;
import com.mkkubinsk.shapes.service.ShapeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/shape")
public class ShapeController {

    private final ShapeService shapeService;
    private final ShapeToDtoMapper shapeToDtoMapper;
    private final SquareToDtoMapper squareToDtoMapper;

    @Autowired
    public ShapeController(ShapeService shapeService, ShapeToDtoMapper shapeToDtoMapper, SquareToDtoMapper squareToDtoMapper) {
        this.shapeService = shapeService;
        this.shapeToDtoMapper = shapeToDtoMapper;
        this.squareToDtoMapper = squareToDtoMapper;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ShapeDto> getAll() {
        List<Shape> shapeList = shapeService.getAll();
        return shapeList.stream()
                .map(shapeToDtoMapper::convertToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ShapeDto getById(@PathVariable UUID id) {
        return shapeToDtoMapper.convertToDto(shapeService.getById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ShapeDto create(@RequestBody CreateShapeCommand createShapeCommand) {
        return shapeToDtoMapper.convertToDto(shapeService.create(createShapeCommand));
    }

    @PostMapping("/square")
    @ResponseStatus(HttpStatus.CREATED)
    public SquareDto create(@RequestBody CreateSquareCommand createSquareCommand) {
        return squareToDtoMapper.convertToDto(shapeService.create(createSquareCommand));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ShapeDto update(@PathVariable UUID id,
                           @RequestBody CreateShapeCommand createShapeCommand) {
        return shapeToDtoMapper.convertToDto(
                shapeService.update(id, createShapeCommand)
        );
    }

}
