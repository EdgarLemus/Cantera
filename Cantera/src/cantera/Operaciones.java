/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantera;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Operaciones {

    Reservas reserva = new Reservas();
    Consultar consultar = new Consultar();
    int id = 1040752687;
    int idVuelo = 85;

    ArrayList<Reservas> listReserva = new ArrayList<Reservas>();

    public boolean reservarVuelos(int cedulaIngresada, String fechaEdad, int idVuelo) {

        String fechaActual = fechaActual();

        int fechaValida = Integer.valueOf(fechaActual) - Integer.valueOf(fechaEdad);

        boolean validar = false;

        if (fechaValida >= 18) {
            if (cedulaIngresada == id) {
                for (int i = 0; i < consultar.vuelos.size(); i++) {
                    if (consultar.vuelos.get(i).getId() == idVuelo) {
                        reserva.setCedulaUsurio(cedulaIngresada);
                        reserva.setIdVuelo(idVuelo);
                        reserva.setPago(consultar.vuelos.get(i).getPrecio());
                        listReserva.add(reserva);
                        validar = true;
                    }

                }

            } else {
                System.out.println("¡Error en la Reserva! Eres menor de Edad");
            }

        }

        return validar;
    }

    public String fechaActual() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date date = new Date();
        String fecha = dateFormat.format(date);
        return fecha;
    }
}
