package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ConjuntoADT<String> ana = new ConjuntoADT<>();
        ana.agregarElemento("ED");
        ana.agregarElemento("BD");
        ana.agregarElemento("Redes");
        ana.agregarElemento("IA");

        ConjuntoADT<String> luis = new ConjuntoADT<>();
        luis.agregarElemento("ED");
        luis.agregarElemento("Redes");
        luis.agregarElemento("SO");

        System.out.println("Materias inscritas de Ana : " + ana);
        System.out.println("Materias inscritas de Luis: " + luis);

        System.out.println("Total materias de Ana : " + ana.longitud());
        System.out.println("Total materias de Luis: " + luis.longitud());

        ana.agregarElemento("Web");
        System.out.println("Materias actualizadas de Ana: " + ana);
        System.out.println("Total de materias de Ana: " + ana.longitud());

        ana.eliminarElemento("IA");
        System.out.println("Materias actualizadas de Ana: " + ana);
        System.out.println("Total de materias de Ana: " + ana.longitud());


        System.out.println("¿Luis es subconjunto de Ana?     " + luis.esSubConjunto(ana));

        ConjuntoADT<String> union = ana.union(luis);
        System.out.println("Union (Materias que cursan Ana o Luis): " + union);

        ConjuntoADT<String> interseccion = ana.interseccion(luis);
        System.out.println("Interseccion (Materias en comun): " + interseccion);

        ConjuntoADT<String> diferenciaAnaLuis = ana.diferencia(luis);
        ConjuntoADT<String> diferenciaLuisAna = luis.diferencia(ana);
        System.out.println("Diferencia Ana - Luis (solo Ana cursa estas materias): " + diferenciaAnaLuis);
        System.out.println("Diferencia Luis - Ana (solo Luis cursa estas materias): " + diferenciaLuisAna);
    }
}
