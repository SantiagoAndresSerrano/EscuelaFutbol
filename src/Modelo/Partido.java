
package Modelo;

public class Partido {
    
    
    private String marcador;
    private String nombreArbitro;
    private String horaPartido;
    private Double valorArbritaje;

    public Partido() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public String getNombreArbitro() {
        return nombreArbitro;
    }

    public void setNombreArbitro(String nombreArbitro) {
        this.nombreArbitro = nombreArbitro;
    }

    public String getHoraPartido() {
        return horaPartido;
    }

    public void setHoraPartido(String horaPartido) {
        this.horaPartido = horaPartido;
    }

    public Double getValorArbritaje() {
        return valorArbritaje;
    }

    public void setValorArbritaje(Double valorArbritaje) {
        this.valorArbritaje = valorArbritaje;
    }

    public Partido(String marcador, String nombreArbitro, String horaPartido, Double valorArbritaje) {
        this.marcador = marcador;
        this.nombreArbitro = nombreArbitro;
        this.horaPartido = horaPartido;
        this.valorArbritaje = valorArbritaje;
    }
}
