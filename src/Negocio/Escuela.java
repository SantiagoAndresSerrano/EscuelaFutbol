
package Negocio;

import Modelo.Alumno;
import Modelo.Empleado;
import Modelo.Partido;
import Modelo.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Escuela {
    public  ArrayList<Persona> per=new ArrayList();
    public  ArrayList<Empleado> empleado=new ArrayList();
    
             private int favor=0,contra=0;
            private  int ganados=0;
           private   int perdidos=0;
            private  int empatados=0;
    
    public void registroPersona(Persona a){
    
       
        if(a==null){
        
            System.out.println("SIN DATOS");
        
        }else{
            
    per.add(a);
    
    
    }
    } 
         public void registroEmpleado(Empleado em){
    
        if(em==null){
        
            System.out.println("SIN DATOS");
        
        }else{
            
    empleado.add(em);
    }
    }
         
         public Boolean buscarResponsable(String cedula){
    
    for (int i = 0; i < per.size(); i++) {
        if(per.get(i).getCedula().equals(cedula)&&(per.get(i).getTipo().equals("Responsable"))){
        
        return true;
        }
    }
return false;

}
         
         public String mostrarDatos(){
             String datos="";
             
             for (int i = 0; i < per.size(); i++) {
                 
                 if(i==0){
                 datos+="**************************************"+"\nPersonas:";
                 }
                 
                 if(per.get(i).isEstado()==true){
                     datos+="\n"+"Estado:Activo"+""+per.get(i).getTipo()+" Nombre"+per.get(i).getNombre();
                 }else{
                 
                     datos+="\n"+"Estado:Retirado"+per.get(i).isEstado()+""+per.get(i).getTipo()+" Nombre"+per.get(i).getNombre();
                 }
             }
             
              for (int i = 0; i < empleado.size(); i++) {
                  
                 if(i==0){datos+="\n**************************************"+"\nEmpleados:";}
                 
                     datos+="\n"+empleado.get(i).getTipo()+" Nombre="+empleado.get(i).getNombre();
                     
                     
                 
             }
              
         return datos;
             
         }
         
         public String partidos(ArrayList<Partido>e){
             
             System.out.println(e.size()+" partidos registrados");
         String marcador="";
         String datos="";
         String []marc=new String[1];
              
              for (int i = 0; i < e.size(); i++) {
                  if(e.get(i).getMarcador()!=null){
                  marcador=e.get(i).getMarcador();
                  marc=marcador.split("-");
                      System.out.println("Goles en contra"+marc[0]);
                    if(Integer.parseInt(marc[0])>Integer.parseInt(marc[1])){
                        System.out.println("Ganado");
                    ganados++;
                    
                    }else if(Integer.parseInt(marc[0])==Integer.parseInt(marc[1])){
                        System.out.println("Empate");
                        empatados++;
                    }else if(Integer.parseInt(marc[0])<Integer.parseInt(marc[1])){
                        System.out.println("Perdido");
                        perdidos++;
                    }
                  }System.out.println("VACIO");
                  
                 
             }
              datos="Partidos ganados"+ganados+"\nPartidos Perdidos "+perdidos+"\nPartidos Empatados "+empatados;
              return datos;
         }
         
         public Boolean retirarEstudiante(String cedula){
         Alumno a=new Alumno();
             for (int i = 0; i < per.size(); i++) {
                 if(per.get(i).getCedula().equals(cedula)&&(per.get(i).getTipo().equals("Alumno"))){
                     
                 a.setCedula(cedula);
                 a.setDireccion(per.get(i).getDireccion());
                 a.setEstadoEstudiante(false);
                 a.setFechaNa(per.get(i).getFechaNa());
                 a.setGenero(per.get(i).getGenero());
                 a.setNombre(per.get(i).getNombre());
                 a.setTelefono(per.get(i).getTelefono());
                 a.setTipo(per.get(i).getTipo());
                 
                 
                 
                     per.add(i,a);
                     JOptionPane.showMessageDialog(null,"Estudiante="+per.get(i).getNombre()+" retirado correctamente");
                    
                 return true;
                 
                 }
             }
         
             
             
             return false;
         }
}
