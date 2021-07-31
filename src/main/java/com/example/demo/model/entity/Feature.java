package com.example.demo.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

import com.example.demo.model.common.Method;
import com.example.demo.model.common.Status;

@Entity
@Data
@Accessors(chain = true)
@Table(name = "features")
public class Feature  {

    @Id
    @SequenceGenerator(name = "features_id_seq", sequenceName = "features_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "features_id_seq")
    private Integer id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 200)
    private String description;

    @Column(length = 100, nullable = false)
    private String path;

    @Column(length = 10, nullable = false)
    @Enumerated(EnumType.STRING)
    private Method method;

    @Column(nullable = false)
    private Integer point;

    @Column(length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

}
