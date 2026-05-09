package com.example.pathology_backend.controller;

import com.example.pathology_backend.entity.TestOrder;
import com.example.pathology_backend.entity.TestResult;
import com.example.pathology_backend.repository.TestOrderRepository;
import com.example.pathology_backend.repository.TestResultRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/results")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TestResultController {

    private final TestResultRepository resultRepository;
    private final TestOrderRepository orderRepository;

    @PostMapping
    public TestResult save(@RequestBody Map<String, String> request) {

        Long orderId = Long.parseLong(request.get("orderId"));

        TestOrder order =
                orderRepository.findById(orderId).orElseThrow();

        TestResult result = new TestResult();

        result.setTestOrder(order);
        result.setResultValue(request.get("resultValue"));
        result.setTechnicianNotes(request.get("technicianNotes"));
        result.setStatus("Completed");

        return resultRepository.save(result);
    }

    @GetMapping("/{orderId}")
    public TestResult getResult(@PathVariable Long orderId) {
        return resultRepository.findByTestOrderId(orderId)
                .orElseThrow();
    }
}