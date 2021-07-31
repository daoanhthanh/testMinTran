package com.example.demo.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "modules")
@Data
@Accessors(chain = true)
public class Module {

    @Id
    @SequenceGenerator(name = "modules_id_seq", sequenceName = "modules_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "modules_id_seq")
    private Integer id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 200)
    private String description;
}
