package tp5;

import tp5.ejParcial.ParcialGrafos;
import tp5.ejParcial.Vuelos;
import tp5.ejercicio01.Edge;
import tp5.ejercicio01.Graph;
import tp5.ejercicio01.Vertex;
import tp5.ejercicio01.adjList.AdjListGraph;
import tp5.ejercicio01.adjList.AdjListVertex;
import tp5.ejercicio02.Recorridos;
import tp5.ejercicio03.Mapa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mainGrafos {
    public static void main (String[] args) {
//        initEje02();
//        initEj03();
//        initEj03b();
 //       initParcial();

        initParcialCaperucita();



    }

    private static void initParcialCaperucita() {
        Graph<String> bosque = new AdjListGraph<>();
        Vertex<String> v1 = bosque.createVertex("Casa Caperucita");
        Vertex<String> v2 = bosque.createVertex("Claro A");
        Vertex<String> v3 = bosque.createVertex("Claro B");
        Vertex<String> v4 = bosque.createVertex("Claro C");
        Vertex<String> v5 = bosque.createVertex("Claro D");
        Vertex<String> v6 = bosque.createVertex("Claro E");
        Vertex<String> v7 = bosque.createVertex("Claro F");
        Vertex<String> v8 = bosque.createVertex("Casa Abuelita");

        bosque.connect(v1, v2, 10); //Caperucita c1
        bosque.connect(v2, v1, 10); //Caperucita c1
        bosque.connect(v1, v3, 3); //Caperucita c2
        bosque.connect(v3, v1, 3); //Caperucita c2
        bosque.connect(v2, v3, 30); //c1 c2
        bosque.connect(v3, v2, 30); //c2 c1
        bosque.connect(v2, v4, 18); //c1 c3
        bosque.connect(v4, v2, 18); //c3 c1
        bosque.connect(v3, v5, 30); //c2 c4
        bosque.connect(v5, v3, 30); //c4 c2
        bosque.connect(v3, v6, 30); //c2 c5
        bosque.connect(v6, v3, 30); //c5 c2
        bosque.connect(v4, v6, 15); //c3 c5
        bosque.connect(v6, v4, 15); //c3 c5
        bosque.connect(v4, v5, 18); //c3 c4
        bosque.connect(v5, v4, 18); //c3 c4
        bosque.connect(v7, v8, 1); //c6 Abuelita
        bosque.connect(v8, v7, 1); //c6 Abuelita
        bosque.connect(v6, v8, 1); //c5 Abuelita
        bosque.connect(v8, v6, 1); //c5 Abuelita
        bosque.connect(v5, v7, 5); //c4 c6
        bosque.connect(v7, v5, 5); //c4 c6
        ParcialGrafos parcial = new ParcialGrafos();
        List<String> fin =
        parcial.retornarMejorCaminoMaxFrutales(bosque,"Casa Caperucita","Casa Abuelita", 30);
        System.out.println(fin);
    }

    private static void initParcial()  {
        Graph<String> ciudades = new AdjListGraph<>();
        Vertex<String> v1 = ciudades.createVertex("Buenos Aires");
        Vertex<String> v2 = ciudades.createVertex("Santiago");
        Vertex<String> v3 = ciudades.createVertex("Asunción");
        Vertex<String> v4 = ciudades.createVertex("Caracas");
        Vertex<String> v5 = ciudades.createVertex("Madrid");
//        Vertex<String> v6 = ciudades.createVertex("Roma");
//        Vertex<String> v7 = ciudades.createVertex("Paris");
        Vertex<String> v8 = ciudades.createVertex("Tokio");

        ciudades.connect(v1, v2, 3); //"Buenos Aires", "Santiago"
        ciudades.connect(v1, v3, 6); //"Buenos Aires", "Asunción"
        ciudades.connect(v8, v1, 10); //"Tokio" , "Buenos Aires"
        ciudades.connect(v3, v5, 10); //
        ciudades.connect(v3, v4, 2); //
        ciudades.connect(v4, v5, 2); //
        ciudades.connect(v4, v8, 20); //
        Vuelos vuelos = new Vuelos(ciudades);
        List<List<String>> lista = vuelos.vuelosADistancia(10);
        for (List<String> e: lista){
            System.out.println(e);
        }
    }

    private static void initEj03() {
        Vertex<String> v01;
        Vertex<String> v02;
        Vertex<String> v03;
        Vertex<String> v04;
        Vertex<String> v05;
        Vertex<String> v06;
        Graph<String> graph =  new AdjListGraph<>();
        v01 = graph.createVertex("La Plata");
        v02 = graph.createVertex("Berisso");
        v03 = graph.createVertex("Ensenada");
        v04 = graph.createVertex("Punta Indio");
        v05 = graph.createVertex("Verónica");
        v06 = graph.createVertex("City Bell");
        graph.connect(v01,v02,20);
        graph.connect(v01,v04,8);
        graph.connect(v04,v02,12);
        graph.connect(v02,v03,7);
        graph.connect(v03,v04,9);
        graph.connect(v03,v05,-1);
        graph.connect(v03,v06,15);
        graph.connect(v06,v06,9);
        Mapa recorridos = new Mapa(graph);
        List<String> list = recorridos.devolverCamino("Ensenada", "Verónica");
        System.out.println(list);
        List<String> list2 = recorridos.devolverCamino("La Plata", "Punta Indio");
        System.out.println(list2);
        List<String> list3 = recorridos.devolverCamino("Ensenada", "Chequenia");
        System.out.println(list3);
        List<String> list4 = recorridos.devolverCamino("Ensenada", "City Bell");
        System.out.println(list4);
        List<String> list5 = recorridos.devolverCamino("Ensenada", "La Plata");
        System.out.println(list5);
        List<String> list6 = recorridos.devolverCamino("La Plata", "City Bell");
        System.out.println(list6);
        List<String> list7 = recorridos.devolverCamino("PEKF", "City Bell");
        System.out.println(list7);
    }

    private static void initEj03b() {
        Vertex<String> v01;
        Vertex<String> v02;
        Vertex<String> v03;
        Vertex<String> v04;
        Vertex<String> v05;
        Vertex<String> v06;
        Graph<String> graph =  new AdjListGraph<>();
        v01 = graph.createVertex("La Plata");
        v02 = graph.createVertex("Berisso");
        v03 = graph.createVertex("Ensenada");
        v04 = graph.createVertex("Punta Indio");
        v05 = graph.createVertex("Verónica");
        v06 = graph.createVertex("City Bell");
        graph.connect(v01,v02,20);
        graph.connect(v01,v04,8);
        graph.connect(v04,v02,12);
        graph.connect(v02,v03,7);
        graph.connect(v03,v04,9);
        graph.connect(v03,v05,-1);
        graph.connect(v03,v06,15);
        graph.connect(v06,v06,9);
        Mapa recorridos = new Mapa(graph);
        List<String> noPasar = new ArrayList<>(Arrays.asList("Berisso"));
        List<String> list = recorridos.devolverCaminoExceptuando("Ensenada", "Verónica",  noPasar);
        System.out.println(list);
        List<String> list2 = recorridos.devolverCaminoExceptuando("La Plata", "Punta Indio",  noPasar);
        System.out.println(list2);
        List<String> list3 = recorridos.devolverCaminoExceptuando("Ensenada", "Chequenia",  noPasar);
        System.out.println(list3);
        List<String> list4 = recorridos.devolverCaminoExceptuando("Ensenada", "City Bell",  noPasar);
        System.out.println(list4);
        List<String> list5 = recorridos.devolverCaminoExceptuando("Ensenada", "La Plata",  noPasar);
        System.out.println(list5);
        List<String> list6 = recorridos.devolverCaminoExceptuando("La Plata", "City Bell",  noPasar);
        System.out.println(list6);
        List<String> list7 = recorridos.devolverCaminoExceptuando("PEKF", "City Bell",  noPasar);
        System.out.println(list7);

    }

    private static void initEje02() {
        Vertex<Integer> v01;
        Vertex<Integer> v02;
        Vertex<Integer> v03;
        Vertex<Integer> v04;
        Vertex<Integer> v05;
        Vertex<Integer> v06;
        Edge<Integer> e01;
        Edge<Integer> e02;
        Edge<Integer> e03;
        Edge<Integer> e04;
        Edge<Integer> e05;
        Edge<Integer> e06;
        Edge<Integer> e07;
        Edge<Integer> e08;
        Graph<Integer> graph =  new AdjListGraph<>();
        v01 = graph.createVertex(1);
        v02 = graph.createVertex(2);
        v03 = graph.createVertex(3);
        v04 = graph.createVertex(4);
        v05 = graph.createVertex(5);
        v06 = graph.createVertex(6);
        graph.connect(v01,v02,20);
        graph.connect(v01,v04,8);
        graph.connect(v04,v02,12);
        graph.connect(v02,v05,7);
        graph.connect(v05,v04,9);
        graph.connect(v03,v05,-1);
        graph.connect(v03,v06,15);
        graph.connect(v06,v06,9);
        Recorridos recorridos = new Recorridos();
        List<Integer> list = recorridos.dfs(graph);
        System.out.println(list);
    }


}
