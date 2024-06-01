package empresacolectivos.Entidades;


public class Pasajero {
    
    private int id_Pasajero;
    private String nombre;
    private String apellido;
    private String dni;
    private String correo;
    private String telefono;
    private boolean estado;

    public Pasajero() {
    }

    public Pasajero(int id_Pasajero, String nombre, String apellido, String dni, String correo, String telefono, boolean estado) {
        this.id_Pasajero = id_Pasajero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public Pasajero(String nombre, String apellido, String dni, String correo, String telefono, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
    }

    public int getId_Pasajero() {
        return id_Pasajero;
    }

    public void setId_Pasajero(int id_Pasajero) {
        this.id_Pasajero = id_Pasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "id_Pasajero=" + id_Pasajero + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", correo=" + correo + ", telefono=" + telefono + ", estado=" + estado + '}';
    }
    
    
    
}
