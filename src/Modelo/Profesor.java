/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Profesor extends Empleado {
    private String especialidad;
    
    public Profesor(){}
    public Profesor(String especialidad){
        this.especialidad=especialidad;
    }
    
    
    public void setEspecialidad(String especialidad){
    this.especialidad=especialidad;
    }
    
    public String getEspecialidad(){
    return especialidad;
    }
}
