package com.tecazuay.demospringboots3.web.api;

import com.tecazuay.demospringboots3.model.Curso;
import com.tecazuay.demospringboots3.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    List<Curso> getAll(){
        return cursoRepository.findAll();
    }
    @PostMapping
    Curso create(@RequestBody Curso curso){
        return cursoRepository.save(curso);
    }
}
