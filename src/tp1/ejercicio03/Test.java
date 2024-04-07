package tp1.ejercicio03;

public class Test {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Javier", "Costas", "fc@gmail.com", "Calle 7 y 50", 1);
        Estudiante e2 = new Estudiante();
        Profesor p1 = new Profesor();
        Profesor p2 = new Profesor("Raul", "Lopez", "rl@info.unlp.edu.ar", "Seminario de PHP", "Inform tica");
        Profesor p3 = new Profesor("German", "Ruiz", "gr@info.unlp.edu.ar", "Algoritmos y Estructuras de Datos", "Inform tica");
        e2.setNombre("Unnombre");
        e2.setApellido("Unapellido");
        e2.setEmail("unEmail@gmail.com");
        e2.setComision(2);
        e2.setDireccion("Calle Falsa 123");
        p1.setNombre("Profe");
        p1.setApellido("Perez");
        p1.setEmail("ProfePerez@unlp.edu.ar");
        p1.setCatedra("An lisis Matem tico 2");
        p1.setFacultad("Ingenier a");
        Estudiante[] estudiantes = {e1,e2};
        Profesor[] profesores = {p1,p2,p3};


        for (Profesor profesor : profesores) {
            System.out.println(profesor.tusDatos());
        }
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.tusDatos());
        }

    }


}
