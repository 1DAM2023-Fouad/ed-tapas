package com.iesam.tapas.features.tapas.domain;

import java.util.ArrayList;

public interface TapaRepository {


    Tapa obtainTapa(String tapaId); //GetTapaUseCase

    ArrayList<Tapa> obtainTapas(); //GetTapasUseCase

    void deleteTapa(String tapaId); //DeleteTapaUseCase

    void updateTapa(Tapa tapa);     //UpdateTapaUseCase
    void saveTapa(Tapa tapa);    //SaveTapaUseCase

    //Abstarcción es lo mismo que interfaz
}
