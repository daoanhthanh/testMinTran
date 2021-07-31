package com.example.demo.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class GroupResponse {

    private Integer id;

    private String name;

    private String description;

    private List<FeatureResponse> features;
}
