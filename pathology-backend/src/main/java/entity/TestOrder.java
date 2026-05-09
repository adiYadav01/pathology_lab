package com.example.pathology_backend.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class TestOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderNumber;

    private String patientName;

    private String phone;

    private LocalDate orderDate;

    @ManyToOne
    @JoinColumn(name = "test_id")
    private PathologyTest pathologyTest;
}