package com.iesam.tapas;

import com.iesam.tapas.features.tapas.domain.Tapa;
import com.iesam.tapas.features.tapas.presentation.MainTapa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Implementamos el scanner para que el usuario pueda escribir por consola
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("--------MENU--------");
        System.out.println("1-Crear una tapa");
        System.out.println("2-Obtener un listado de tapas");
        System.out.println("3-Obtener una tapa en concreto");
        System.out.println("4-Eliminar una tapa");
        System.out.println("5-Modificar una tapa");
        System.out.println("6-Exit");

        System.out.print("¿Que quieres hacer?: ");
        num = sc.nextInt();

        do {
            // Menú de 6 opciones
            switch (num) {
                case 1:
                    System.out.println("Acabas de introducir una tapa mediante constructores, (también se puede hacer pidiendole datos al usuario)");
                    Tapa newtapa = new Tapa("#04", "Albóndiga de faisán",
                            "Vermtería el Atrio",
                            "0 ptos", "0.0",
                            "Ninguno", "0",
                            "Faisán y Gambón");     //Con esto, estoy introduciendo esta tapa en la Base de Datos
                    //Estoy introduciendo estos cambios por constructor
                    MainTapa.createTapa(newtapa);

                    break;
                case 2:
                    System.out.println("Has elegido ver el listado de tapas");
                    MainTapa.printTapas();
                    break;
                case 3:
                    System.out.print("Has elegido ver una tapa en concreto, introduce el Id de la tapa que quieres ver: ");
                    String tapaId = sc.next();
                    MainTapa.printTapa(tapaId);
                    break;
                case 4:
                    System.out.print("Has elegido borrar una tapa, introduce el Id de la tapa que deseas borrar: ");
                    String deleteTapaId = sc.next();
                    MainTapa.deleteTapa(deleteTapaId);
                    break;
                case 5:
                    System.out.println("Has modifcado una tapa");
                    Tapa toUpdateTapa = new Tapa("#01",
                            "Albóndiga de faisán",
                            "Vermtería el Atrio",
                            "7 ptos", "5.8",
                            "3", "5",
                            "Faisán y Gambón"); //Estoy introduciendo estos cambios por constructor
                    MainTapa.updateTapa(toUpdateTapa);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    while (num > 6 || num <= 0) { //Esto no está bien del todo, porque los bucles me dán error
                        System.out.print("Operación no válida. Elige una opción del menú: ");
                        num = sc.nextInt();
                    }




            }
            System.out.println("--------MENU--------");
            System.out.println("1-Crear/Introducir una tapa");
            System.out.println("2-Obtener un listado de tapas");
            System.out.println("3-Obtener una tapa en concreto");
            System.out.println("4-Eliminar una tapa");
            System.out.println("5-Modificar una tapa");
            System.out.println("6-Exit");

            System.out.print("¿Que quieres hacer?: "); //Despues de cada bucle, el programa preguntará al usuario que quiere hacer nuevamente
            num = sc.nextInt();
        } while (num != 6);

        sc.close(); // Cerramos el scanner

    }
}