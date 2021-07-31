package com.example.demo.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.model.entity.Group;
import com.example.demo.model.response.GroupResponse;

import org.springframework.stereotype.Component;

@Component
public class GroupMapper {

    public GroupResponse map(Group group){
        return new GroupResponse().setId(group.getId())
                .setName(group.getName())
                .setDescription(group.getDescription());
    }

    public List<GroupResponse> map(List<Group> groups){

        return groups.stream().map(this::map).collect(Collectors.toList());
    }
}
