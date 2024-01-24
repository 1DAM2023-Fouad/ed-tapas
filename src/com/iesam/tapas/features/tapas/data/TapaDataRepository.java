package com.iesam.tapas.features.tapas.data;

import com.iesam.tapas.features.tapas.domain.Tapa;
import com.iesam.tapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {


    @Override   //Método GetTapaUseCase
    public Tapa obtainTapa(String tapaId) {
        return null;
    }

    @Override   //Método GetTapasUseCase
    public ArrayList<Tapa> obtainTapas() {
        return null;
    }

    @Override   //Método DeleteTapaUseCase
    public void deleteTapa(String tapaId) {

    }

    @Override   //Método UpdateTapaUseCase
    public void updateTapa(Tapa tapa) {

    }

    @Override   //Método SaveTapaUseCase
    public void saveTapa(Tapa tapa){

    }
    /*
    Me falta el patron de diseño SingleTon, la instancia del ArrayList,
    los métodos del MainTapa y crear el menú en el Main principal llamando
    a los método del MainTapa
     */

}
