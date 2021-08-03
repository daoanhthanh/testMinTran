package com.example.demo.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


import com.example.demo.model.entity.Feature;
import com.example.demo.model.entity.Group;
import com.example.demo.model.entity.GroupFeature;
import com.example.demo.model.entity.Module;
import com.example.demo.model.response.ModuleResponse;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ModuleMapper {

    private final GroupMapper groupMapper;
    
    /**
     * Map từ module sang ModuleResponse
     * @param module Module
     * @return ModuleResponse
     */
    public ModuleResponse map(Module module){
        return new ModuleResponse()
                .setId(module.getId())
                .setName(module.getName())
                .setDescription(module.getDescription());
    }

    public List<ModuleResponse> map(List<Module> modules) {
        return modules.stream().map(this::map).collect(Collectors.toList());
    }

    public void map(ModuleResponse moduleResponse,
                    List<Group> groupList,
                    List<GroupFeature> groupFeatureList, List<Feature> featureList) {

        var groupResponseList = groupMapper.map(groupList, groupFeatureList, featureList);

        moduleResponse.setGroups(groupResponseList);
    }

}
