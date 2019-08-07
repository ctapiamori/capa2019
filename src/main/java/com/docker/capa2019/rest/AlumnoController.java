package com.docker.capa2019.rest;

import com.docker.capa2019.model.Alumno;
import com.docker.capa2019.service.AlumnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping
    public List<Alumno> getAlumnos(){
        return this.alumnoService.findAll();
    }

    @GetMapping("/{id}")
    public Alumno getAlumno(@PathVariable Long id){
        return this.alumnoService.getAlumno(id);
    }

    @PostMapping
    public Alumno saveAlumno(@RequestBody Alumno alumno){
        return this.alumnoService.save(alumno);
    }

    @DeleteMapping("/{id}")
    public void deleteAlumno(@PathVariable Long id){
        this.alumnoService.delete(id);
    }

}
