package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.mapper.FeatureMapper;
import com.example.demo.mapper.GroupMapper;
import com.example.demo.mapper.ModuleMapper;
import com.example.demo.model.common.Status;
import com.example.demo.model.entity.Group;
import com.example.demo.model.entity.GroupFeature;
import com.example.demo.model.response.ModuleResponse;
import com.example.demo.repository.FeatureRepository;
import com.example.demo.repository.GroupFeatureRepository;
import com.example.demo.repository.GroupRepository;
import com.example.demo.repository.ModuleRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ModuleService {

    private final ModuleRepository repository;

    private final GroupRepository groupRepository;

    private final GroupFeatureRepository gfRepository;

    private final FeatureRepository featureRepository;

    private final ModuleMapper moduleMapper;


    // TODO: this
    public List<ModuleResponse> getAll() {


        var moduleResponseList = moduleMapper.map(repository.findAll());

        var groupList = groupRepository.findAll();

        // achieve groupIds from groups
        var groupIdList = groupList.stream().map(Group::getId).collect(Collectors.toList());

        var groupFeatureList = gfRepository.findByGroupIdIn(groupIdList);

        var featureIds = groupFeatureList.stream().map(GroupFeature::getFeatureId)
                .collect(Collectors.toSet());

        var featureList = featureRepository.findByIdInAndStatusNot(featureIds, Status.DELETE);

        moduleResponseList.forEach(moduleResponse ->
                moduleMapper.map(moduleResponse, groupList, groupFeatureList, featureList));

        return moduleResponseList;
    }

}
