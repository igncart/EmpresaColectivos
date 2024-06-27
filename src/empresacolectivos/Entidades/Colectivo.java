package empresacolectivos.Entidades;


public class Colectivo {
    
    private int id_Colectivo;
    private String matricula;
    private String marca;
    private String modelo;
    private int capacidad;
    private boolean estado;

    public Colectivo() {
    }

    public Colectivo(int id_Colectivo, String matricula, String marca, String modelo, int capacidad, boolean estado) {
        this.id_Colectivo = id_Colectivo;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Colectivo(String matricula, String marca, String modelo, int capacidad, boolean estado) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getId_Colectivo() {
        return id_Colectivo;
    }

    public void setId_Colectivo(int id_Colectivo) {
        this.id_Colectivo = id_Colectivo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.id_Colectivo;
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
        final Colectivo other = (Colectivo) obj;
        return this.id_Colectivo == other.id_Colectivo;
    }

    
    
    
    
    
    
    @Override
    public String toString() {
        return "Matrícula: " + matricula +" // "+ marca + " - " + modelo +"";
    }
    
    


}
