package org.example;

public class Array2D <T>{
    private int renglones;
    private int columnas;
    private Object[][] datos;

    public Array2D(int ren, int col) {
        this.renglones = ren;
        this.columnas = col;
        this.datos = new Object[ren][col];
    }

    public T obtenerElemento(int ren, int col) {

        if (ren >= 0 && ren < renglones && col >= 0 && col < columnas) {
            return (T) datos[ren][col];
        }else {
            System.out.println("Posición fuera de rango");
            throw new IndexOutOfBoundsException();
        }

    }

    public void insertarElemento(int ren, int col, T elemento) {
        if (ren >= 0 && ren < renglones && col >= 0 && col < columnas) {
            datos[ren][col] = elemento;
        }else {
            System.out.println("Posición fuera de rango");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int obtenerRenglones() {
        return  renglones;
    }

    public int obtenerColumnas() {
        return columnas;
    }

    public void rellenar (T elemento) {
        for (int i = 0; i < renglones; i++) {
            for (int j = 0; j < columnas; j++) {
                datos[i][j] = (Object) elemento;
            }
        }
    }

}
