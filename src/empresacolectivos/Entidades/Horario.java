package empresacolectivos.Entidades;

import java.time.LocalTime;


public class Horario {
    
    private int id_Horario;
    private Ruta ruta;
    private LocalTime hora_Salida;
    private LocalTime hora_Llegada;
    private boolean estado;

    public Horario() {
    }

    public Horario(int id_Horario, Ruta ruta, LocalTime hora_Salida, LocalTime hora_Llegada, boolean estado) {
        this.id_Horario = id_Horario;
        this.ruta = ruta;
        this.hora_Salida = hora_Salida;
        this.hora_Llegada = hora_Llegada;
        this.estado = estado;
    }

    public Horario(Ruta ruta, LocalTime hora_Salida, LocalTime hora_Llegada, boolean estado) {
        this.ruta = ruta;
        this.hora_Salida = hora_Salida;
        this.hora_Llegada = hora_Llegada;
        this.estado = estado;
    }

    public int getId_Horario() {
        return id_Horario;
    }

    public void setId_Horario(int id_Horario) {
        this.id_Horario = id_Horario;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public LocalTime getHora_Salida() {
        return hora_Salida;
    }

    public void setHora_Salida(LocalTime hora_Salida) {
        this.hora_Salida = hora_Salida;
    }

    public LocalTime getHora_Llegada() {
        return hora_Llegada;
    }

    public void setHora_Llegada(LocalTime hora_Llegada) {
        this.hora_Llegada = hora_Llegada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Horario{" + "id_Horario=" + id_Horario + ", ruta=" + ruta + ", hora_Salida=" + hora_Salida + ", hora_Llegada=" + hora_Llegada + ", estado=" + estado + '}';
    }
    
    
    
    
}
