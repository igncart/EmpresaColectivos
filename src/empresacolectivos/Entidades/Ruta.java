package empresacolectivos.Entidades;

import java.time.LocalTime;


public class Ruta {
    
    private int id_Ruta;
    private String origen;
    private String destino;
    private LocalTime duracion_Estimada;
    private boolean estado;

    public Ruta() {
    }

    public Ruta(int id_Ruta, String origen, String destino, LocalTime duracion_Estimada, boolean estado) {
        this.id_Ruta = id_Ruta;
        this.origen = origen;
        this.destino = destino;
        this.duracion_Estimada = duracion_Estimada;
        this.estado = estado;
    }

    public Ruta(String origen, String destino, LocalTime duracion_Estimada, boolean estado) {
        this.origen = origen;
        this.destino = destino;
        this.duracion_Estimada = duracion_Estimada;
        this.estado = estado;
    }

    public int getId_Ruta() {
        return id_Ruta;
    }

    public void setId_Ruta(int id_Ruta) {
        this.id_Ruta = id_Ruta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalTime getDuracion_Estimada() {
        return duracion_Estimada;
    }

    public void setDuracion_Estimada(LocalTime duracion_Estimada) {
        this.duracion_Estimada = duracion_Estimada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.id_Ruta;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ruta other = (Ruta) obj;
        return this.id_Ruta == other.id_Ruta;
    }

    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return origen + " - " + destino;
    }
    
    
    
}
