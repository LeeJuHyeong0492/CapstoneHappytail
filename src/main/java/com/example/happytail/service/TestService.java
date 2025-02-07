package com.example.happytail.service;

import com.example.happytail.entity.TestEntity;
import com.example.happytail.repository.TestRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TestService {
    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    // 모든 데이터를 조회하는 메서드
    public List<TestEntity> getAllData() {
        return testRepository.findAll();
    }

    // 특정 name을 가진 데이터를 조회하는 메서드
    public List<TestEntity> getDataByName(String name) {
        return testRepository.findAllByName(name);
    }
}