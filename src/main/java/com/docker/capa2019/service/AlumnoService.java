package com.docker.capa2019.service;

import com.docker.capa2019.model.Alumno;

import java.util.List;

public interface AlumnoService {

    Alumno save(Alumno alumno);

    Alumno getAlumno(Long id);

    List<Alumno> findAll();

    void delete(Long id);

}
