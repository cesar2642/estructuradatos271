package org.example;

public class TableroAjedrez {

    private Array2D<Character> tablero;

    public TableroAjedrez() {
        tablero = new Array2D<>(8,8);
        iniciarTablero();

    }

    /*private void limpiarTablero() {
        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                tablero.insertarElemento(f, c, " ");
            }
        }
    }*/

    private void iniciarTablero() {

        tablero.insertarElemento(0,0, '\u265C');
        tablero.insertarElemento(0,1, '\u265E');
        tablero.insertarElemento(0,2, '\u265D');
        tablero.insertarElemento(0,3, '\u265B');
        tablero.insertarElemento(0,4, '\u265A');
        tablero.insertarElemento(0,5, '\u265D');
        tablero.insertarElemento(0,6, '\u265E');
        tablero.insertarElemento(0,7, '\u265C');

        for (int col = 0; col < 8; col ++){
            tablero.insertarElemento(1, col, '\u265F');
        }

        for (int ren = 2; ren < 6; ren++) {
            for (int col = 0; col < 8; col++){
                tablero.insertarElemento(ren, col, ' ');
            }
        }

        for (int col = 0; col < 8; col++) {
            tablero.insertarElemento(6, col, '\u2659');
        }

        tablero.insertarElemento(7,0, '\u2656');
        tablero.insertarElemento(7,1, '\u2658');
        tablero.insertarElemento(7,2, '\u2657');
        tablero.insertarElemento(7,3, '\u2655');
        tablero.insertarElemento(7,4, '\u2654');
        tablero.insertarElemento(7,5, '\u2657');
        tablero.insertarElemento(7,6, '\u2658');
        tablero.insertarElemento(7,7, '\u2656');

    }

    public void imprimir() {

        for (int ren = 0; ren < 8; ren++){
            System.out.print((8-ren) + " ");

            for (int col = 0; col < 8; col++) {
                System.out.print(
                        tablero.obtenerElemento(ren, col) + " "
                );
            }

            System.out.println();
        }


    }
}
