/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author santi
 */
public class Campeonato {
   private String numeroC;
   private Date fecha;
   private String horaI,horaF,lugar;

    public Campeonato(String numeroC, Date fecha, String horaI, String horaF, String lugar) {
        this.numeroC = numeroC;
        this.fecha = fecha;
        this.horaI = horaI;
        this.horaF = horaF;
        this.lugar = lugar;
    }

    public String getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHoraI() {
        return horaI;
    }

    public void setHoraI(String horaI) {
        this.horaI = horaI;
    }

    public String getHoraF() {
        return horaF;
    }

    public void setHoraF(String horaF) {
        this.horaF = horaF;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
   
   
}
