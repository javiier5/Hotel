public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Java");

        Planta planta1 = new Planta(1);
        planta1.agregarHabitacion(new Habitacion(100, "Recepción"));
        planta1.agregarHabitacion(new Habitacion(101, "Cocina"));
        planta1.agregarHabitacion(new Habitacion(102, "Comedor"));
        planta1.agregarHabitacion(new Habitacion(103, "Individual"));
        planta1.agregarHabitacion(new Habitacion(104, "Doble"));
        
        Planta planta2 = new Planta(2);
        planta2.agregarHabitacion(new Habitacion(201, "Suite"));
        planta2.agregarHabitacion(new Habitacion(202, "Doble"));
        planta2.agregarHabitacion(new Habitacion(203, "Individual"));

        Planta planta3 = new Planta(3);
        planta3.agregarHabitacion(new Habitacion(301, "Suite"));
        planta3.agregarHabitacion(new Habitacion(302, "Doble"));
        planta3.agregarHabitacion(new Habitacion(303, "Gimnasio"));
        
        hotel.agregarPlanta(planta1);
        hotel.agregarPlanta(planta2);
        hotel.agregarPlanta(planta3);
        
        System.out.println(hotel);
    }
}
