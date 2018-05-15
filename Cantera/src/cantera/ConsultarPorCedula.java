/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantera;

/**
 *
 * @author LENOVO
 */
public class ConsultarPorCedula {
    int cedula=1066737209;
    Operaciones op = new Operaciones();
    
 public boolean Consultar_Reservas_Por_Cedula(int ced){
     
    
     boolean con=false;  
    if(cedula==ced){
        con= true;
    }
    return con;
}
}
