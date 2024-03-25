package tp1.ejercicio7;


import tp1.ejercicio3.Estudiante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) throws InterruptedException {
        int[] secuencia = {1,-55,5,-8,8,15,55,
                65,89,94,49,59,52,2,45,53,21,8,99,55,65,89,94,49,
                59,52,2,45,53,21,8,99,450,123,387,-589};
        //Ejercicio a)
        List<Integer> aList = new ArrayList<>();
        long lInicio,lFin = 0;
        lInicio = System.currentTimeMillis();
        for (Integer e: secuencia) {
            aList.add(e);
        }
        for (Integer e: aList) {
            System.out.println(e);
        }
        lFin =  System.currentTimeMillis();
        Double lTotal = (double) (lFin - lInicio);
        System.out.println(String.format("La lista tardó %s segundos en terminar", lTotal/1000));
        long lLInicio,lLFin = 0;
        lLInicio = System.currentTimeMillis();
        //Ejericio b
        List<Integer> aLList = new LinkedList<>();
        for (Integer e: secuencia) {
            aLList.add(e);
        }
        for (Integer e: aLList) {
            System.out.println(e);
        }
        lLFin =  System.currentTimeMillis();
        Double lLTotal = (double) (lLFin - lLInicio);
        System.out.println(String.format("La lista linkeada tardó %s segundos en terminar", lLTotal/1000));

        //Ejercicio c

        long wInicio,wFin = 0;
        wInicio = System.currentTimeMillis();
        List tmp = new ArrayList<>(aList);
        while (!tmp.isEmpty()) {
            System.out.println(tmp.get(0));
            tmp.remove(0);
        }
        wFin =  System.currentTimeMillis();
        Double wTotal = (double) (wFin - wInicio);
        System.out.println(String.format("La lista con While tardó %s segundos en terminar", wTotal/1000));

        long forInicio,forFin = 0;
        forInicio = System.currentTimeMillis();
        for (int i = 0; i < aList.size() - 1; i++) {
            System.out.println(aList.get(i));
        }
        forFin =  System.currentTimeMillis();
        Double forTotal = (double) (forFin - forInicio);
        System.out.println(String.format("La lista con for tardó %s segundos en terminar", forTotal/1000));
        long recursivoInicio,recursivoFin = 0;
        recursivoInicio = System.currentTimeMillis();
        porRecursividad(0,aList);
        recursivoFin =  System.currentTimeMillis();
        Double recursivoTotal = (double) (recursivoFin - recursivoInicio);
        System.out.println(String.format("La lista recursiva tardó %s segundos en terminar", recursivoTotal/1000));

        ejercicio7D();
        ArrayList<Integer> capiList = new ArrayList<>(List.of(1,2,3,4,5,6,7,6,5,4,3,2,1));
        System.out.println("La lista " + capiList + " va a ser evaluada.");
        System.out.println("¿Es capicúa?: " + esCapicua(capiList));
        System.out.println(capiList);
    }
    public static boolean esCapicua(ArrayList<Integer> lista) {
        boolean check = !lista.isEmpty();
        System.out.println("Primer check: " + check);
        if ((lista.size() % 2 != 0) && (lista.size() > 1)) {
            System.out.println("Entró al mod");
            ArrayList<Integer> tmp = new ArrayList<>(lista);
            tmp.remove((tmp.size()/2));
            return (check && esCapicua(tmp));
        }
        else  if (check){
            System.out.println("Entró al check " + lista.size());
            for (int i = lista.size()/2; i < lista.size(); i++) {
                System.out.println("Entró al for: " + i + " vez/ces: " + check);
                System.out.println(lista.get(lista.size()-i-1));
                System.out.println((lista.get(i)));
                if(!lista.get(lista.size()-i-1).equals(lista.get(i))) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
    public static void ejercicio7D() {
        //Creación de la lista de 3 estudiantes
        List<Estudiante> estudiantes = new ArrayList<Estudiante>(Arrays.asList(
            new Estudiante("estudiante1", "uno","e1@mail.com","calle 1",1),
            new Estudiante("estudiante2", "dos","e2@mail.com","calle 2",2),
            new Estudiante("estudiante3", "tres","e3@mail.com","calle 3",3)
        )
        );
        //Copia de la lista original
        List<Estudiante> estudiantesCopia = new ArrayList<>(estudiantes);
        //Imprimir lista original
        for (Estudiante e: estudiantes) {
            System.out.println(e.tusDatos());
        }
        //Imprimir lista copia
        for (Estudiante e: estudiantesCopia) {
            System.out.println(e.tusDatos());
        }
        //Modificaciones a lista original y copia
        estudiantes.get(0).setApellido("UNO");
        estudiantesCopia.get(2).setEmail("E3@email.com");
        //Impresión de que los cambios se generan en ambas listas por igual
        for (Estudiante e: estudiantes) {
            System.out.println(e.tusDatos());
        }
        for (Estudiante e: estudiantesCopia) {
            System.out.println(e.tusDatos());
        }
        agregarUnEstudiante(estudiantes);

        for (Estudiante e: estudiantes) {
            System.out.println(e.tusDatos());
        }

    }

    public static void agregarUnEstudiante(List<Estudiante> estudiantes) {
        Estudiante est = new Estudiante(
                "estudiante4","cuatro","e4@mail.com","calle 4",4
        );
        if (!estudiantes.contains(est)) {
            estudiantes.add(est);
        }
    }

    public static void porRecursividad(int  i, List<Integer> aList) {
        if (i < aList.size()) {
            System.out.println(aList.get(i));
            porRecursividad(i+1,aList);
        }
    }



}
