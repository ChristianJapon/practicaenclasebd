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

/**
 *
 * @author japch
 */
public class ControladorCliente {
        public boolean insertar(Cliente cliente){
            Connection  con = ControladorBD.conectar();
            
            try{
                String sql = "INSERT INTO CLIENTE1(codigo, cedula, nombre, apellido, "
                        +"direccion, numero, fecha_nac) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement ps= con.prepareStatement(sql);
                ps.setInt(1, cliente.getId());
                ps.setString(2, cliente.getCedula());
                ps.setString(3, cliente.getNombre());
                ps.setString(4, cliente.getApellido());
                ps.setString(5, cliente.getDireccion());
                ps.setString(6, cliente.getNumero());
                ps.setString(7, cliente.getFecchan());
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
