package com.iesam.tapas.features.tapas.domain;

public class DeleteTapaUseCase {
    private TapaRepository tapaRepository;

    //Constructor
    public DeleteTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    //Método ejecutar
    public void execute(String tapaId){
        tapaRepository.deleteTapa(tapaId);
    }
}
