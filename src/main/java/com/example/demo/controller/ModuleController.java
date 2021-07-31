package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.response.ModuleResponse;
import com.example.demo.service.ModuleService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/modules")
@RequiredArgsConstructor
public class ModuleController {

    private final ModuleService moduleService;
    
    public List<ModuleResponse> getAll(){
        return moduleService.getAll();
    }
}
