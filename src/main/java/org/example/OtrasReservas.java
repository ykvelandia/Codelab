package org.example;

import java.util.Scanner;

public class OtrasReservas extends User{
    public OtrasReservas(String nombre, String documento, String numeroContacto, String fechaHoraReserva) {
        super(nombre, documento, numeroContacto, fechaHoraReserva);
    }

    @Override
    public void mostrarDetalles() {

        System.out.println("Que otras reservas le gustaria realizar ❓🤔");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }
}
