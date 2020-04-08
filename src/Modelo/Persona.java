
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona {
    
    private String cedula,nombre,direccion,telefono,genero;
    private Date fechaNa;
    private String tipo;
    private boolean estado;
    
    public Persona(Boolean estado,String tipo,String genero,String cedula, String nombre, String direccion, String telefono, Date fechaNa) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNa = fechaNa;
        this.genero = genero;
        this.tipo=tipo;
        this.estado=estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona() {
        
    }
    public String getGenero(){

        return genero;
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
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    
}
