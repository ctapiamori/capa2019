package com.docker.capa2019.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "alumno", schema = "")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

}
