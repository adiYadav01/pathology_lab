package com.example.pathology_backend.controller;

import com.example.pathology_backend.entity.PathologyTest;
import com.example.pathology_backend.entity.TestOrder;
import com.example.pathology_backend.repository.PathologyTestRepository;
import com.example.pathology_backend.repository.TestOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
@CrossOrigin("*")
public class TestOrderController {

    private final TestOrderRepository orderRepository;
    private final PathologyTestRepository testRepository;

    @PostMapping
    public TestOrder create(@RequestBody Map<String, String> request) {

        Long testId = Long.parseLong(request.get("testId"));

        PathologyTest test =
                testRepository.findById(testId).orElseThrow();

        TestOrder order = new TestOrder();

        order.setPatientName(request.get("patientName"));
        order.setPhone(request.get("phone"));
        order.setOrderDate(LocalDate.now());

        order.setOrderNumber("ORD" + System.currentTimeMillis());

        order.setPathologyTest(test);

        return orderRepository.save(order);
    }

    @GetMapping("/today")
    public List<TestOrder> getTodayOrders() {
        return orderRepository.findByOrderDate(LocalDate.now());
    }
}