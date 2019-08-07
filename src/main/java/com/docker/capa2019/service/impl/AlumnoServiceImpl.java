package com.docker.capa2019.service.impl;

import com.docker.capa2019.model.Alumno;
import com.docker.capa2019.repository.AlumnoRepository;
import com.docker.capa2019.service.AlumnoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlumnoServiceImpl implements AlumnoService {

    private final AlumnoRepository alumnoRepository;

    @Override
    public Alumno save(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public Alumno getAlumno(Long id) {
        return alumnoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Alumno> findAll() {
        return alumnoRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        alumnoRepository.deleteById(id);
    }
}
