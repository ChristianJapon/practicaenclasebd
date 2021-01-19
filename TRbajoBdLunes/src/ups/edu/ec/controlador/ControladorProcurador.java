/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import ups.edu.ec.modelo.Cliente;
import ups.edu.ec.controlador.ControladorBD;
import ups.edu.ec.modelo.Procurador;

/**
 *
 * @author japch
 */
public class ControladorProcurador {
        public boolean insertar(Procurador procurador){
            Connection  con = ControladorBD.conectar();
            
            try{
                String sql = "INSERT INTO PROCURADOR(codigo, cedula, nombre, apellido, "
                        +"direccion, numero,salario, fecha_nac) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setInt(1, procurador.getId());
                ps.setString(2, procurador.getCedula());
                ps.setString(3, procurador.getNombre());
                ps.setString(4, procurador.getApellido());
                ps.setString(5, procurador.getDireccion());
                ps.setString(6, procurador.getNumero());
                ps.setDouble(7, procurador.getSueldo());
                ps.setString(8, procurador.getFecchan());
                ps.executeUpdate();
                
            }catch(Exception e){
                e.printStackTrace();
                return false;
            } finally{
             
                ControladorBD.desconectar(con);
               
            }
            
        return true;
    }
        
  
}
