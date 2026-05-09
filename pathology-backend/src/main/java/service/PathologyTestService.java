package com.example.pathology_backend.service;

import com.example.pathology_backend.entity.PathologyTest;
import com.example.pathology_backend.repository.PathologyTestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PathologyTestService {

    private final PathologyTestRepository repository;

    public PathologyTest save(PathologyTest test) {
        return repository.save(test);
    }

    public List<PathologyTest> getAll() {
        return repository.findAll();
    }

    public List<PathologyTest> search(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
}