/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alumno extends Persona{
    private Boolean estadoEstudiante;

    public Boolean getEstadoEstudiante() {
        return estadoEstudiante;
    }

    public void setEstadoEstudiante(Boolean estadoEstudiante) {
        this.estadoEstudiante = estadoEstudiante;
    }
    
    public Integer calcularEdad(){
    Date fechaActual=new Date();   
    
    
    
    Integer edad=0;
    
    
    edad= Math.abs(getFechaNa().getYear()-fechaActual.getYear());
    
    return edad;
    
    }
    
    
    public String calcularCategoria(){
    int edadEs=calcularEdad();
       String categoria="";
    
    if(edadEs>=5&&edadEs<=9){
    categoria="INFANTIL"; //10 14 15 18
        
    }
    if(edadEs>=10&&edadEs<=14){
    
    categoria="JUVENIL";
    }
    
    if(edadEs>=15&&edadEs<=18){
    
    categoria="MAYOR";
    }
    
    if(categoria.equals("")){
    
    return "No se encuentra en ninguno de los rangos permitidos para estudiar";
    }
    return categoria;
    }
    
}
