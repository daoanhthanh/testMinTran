package com.example.demo.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.example.demo.model.entity.Feature;
import com.example.demo.model.response.FeatureResponse;

import org.springframework.stereotype.Component;

@Component
public class FeatureMapper {

    public FeatureResponse map(Feature feature){
        return new FeatureResponse().setId(feature.getId())
                .setName(feature.getName())
                .setDescription(feature.getDescription())
                .setPath(feature.getPath())
                .setMethod(feature.getMethod().name())
                .setPoint(feature.getPoint())
                .setStatus(feature.getStatus().name());
    }


    public List<FeatureResponse> map(List<Feature> features){
        return features.stream().map(this::map).collect(Collectors.toList());
    }

    public List<FeatureResponse> map(Set<Integer> featureIdSet, List<Feature> featureList) {
        return featureList.stream()
                .filter(feature -> featureIdSet.contains(feature.getId()))
                .map(this::map)
                .collect(Collectors.toList());
    }
}
