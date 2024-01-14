package org.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ReservaHotel reservaHotel = new ReservaHotel("Yeni","1020506","312222222","22-02-2024 2:00","Sencilla");
        reservaHotel.mostrarDetalles();
        System.out.println();

        ReservaCitaMedica reservaCitaMedica = new ReservaCitaMedica("Karina","105023","3535360","25/feb/2024 5:00pm","Nutricionista");
        reservaCitaMedica.mostrarDetalles();
        System.out.println();

        OtrasReservas otrasReservas = new OtrasReservas("Pedro","12345","3535360","Por definir");
        otrasReservas.mostrarDetalles();
    }
}