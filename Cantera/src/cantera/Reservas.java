/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantera;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  
 * @author LENOVO
 */
public class Reservas {
       private int cedulaUsurio;
       private int idVuelo;
       private double pago;

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public int getCedulaUsurio() {
        return cedulaUsurio;
    }

    public void setCedulaUsurio(int cedulaUsurio) {
        this.cedulaUsurio = cedulaUsurio;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }
    
}
