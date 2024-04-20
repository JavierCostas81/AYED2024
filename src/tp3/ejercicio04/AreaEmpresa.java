package tp3.ejercicio04;
        /*AreaEmpresa es una clase que representa a un área de la empresa mencionada y que contiene
        la identificación de la misma representada con un String y una tardanza de transmisión de mensajes
        interna representada con int.*/
public class AreaEmpresa {
    private String nombre;
    private int tardanzaTransmision;

            public AreaEmpresa() {
            }

            public AreaEmpresa(String nombre, int tardanzaTransmision) {
                this.nombre = nombre;
                this.tardanzaTransmision = tardanzaTransmision;
            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public int getTardanzaTransmision() {
                return tardanzaTransmision;
            }

            public void setTardanzaTransmision(int tardanzaTransmision) {
                this.tardanzaTransmision = tardanzaTransmision;
            }

            @Override
            public String toString() {
                return "Empresa: " + this.nombre + "\nTardandza: " + this.tardanzaTransmision;
            }
        }
