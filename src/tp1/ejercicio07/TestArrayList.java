package tp1.ejercicio07;


import tp1.ejercicio03.Estudiante;

import java.util.*;

public class TestArrayList {
    public static void main(String[] args){
        int[] secuencia = {1,-55,5,-8,8,15,55,
                65,89,94,49,59,52,2,45,53,21,8,99,55,65,89,94,49,
                59,52,2,45,53,21,8,99,450,123,387,-589};
        //Ejercicio a)
        List<Integer> aList = new ArrayList<>();
        long lInicio,lFin;
        lInicio = System.currentTimeMillis();
        for (Integer e: secuencia) {
            aList.add(e);
        }
        for (Integer e: aList) {
            System.out.println(e);
        }
        lFin =  System.currentTimeMillis();
        double lTotal = (double) (lFin - lInicio);
        System.out.println("La lista tardó " + lTotal/1000 + " segundos en terminar");
        long lLInicio,lLFin;
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
        double lLTotal = (double) (lLFin - lLInicio);
        System.out.println("La lista linkeada tardó " + lLTotal/1000 + " segundos en terminar");

        //Ejercicio c

        long wInicio,wFin;
        wInicio = System.currentTimeMillis();
        List<Integer> tmp = new ArrayList<>(aList);
        while (!tmp.isEmpty()) {
            System.out.println(tmp.get(0));
            tmp.remove(0);
        }
        wFin =  System.currentTimeMillis();
        double wTotal = (double) (wFin - wInicio);
        System.out.println("La lista con While tardó " + wTotal/1000 +
                "segundos en terminar");

        long forInicio,forFin;
        forInicio = System.currentTimeMillis();
        for (int i = 0; i < aList.size() - 1; i++) {
            System.out.println(aList.get(i));
        }
        forFin =  System.currentTimeMillis();
        double forTotal = (double) (forFin - forInicio);
        System.out.println("La lista con for tardó " + forTotal/1000
                 + " segundos en terminar");
        long recursivoInicio,recursivoFin;
        recursivoInicio = System.currentTimeMillis();
        porRecursividad(0,aList);
        recursivoFin =  System.currentTimeMillis();
        double recursivoTotal = (double) (recursivoFin - recursivoInicio);
        System.out.println("La lista recursiva tardó " + recursivoTotal/1000
                 + " segundos en terminar");

        ejercicio7D();
        ArrayList<Integer> capiList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,6,5,4,3,2,1));
        System.out.println("La lista " + capiList + " va a ser evaluada.");
        System.out.println("¿Es capicúa?: " + esCapicua(capiList));
        System.out.println(capiList);
        
        //Ejercicio7g)

        System.out.println(EjercicioSucesion.calcularSucesion(6));
        
        //Ejercicio7h)
        ArrayList<Integer> miLista = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        invertirArrayListSinRecursion(miLista);
        System.out.println(miLista);
        invertirArrayList(miLista);
        System.out.println(miLista);

        //Ejercicio7i)
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(1);
        linkedList2.addLast(3);
        linkedList2.addFirst(2);
        linkedList2.add(6);
        linkedList2.add(4,4);

        System.out.println("LinkedList: " + linkedList);
        System.out.println("Suma total: " + sumarLinkedList(linkedList));
        System.out.println("LinkedList2: " + linkedList2);
        System.out.println("Suma total: " + sumarLinkedList(linkedList2));

        ArrayList<Integer> oList1 = new ArrayList<>(Arrays.asList(1,5,8,9,10,15,35));
        ArrayList<Integer> oList2 = new ArrayList<>(Arrays.asList(5,7,9,17,35,77,79,81));
        ArrayList<Integer> oListRes = new ArrayList<>(combinarOrdenado(oList1,oList2));
        System.out.println(oListRes.size() + " " + oListRes);


    }

    public static ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        ArrayList<Integer> resultado = new ArrayList<>();
        int i = 0, j = 0;
        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }
        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }
        while (j < lista2.size()) {
            resultado.add(lista2.get(j));
            j++;
        }
        return new ArrayList<Integer>(resultado);
    }


    private static int  sumarLinkedList (LinkedList<Integer> linkedList) {
        Iterator<Integer> nodo = linkedList.iterator();
        return sumarNodos(nodo);
    }

    private static int sumarNodos(Iterator<Integer> nodo) {
        if (!nodo.hasNext()) {
            return 0;
        }
        else {
            return nodo.next() + sumarNodos(nodo);
        }
    }

    public static void invertirArrayList(ArrayList<Integer> miLista) {
		invertirArray(miLista,0);
		
	}
	private static void invertirArray(ArrayList<Integer> miLista, int pos) {
		if (pos < miLista.size()/2) {
			Integer aux = miLista.get(pos);
    		miLista.set(pos, miLista.get(miLista.size()-1-pos));
    		miLista.set(miLista.size()-1-pos, aux);
    		invertirArray(miLista,pos+1);
		}
		
	}
	
	public static boolean esCapicua(ArrayList<Integer> lista) {
		return esCapicuaRecursivo(lista,0);
	}
	private static boolean esCapicuaRecursivo(ArrayList<Integer> lista, int pos) {
		if(pos < lista.size()/2) {
			
			return (esCapicuaRecursivo(lista,pos+1) && (lista.get(pos).equals(lista.get(lista.size()-1-pos))));
		}
		else return !lista.isEmpty();
	}

    public static void ejercicio7D() {
        //Creación de la lista de 3 estudiantes
        List<Estudiante> estudiantes = new ArrayList<>(Arrays.asList(
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
    public static void invertirArrayListSinRecursion(ArrayList<Integer> lista) {
    	for(int pos = 0; pos < lista.size()/2; pos++) {
    		Integer aux = lista.get(pos);
    		lista.set(pos, lista.get(lista.size()-1-pos));
    		lista.set(lista.size()-1-pos, aux);
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
