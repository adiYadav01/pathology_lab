package com.example.pathology_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TestResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String resultValue;

    private String technicianNotes;

    private String status;

    @OneToOne
    @JoinColumn(name = "order_id")
    private TestOrder testOrder;
}