package org.example;

public class Main {
    static void main() {
        /*System.out.println("----PRUEBA NODO-------");
        Nodo<Integer> head = new Nodo<>();
        head.setDato(40);
        head.setSiguiente(new Nodo<>(20));
        head.getSiguiente().setSiguiente(new Nodo<>(60));
        head.getSiguiente().getSiguiente().setSiguiente(new Nodo<>(90));

        System.out.println(head);
        System.out.println("Imprimir dato del segundo elemento: ");
        System.out.println(head.getSiguiente().getDato());*/
        System.out.println("-------PRUEBA LISTA LIGADA-------");
        ListaLigadaADT<Perro> lista = new ListaLigadaADT<>();
        System.out.println("-----Impresión de lista vacía---------");
        System.out.println(lista);
        Perro perro1 = new Perro("Princesa","Pitbull",7);
        Perro perro2 = new Perro("Firulais", "Gran Danes", 5);
        Perro perro3 = new Perro("Pancracio", "Dalmata", 4);
        lista.agregar(perro1);
        System.out.println("------Lista con objetos-----------");
        System.out.println(lista);
        lista.agregar(perro2);
        System.out.println(lista);
        System.out.println("------Agregamos Objeto al Inicio-----");
        lista.agregarAlInicio(perro3);
        System.out.println(lista);
        System.out.println("-------Elementos lista--------");
        lista.transversal();
        System.out.println("\n---Agregamos un elemento despues de otro-------");
        Perro perro4 = new Perro("Pancho","Cocker",2);
        lista.agregarDespuesDe(perro3,perro4);
        System.out.println(lista);
        lista.actualizar(perro3,perro2);
        System.out.println(lista);
        System.out.println("--------Tamaño de la lista------");
        System.out.println(lista.getTamanio());
        System.out.println("------Se elimina primer elemento-----");
        lista.eliminarElPrimero();
        System.out.println(lista);

    }
}
