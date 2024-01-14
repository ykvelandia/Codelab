package org.example;

public abstract class User implements Reserva{
    private String nombre;
    private String documento;
    private String numeroContacto;
    private  String fechaHoraReserva;

    public User(String nombre, String documento, String numeroContacto, String fechaHoraReserva) {
        this.nombre = nombre;
        this.documento = documento;
        this.numeroContacto = numeroContacto;
        this.fechaHoraReserva = fechaHoraReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNumeroContacto() {
        return numeroContacto;
    }

    public String getFechaHoraReserva() {
        return fechaHoraReserva;
    }
}
