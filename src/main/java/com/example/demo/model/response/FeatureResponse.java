package com.example.demo.model.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

//chỉ là dto thôi
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class FeatureResponse {

    private Integer id;

    private String name;

    private String description;

    private String path;

    private String method;

    private int point;

    private String status;

}
