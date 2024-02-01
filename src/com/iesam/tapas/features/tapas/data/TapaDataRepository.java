package com.iesam.tapas.features.tapas.data;

import com.iesam.tapas.features.tapas.domain.Tapa;
import com.iesam.tapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

    //Esto es una concreción de la TapaRepository que es una abstracción

    private ArrayList<Tapa> localTapas = new ArrayList<>(); //Instancia de arrayList de tapas


    //Todos estos métodos de la clase TapaRepository, son concreciones de la interfaz
    @Override   //Método GetTapaUseCase
    public Tapa obtainTapa(String tapaId) {
        //Declaración variable tapa
        for (int i = 0; i < localTapas.size(); i++) {
            Tapa tapa = localTapas.get(i);
            if (tapa.id.equals(tapaId)) {
                return tapa;
            } //El profesor lo ha hecho con un for-each, pero es lo mismo
        }
        return null;
    }

    @Override   //Método GetTapasUseCase
    public ArrayList<Tapa> obtainTapas() {
        return localTapas;
    }

    @Override   //Método DeleteTapaUseCase
    public void deleteTapa(String tapaId) {
        for (int i = 0; i < localTapas.size(); i++) {
            if (localTapas.get(i).id.equals(tapaId)) {
                localTapas.remove(i);
            }
        }
    }


    @Override   //Método SaveTapaUseCase
    public void saveTapa(Tapa tapa) {
        localTapas.add(tapa);

    }

    @Override   //Método UpdateTapaUseCase
    public void updateTapa(Tapa tapa) {
        deleteTapa(tapa.id); //Primero buscamos una tapa con el id, luego se borra
        saveTapa(tapa);     //Luego la sustituye con la tapa nueva  (la tapa nueva tien modificacoines)
    }                   //Por útlimo, guardar una tapa haciendo uso del UseCase de guardar


    //Constructor de la clase?
    private TapaDataRepository() {
        initData();
    }

    private void initData() { //Inicializar objetos/datos relacionados con Tapas
        localTapas.add(new Tapa("#01", "Albóndiga de faisán", "Vermtería el Atrio", "0 ptos", "0.0", "Ninguno", "0", "Faisán y Gambón"));
        localTapas.add(new Tapa("#02", "Albóndiga de venado", "Bar/Restaurante Soul Kitchen", "0 ptos", "0.0", "Ninguno", "0", "Venado y Arándanos"));
        localTapas.add(new Tapa("#03", "Cerdería la bruja", "Restaurante La Bruja", "0 ptos", "0.0", "28 participantes", "28 votos", "Cerdo, cerveza"));
    }

    private static TapaDataRepository instance = null; //Instancia de patrón sinleTon

    //Patrón singleTon
    public static TapaDataRepository newInstance() {
        if (instance == null) {
            instance = new TapaDataRepository();
        }
        return instance;
    }

}
