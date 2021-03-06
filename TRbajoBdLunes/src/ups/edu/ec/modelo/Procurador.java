/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.modelo;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author japch
 */
public class Procurador {
    private int id;
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String numero;
    private double sueldo;
    private String fecchan;

    public Procurador(int id, String cedula, String nombre, String apellido, String direccion, String numero, double sueldo, String fecchan) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.numero = numero;
        this.sueldo = sueldo;
        this.fecchan = fecchan;
    }

   
   
    public Procurador(){
        this.id =-1;
        this.cedula = "";
        this.nombre = "";
        this.apellido = "";
        this.direccion="";
        this.numero = "";
        this.fecchan = "";
        this.sueldo =0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getFecchan() {
        return fecchan;
    }

    public void setFecchan(String fecchan) {
        this.fecchan = fecchan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Procurador other = (Procurador) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.fecchan, other.fecchan)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Procurador{" + "id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", numero=" + numero + ", sueldo=" + sueldo + ", fecchan=" + fecchan + '}';
    }

    
}
