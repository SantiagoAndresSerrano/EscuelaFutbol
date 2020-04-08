
package Modelo;

import java.util.Date;


public class Empleado {
    private Double sueldo;
    private String cedula,nombre,direccion,telefono,genero;
    private Date fechaNa;
    private String tipo;
    public Empleado(String tipo,Double sueldo,String genero,String cedula, String nombre, String direccion, String telefono, Date fechaNa) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNa = fechaNa;
        this.genero = genero;
        this.sueldo=sueldo;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Empleado() {
        
    }
    
    public Double getSueldo(){
    return sueldo;
    }
    
    public void setSueldo(Double sueldo){
    this.sueldo=sueldo;
    }
    
    public String getGenero(){

        return genero;
}

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNa() {
        return fechaNa;
    }

    public void setFechaNa(Date fechaNa) {
        this.fechaNa = fechaNa;
    }
    
}
