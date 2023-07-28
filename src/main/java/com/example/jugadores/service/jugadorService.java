package com.example.jugadores.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jugadores.models.jugadorModel;
import com.example.jugadores.repositoio.jugadorRepository;

@Service
public class jugadorService {
    @Autowired
    jugadorRepository jugadorRepository;

    // se buscaran todos los datos de los jugadores
    public ArrayList<jugadorModel> obtenerJugadores() {
        return (ArrayList<jugadorModel>) jugadorRepository.findAll();
    }

    public Optional<jugadorModel> obtenerporId(Integer Id) {
        return jugadorRepository.findById(Id);
    }

    // metodo pra guardar un jugador
    public jugadorModel guardar(jugadorModel jugador) {
        return jugadorRepository.save(jugador);
    }

    public boolean eliminar(Integer Id) {
        try {
            jugadorRepository.deleteById(Id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

}
