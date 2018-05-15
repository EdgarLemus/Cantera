/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantera;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Consultar {

    ArrayList<Vuelo> vuelos = new ArrayList<>();
    Vuelo vuelo = new Vuelo();

    public void consultaVuelo(String año, String mes, String dia) {
        llenarArray();

        for (int i = 0; i < vuelos.size(); i++) {

            if (año.equals(vuelos.get(i).getAño()) && mes.equals(vuelos.get(i).getMes()) && dia.equals(vuelos.get(i).getDia())) {

                System.out.println(vuelos.get(i).getOrigen());
                System.out.println(vuelos.get(i).getDestino());
                System.out.println(vuelos.get(i).getAño());
                System.out.println(vuelos.get(i).getMes());
                System.out.println(vuelos.get(i).getDia());
                System.out.println(vuelos.get(i).getHora());
                System.out.println("");

            }
        }

    }

    public void llenarArray() {
        vuelo.setId(44);
        vuelo.setOrigen("Bogota");
        vuelo.setDestino("Madrid");
        vuelo.setAño("2018");
        vuelo.setMes("06");
        vuelo.setDia("11");
        vuelo.setHora("09:00");
        vuelo.setPrecio(230000);
        vuelos.add(vuelo);

        vuelo.setId(55);
        vuelo.setOrigen("Bogota");
        vuelo.setDestino("Madrid");
        vuelo.setAño("2018");
        vuelo.setMes("06");
        vuelo.setDia("11");
        vuelo.setHora("10:00");
        vuelo.setPrecio(270000);
        vuelos.add(vuelo);
    }
}
