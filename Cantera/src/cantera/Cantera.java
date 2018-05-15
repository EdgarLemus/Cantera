/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantera;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author LENOVO
 */
public class Cantera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operaciones operaciones = new Operaciones();
        String fecha = "1996";
        int cedula = 1040752687;
        boolean validez = operaciones.reservarVuelos(cedula,fecha,22);
        
        if(validez == true)
        {
            System.out.println("Reserva Exitosa");
        }else
        {
            System.out.print("¡Error!");
        }
        // TODO code application logic here

        /*
        Consultar consultar = new Consultar();
        consultar.llenarArray();
        System.out.println(consultar.vuelos.get(0).getAño());
*/
        
    }

}
