package com.example.pathology_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PathologyTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String code;

    private String sampleType;

    private String normalRange;

    private Double price;
}