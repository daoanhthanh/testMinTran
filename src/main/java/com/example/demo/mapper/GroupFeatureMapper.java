package com.example.demo.mapper;

import com.example.demo.model.entity.GroupFeature;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class GroupFeatureMapper {

    /**
     * Trả về một Set featureId của những Feature có liên kết với Group qua groupId
     * @param groupId int
     * @param groupFeatureList List<GroupFeature>
     * @return ids Set<Integer>
     */
    public Set<Integer> mapToFeatureIdSet(int groupId, List<GroupFeature> groupFeatureList){
        return groupFeatureList.stream()
                .filter(groupFeature -> groupFeature.getGroupId()==groupId)
                .map(GroupFeature::getFeatureId)
                .collect(Collectors.toSet());
    }
}
