package com.iesam.tapas.features.tapas.domain;

public class GetTapaUseCase {
    private TapaRepository tapaRepository;

    //Constructor
    public GetTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    //Método ejecutar
    public Tapa execute(String tapaId){
        return this.tapaRepository.obtainTapa(tapaId);
    }
}
