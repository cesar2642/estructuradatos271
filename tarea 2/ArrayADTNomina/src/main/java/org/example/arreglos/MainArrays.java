package org.example.arreglos;

public class MainArrays {
    public static void main(String[] args) {
        ArrayADT<Float> edades = new ArrayADT<>(10);
        System.out.println("Tamaño del arreglo: " + edades.longitud());
        edades.rellenar(1.0f);
        edades.imprimir();

        System.out.println("---------");

        ArrayADT<String> nombres = new ArrayADT<>(10);
        nombres.rellenar("S/N");
        nombres.imprimir();
        nombres.insertarElemento(5,"Cesar");
        nombres.imprimir();

    }
}
