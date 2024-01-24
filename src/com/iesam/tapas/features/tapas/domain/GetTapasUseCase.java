package com.iesam.tapas.features.tapas.domain;

import java.util.ArrayList;

public class GetTapasUseCase {
    private TapaRepository tapaRepository;

    //Constructor
    public GetTapasUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    //Método ejecutar
    public ArrayList<Tapa> execute(){
        return tapaRepository.obtainTapas();
    }
}
