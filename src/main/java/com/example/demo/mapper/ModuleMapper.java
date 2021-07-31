package com.example.demo.mapper;

import java.util.List;
import java.util.stream.Collectors;


import com.example.demo.model.entity.Module;
import com.example.demo.model.response.ModuleResponse;

import org.springframework.stereotype.Component;

@Component
public class ModuleMapper {
    
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

    /**
     * Map một list Module sang list ModuleResponse
     * @param modules
     * @return
     */
    public List<ModuleResponse> map(List<Module> modules){
        return modules.stream().map(this::map).collect(Collectors.toList());
    }
}
