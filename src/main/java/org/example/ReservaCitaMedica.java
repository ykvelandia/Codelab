package org.example;

public class ReservaCitaMedica extends User{
    private String especialidad;

    public ReservaCitaMedica(String nombre, String documento, String numeroContacto, String fechaHoraReserva,String especialidad) {
        super(nombre, documento, numeroContacto, fechaHoraReserva);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Reserva para citas médicas 🏥🩺");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Documento: "+getDocumento());
        System.out.println("Número de contacto : "+getNumeroContacto());
        System.out.println("Fecha y de hora reserva : "+getFechaHoraReserva());
        System.out.println("Especialidad : "+especialidad);

    }
}
