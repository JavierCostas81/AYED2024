package tp1.ejercicio3;

public class Estudiante {
    private String  nombre,
            apellido,
            email,
            direccion;
    private int comision;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String email, String direccion, int comision) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.comision = comision;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getComision() {
        return comision;
    }
    public void setComision(int comision) {
        this.comision = comision;
    }

    public String tusDatos() {
        return  "Nombre: " + this.getNombre() + "\n" +
                "Apellido: " + this.getApellido() + "\n" +
                "Comision: " + this.getComision() + "\n" +
                "E-mail: " + this.getEmail() + "\n" +
                "Direcci n: " + this.getDireccion() + "\n";
    }
}
