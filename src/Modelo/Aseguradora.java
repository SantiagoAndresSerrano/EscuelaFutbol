/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Aseguradora {
    private String nit,razonSoci,telefono,direccion;

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getRazonSoci() {
        return razonSoci;
    }

    public void setRazonSoci(String razonSoci) {
        this.razonSoci = razonSoci;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Aseguradora(String nit, String razonSoci, String telefono, String direccion) {
        this.nit = nit;
        this.razonSoci = razonSoci;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
}
