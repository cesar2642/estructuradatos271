package org.example;

public class ListaLigadaADT<T> {
    private Nodo<T> head;

    public ListaLigadaADT(){
        this.head = null;
    }

    public void agregar(T dato){
        if (head == null){
            this.head = new Nodo<>(dato);
        }else{
            Nodo<T> actual = head;
            while(actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(new Nodo<>(dato));
        }
    }

    public void transversal(){
        if (head == null){
            System.out.println("Vacía");
        }else {
            Nodo<T> actual = head;
            while(actual.getSiguiente() != null){
                System.out.print("|" + actual.getDato());
                actual = actual.getSiguiente();
            }
        }
    }

    public void agregarAlInicio(T dato) {
        head = new Nodo<>(dato, head);
    }

    public void agregarDespuesDe(T referencia, T valor) {
        if (head == null) {
            System.out.println("Vacía");
        }else{
            Nodo<T> actual = this.head;
            while(!actual.getDato().equals(referencia)){
                actual = actual.getSiguiente();
            }
            Nodo<T> nuevoNodo = new Nodo<>(valor, actual.getSiguiente());
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void actualizar(T aBuscar, T nuevoValor){
        if(head == null){
            System.out.println("Vacía");
        }else{
            Nodo<T> actual = this.head;
            while(actual.getDato().equals(aBuscar)){
                actual = actual.getSiguiente();
            }
            actual.setDato(nuevoValor);
        }
    }

    public int getTamanio(){
        int contador = 0;
        Nodo<T> actual = head;
        while (actual != null){
            contador++;
            actual = actual.getSiguiente();
        }
        return contador;
    }

    public boolean estaVacia() {
        return head == null;
    }

    public T eliminarElPrimero() {
        if (head == null) {
            return null;
        }
        T dato = head.getDato();
        head = head.getSiguiente();
        return dato;
    }


    @Override
    public String toString() {
        return "ListaLigadaADT{" +
                "head=" + head +
                '}';
    }
}
