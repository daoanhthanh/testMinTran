package com.example.demo.repository;

import com.example.demo.model.common.Status;
import com.example.demo.model.entity.Feature;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Integer> {

//    @Query("select f from Feature f where f.id in ?1 and f.status <> ?2")
//    @Query("select f from Feature f where f.id in ?1 and f.status = ?2")
    List<Feature> findByIdInAndStatusNot(Set<Integer> featureIds, Status status);

}
