package com.example.pathology_backend.repository;

import com.example.pathology_backend.entity.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TestResultRepository
        extends JpaRepository<TestResult, Long> {

    Optional<TestResult> findByTestOrderId(Long orderId);
}