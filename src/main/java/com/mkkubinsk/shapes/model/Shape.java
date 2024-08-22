package com.mkkubinsk.shapes.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Entity
@Table(name = "shape")
@Getter
@Setter
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Shape {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

}
