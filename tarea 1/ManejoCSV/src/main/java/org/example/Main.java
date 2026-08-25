package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //System.out.println("Hola mundo");
        //System.out.println("" + System.getProperty("user.home"));
        //System.out.println("" + System.getProperty("user.dir"));

        Scanner teclado = new Scanner(System.in);
        System.out.println("------COMPARADOR VISUALIZACIONES DE YOUTUBE-----");
        System.out.println("Introduce el número del mes inicial (1-12, ej. 1 para Enero): ");
        int mesInicioUsuario = teclado.nextInt();

        System.out.println("Introduce el número del mes final (1-12, ej. 1 para Enero): ");
        int mesFinUsuario = teclado.nextInt();

        int columnaInicio = mesInicioUsuario + 2;
        int columnaFin = mesFinUsuario + 2;

        ArchivosManejo archivo = new ArchivosManejo("src/main/resources/datosrs.csv");
        archivo.leer(columnaInicio, columnaFin);

    }
}
