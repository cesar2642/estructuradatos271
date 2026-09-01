package org.example;

import org.example.arreglos.ArrayADT;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        ArrayADT<Empleado> listaEmpleados = new ArrayADT<>(14);

        String ruta = "src/main/resources/junio.dat";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            int indice = 0;

            String cabecera = br.readLine();

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                int num = Integer.parseInt(datos[0]);
                String nom = datos[1];
                String pat = datos[2];
                String mat = datos[3];
                int hrs = Integer.parseInt(datos[4]);
                double sueldo = Double.parseDouble(datos[5]);
                int anio = Integer.parseInt(datos[6]);

                Empleado emp = new Empleado(num, nom, pat, mat, hrs, sueldo, anio);

                listaEmpleados.insertarElemento(indice, emp);
                indice++;
            }
            System.out.println("--- Lista de Empleados ---");
            listaEmpleados.imprimir();

            Empleado empMayorAntiguedad = listaEmpleados.obtenerElemento(0);
            Empleado empMenorAntiguedad = listaEmpleados.obtenerElemento(0);

            for (int i = 1; i < listaEmpleados.longitud(); i++) {
                Empleado empActual = listaEmpleados.obtenerElemento(i);
                if (empActual.getAnioIngreso() < empMayorAntiguedad.getAnioIngreso()) {
                    empMayorAntiguedad = empActual;
                }
                if (empActual.getAnioIngreso() > empMenorAntiguedad.getAnioIngreso()) {
                    empMenorAntiguedad = empActual;
                }

            }
            System.out.println("\n================ REPORTES DE ANTIGÜEDAD ================");
            System.out.println("\nTrabajador con mayor antigüedad:");
            System.out.println(empMayorAntiguedad.getNombre() + " " + empMayorAntiguedad.getPaterno() + " (Ingreso: " + empMayorAntiguedad.getAnioIngreso() + ")");

            System.out.println("\nTrabajador con menor antigëdad:");
            System.out.println(empMenorAntiguedad.getNombre() + " " + empMenorAntiguedad.getPaterno() + " (Ingreso: " + empMenorAntiguedad.getAnioIngreso() + ")");


    }catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
}
}
