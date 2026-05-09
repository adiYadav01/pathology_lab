package com.example.pathology_backend.repository;

import com.example.pathology_backend.entity.PathologyTest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PathologyTestRepository
        extends JpaRepository<PathologyTest, Long> {

    List<PathologyTest> findByNameContainingIgnoreCase(String name);
}