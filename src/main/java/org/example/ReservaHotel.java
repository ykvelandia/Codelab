package org.example;

public class ReservaHotel extends User{
    private String tipoHabitacion;


    public ReservaHotel(String nombre, String documento, String numeroContacto, String fechaHoraReserva, String tipoHabitacion) {
        super(nombre, documento, numeroContacto, fechaHoraReserva);
        this.tipoHabitacion = tipoHabitacion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Reserva de Hotel 🏨🛏");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Documento: "+getDocumento());
        System.out.println("Número de contacto : "+getNumeroContacto());
        System.out.println("Fecha y de hora reserva : "+getFechaHoraReserva());
        System.out.println("Tipo de habitación : "+tipoHabitacion);

    }
}
