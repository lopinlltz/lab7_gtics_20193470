package com.example.lab7.repository;

import com.example.lab7.entity.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
