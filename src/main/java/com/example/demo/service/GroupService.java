package com.example.demo.service;


import com.example.demo.mapper.GroupMapper;
import com.example.demo.repository.GroupFeatureRepository;
import com.example.demo.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class GroupService {
    
    private final GroupRepository groupRepository;

    private final GroupFeatureRepository groupFeatureRepository;

    private final FeatureService featureService;

    private final GroupMapper groupMapper;



}
