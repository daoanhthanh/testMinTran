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
public class ModuleResponse {

    private Integer id;

    private String name;

    private String description;

    List<GroupResponse> groups;
}
