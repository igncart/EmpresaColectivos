package empresacolectivos.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;


public class Pasaje {
    
    private int id_Pasaje;
    private Pasajero pasajero;
    private Colectivo colectivo;
    private Ruta ruta;
    private LocalDate fecha_Viaje;
    private LocalTime hora_Viaje;
    private int asiento;
    private double precio;

    public Pasaje() {
    }

    public Pasaje(int id_Pasaje, Pasajero pasajero, Colectivo colectivo, Ruta ruta, LocalDate fecha_Viaje, LocalTime hora_Viaje, int asiento, double precio) {
        this.id_Pasaje = id_Pasaje;
        this.pasajero = pasajero;
        this.colectivo = colectivo;
        this.ruta = ruta;
        this.fecha_Viaje = fecha_Viaje;
        this.hora_Viaje = hora_Viaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public Pasaje(Pasajero pasajero, Colectivo colectivo, Ruta ruta, LocalDate fecha_Viaje, LocalTime hora_Viaje, int asiento, double precio) {
        this.pasajero = pasajero;
        this.colectivo = colectivo;
        this.ruta = ruta;
        this.fecha_Viaje = fecha_Viaje;
        this.hora_Viaje = hora_Viaje;
        this.asiento = asiento;
        this.precio = precio;
    }

    public int getId_Pasaje() {
        return id_Pasaje;
    }

    public void setId_Pasaje(int id_Pasaje) {
        this.id_Pasaje = id_Pasaje;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Colectivo getColectivo() {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo) {
        this.colectivo = colectivo;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public LocalDate getFecha_Viaje() {
        return fecha_Viaje;
    }

    public void setFecha_Viaje(LocalDate fecha_Viaje) {
        this.fecha_Viaje = fecha_Viaje;
    }

    public LocalTime getHora_Viaje() {
        return hora_Viaje;
    }

    public void setHora_Viaje(LocalTime hora_Viaje) {
        this.hora_Viaje = hora_Viaje;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pasaje{" + "id_Pasaje=" + id_Pasaje + ", pasajero=" + pasajero + ", colectivo=" + colectivo + ", ruta=" + ruta + ", fecha_Viaje=" + fecha_Viaje + ", hora_Viaje=" + hora_Viaje + ", asiento=" + asiento + ", precio=" + precio + '}';
    }
    
    
            
    
}
