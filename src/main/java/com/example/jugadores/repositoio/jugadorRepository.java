package com.example.jugadores.repositoio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.jugadores.models.jugadorModel;

@Repository
public interface jugadorRepository extends CrudRepository<jugadorModel, Integer> {

}
