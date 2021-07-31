package com.example.demo.model.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Data
@Accessors(chain = true)
@Table(name = "`groups`")
public class Group {

    @Id
    @SequenceGenerator(name = "groups_id_seq", sequenceName = "groups_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "groups_id_seq")
    private Integer id;

    @Column(nullable = false)
    private Integer moduleId;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 200)
    private String description;
}
