
package Modelo;


public class Servicio {
    private String entidad,telefono;

    public Servicio(String entidad, String telefono) {
        this.entidad = entidad;
        this.telefono = telefono;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
