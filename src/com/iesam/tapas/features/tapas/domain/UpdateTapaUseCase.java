package com.iesam.tapas.features.tapas.domain;

public class UpdateTapaUseCase {
    private TapaRepository tapaRepository;

    //Constructor
    public UpdateTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    //Método ejecutar
    public void execute(Tapa tapa){
        tapaRepository.updateTapa(tapa);
    }
}
