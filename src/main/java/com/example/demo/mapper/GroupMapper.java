package com.example.demo.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.model.entity.Feature;
import com.example.demo.model.entity.Group;
import com.example.demo.model.entity.GroupFeature;
import com.example.demo.model.response.FeatureResponse;
import com.example.demo.model.response.GroupResponse;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GroupMapper {

    private final FeatureMapper featureMapper;

    private final GroupFeatureMapper gfMapper;

    public GroupResponse map(Group group) {
        return new GroupResponse().setId(group.getId()).setName(group.getName())
                .setDescription(group.getDescription());
    }

    public GroupResponse map(Group group, List<FeatureResponse> featureResponses) {

        return this.map(group).setFeatures(featureResponses);
    }

    public List<GroupResponse> map(List<Group> groups) {
        return groups.stream().map(this::map).collect(Collectors.toList());
    }

    public List<GroupResponse> map(List<Group> groupList, List<GroupFeature> groupFeatureList,
            List<Feature> featureList) {
        return groupList.stream().map(group -> {
            var groupResponse = map(group);

            var featureIdSet = gfMapper.mapToFeatureIdSet(groupResponse.getId(), groupFeatureList);

            var featuresComeWithGroup = featureMapper.map(featureIdSet, featureList);

            groupResponse.setFeatures(featuresComeWithGroup);

            return groupResponse;
        }).collect(Collectors.toList());
    }
}
