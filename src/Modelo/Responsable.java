
package Modelo;

import java.util.ArrayList;


public class Responsable extends Persona {
    private ArrayList<Alumno>hijos;
    public Responsable(){
        
        hijos=new ArrayList();
    }

    public ArrayList<Alumno> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Alumno> hijos) {
        this.hijos = hijos;
    }

    public Responsable(ArrayList<Alumno> hijos) {
        this.hijos = hijos;
    }
    public void agregarHijos(Alumno a){
    hijos.add(a);
    
    }
}
