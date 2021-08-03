package com.example.demo.service;


import com.example.demo.mapper.FeatureMapper;
import com.example.demo.repository.FeatureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class FeatureService {

    private final FeatureRepository featureRepository;

    private final FeatureMapper featureMapper;

}
