package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


        Nodo<String> head = new Nodo<>("AI", new Nodo<>("B", new Nodo<>("C", new Nodo<>("De", new Nodo<>("Mc", new Nodo<>("Zi"))))));

        System.out.println("------Estado inicial completo de la lista-----");
        Nodo.imprimirEstado(head);
        System.out.println("\n");
        System.out.println(head);

        System.out.println("\n-------Dato primer Nodo de la lista----------");
        System.out.println(head.getDato());


        System.out.println("-------Estado completo de último Nodo----------");

        Nodo<String> actual = head;
        while (actual.getSiguiente() != null){
            actual = actual.getSiguiente();
        }
        System.out.println(actual);

        System.out.println("-----------Nuevo estado de lista con Fe-----------");

        actual = head;
        //System.out.println(actual);

        while (!actual.getDato().equals("De")){
            actual = actual.getSiguiente();
        }
        Nodo<String> nuevo = new Nodo<>("Fe", actual.getSiguiente());
        //System.out.println(nuevo);
        actual.setSiguiente(nuevo);
        Nodo.imprimirEstado(head);
        System.out.println("\n");
        System.out.println(head);

        System.out.println("--------Nuevo estado con Zz al final--------------");

        actual = head;
        while( actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        actual.setSiguiente(new Nodo<>("Zz"));
        Nodo.imprimirEstado(head);
        System.out.println("\n");
        System.out.println(head);

        System.out.println("-------Nuevo estado con Aa al inicio---------------");

        head = new Nodo<>("Aa", head);
        Nodo.imprimirEstado(head);
        System.out.println("\n");
        System.out.println(head);

        /*
        System.out.println(head.getSiguiente().getSiguiente().getDato());
        System.out.println(head.getSiguiente().getSiguiente().getSiguiente().getDato());
         */
        
    }
}
