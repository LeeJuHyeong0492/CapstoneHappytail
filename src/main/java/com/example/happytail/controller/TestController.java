package com.example.happytail.controller;

import com.example.happytail.entity.TestEntity;
import com.example.happytail.service.TestService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/test")
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    // 모든 데이터를 조회하는 엔드포인트
    @GetMapping
    @ResponseBody
    public List<TestEntity> getAllData() {
        List<TestEntity> result = testService.getAllData();
        return result;
    }

    // 특정 name을 가진 데이터를 조회하는 엔드포인트 test
    @GetMapping("/name/{name}")
    public List<TestEntity> getDataByName(@PathVariable String name) {
        return testService.getDataByName(name);
    }
}
