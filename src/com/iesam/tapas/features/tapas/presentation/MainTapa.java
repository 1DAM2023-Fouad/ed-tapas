package com.iesam.tapas.features.tapas.presentation;

import com.iesam.tapas.features.tapas.data.TapaDataRepository;
import com.iesam.tapas.features.tapas.domain.*;

import java.util.ArrayList;

public class MainTapa {

    //MÉTODOS ESPECIALES

    //Crear tapa
    public static void createTapa(Tapa tapa) {
        TapaDataRepository tapaDataRepository = TapaDataRepository.newInstance();
        SaveTapaUseCase saveTapaUseCase = new SaveTapaUseCase(tapaDataRepository);
        saveTapaUseCase.execute(tapa);
    }

    //Imprimir lista de tapas - Array
    public static void printTapas() {
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        ArrayList<Tapa> tapas = tapasUseCase.execute();
        //imprimir cada una de las tapas
        System.out.println(tapas.toString());
    }

    //Imprimir 1 tapa en concreto (necesito el tapaId)
    public static void printTapa(String tapaId) {
        GetTapaUseCase getTapaUseCase = new GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = getTapaUseCase.execute(tapaId);
        //imprimir es tapa
        System.out.println(tapa.toString());
    }

    //Borrar tapa (necesito el tapaId)
    public static void deleteTapa(String tapaId) {
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        deleteTapaUseCase.execute(tapaId);
    }

    //Modidificar-Actualizar tapa
    public static void updateTapa(Tapa tapa) {
        UpdateTapaUseCase updateTapaUseCase = new UpdateTapaUseCase(TapaDataRepository.newInstance());
        updateTapaUseCase.execute(tapa);

    }


}
