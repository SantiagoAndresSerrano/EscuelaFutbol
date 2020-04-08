/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;



/**
 *
 * @author santi
 */
public class Matricula {
    
    private Double valor, pension;
public Matricula(){}
    public Matricula(Double valor, Double pension) {
        this.valor = valor;
        this.pension = pension;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getPension() {
        return pension;
    }

    public void setPension(Double pension) {
        this.pension = pension;
    }
    
    
    
}
