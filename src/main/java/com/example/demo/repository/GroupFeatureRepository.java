package com.example.demo.repository;

import com.example.demo.model.entity.GroupFeature;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupFeatureRepository extends JpaRepository<GroupFeature, Integer> {

    List<GroupFeature> findByGroupIdIn(List<Integer> groupIds);
}
