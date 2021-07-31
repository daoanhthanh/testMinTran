package com.example.demo.mapper;

import java.util.ArrayList;
import java.util.List;

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


    //thử làm cách khác :)))
    public List<FeatureResponse> map(List<Feature> features){
        var featureResponses = new ArrayList<FeatureResponse>();

        for(Feature f : features){
            featureResponses.add(map(f));
        }

        return featureResponses;
    }
}
