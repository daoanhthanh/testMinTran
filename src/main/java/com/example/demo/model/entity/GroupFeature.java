package com.example.demo.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Accessors(chain = true)
@Table(name = "groups_features")
public class GroupFeature{

    @Id
    @SequenceGenerator(name = "groups_features_id_seq", sequenceName = "groups_features_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groups_features_id_seq")
    private int id;

    private int groupId;

    private int featureId;
}

