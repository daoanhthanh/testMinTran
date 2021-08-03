package com.example.demo.repository;

import com.example.demo.model.common.Status;
import com.example.demo.model.entity.Feature;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Integer> {

    List<Feature> findByIdInAndStatusNot(Set<Integer> featureIds, Status status);

}
