import java.util.ArrayList;
import java.util.List;

class Habitacion {
    private int numero;
    private String tipo;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Habitacion " + numero + " - Tipo: " + tipo;
    }
}

class Planta {
    private int numero;
    private List<Habitacion> habitaciones;

    public Planta(int numero) {
        this.numero = numero;
        this.habitaciones = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public String toString() {
        return "Planta " + numero + " con habitaciones: " + habitaciones;
    }
}

class Hotel {
    private String nombre;
    private List<Planta> plantas;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.plantas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Planta> getPlantas() {
        return plantas;
    }

    public void agregarPlanta(Planta planta) {
        plantas.add(planta);
    }


    public String toString() {
        return "Hotel: " + nombre + " con plantas: " + plantas;
    }
}