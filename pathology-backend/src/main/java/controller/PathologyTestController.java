package com.example.pathology_backend.controller;

import com.example.pathology_backend.entity.PathologyTest;
import com.example.pathology_backend.service.PathologyTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tests")
@RequiredArgsConstructor
@CrossOrigin("*")
public class PathologyTestController {

    private final PathologyTestService service;

    @PostMapping
    public PathologyTest create(@RequestBody PathologyTest test) {
        return service.save(test);
    }

    @GetMapping
    public List<PathologyTest> getAll() {
        return service.getAll();
    }

    @GetMapping("/search")
    public List<PathologyTest> search(@RequestParam String name) {
        return service.search(name);
    }
}