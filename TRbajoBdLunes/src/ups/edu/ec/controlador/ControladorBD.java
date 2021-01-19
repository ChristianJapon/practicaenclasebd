/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.naming.spi.DirStateFactory;
import ups.edu.ec.modelo.Cliente;

/**
 *
 * @author japch
 */
public class ControladorBD {
    
    public static Connection conectar(){
        Connection con= null;
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bdpractclase","postgres","abc123");
        }catch( Exception e){
            System.err.println("Ocurrio un error "+e.getMessage());
            }
        System.out.println("la conexion se dio con exito");
        return con;
        }
    
    public static void desconectar(Connection con){
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static ResultSet getTabla(String Consulta){
        
        Connection cn = conectar();
        Statement st;
        ResultSet datos= null;
               
        try {
            st=cn.createStatement();
            datos=st.executeQuery(Consulta);
        } catch (Exception e) {
            
        }
     return datos;
     }
}
