package persona;

import java.util.Objects;
import reloj.Reloj;

public class Persona {
    
    private String nombre;
    private Integer edad;
    private Double peso;
    private Double estatura;    
    private final Reloj reloj;
    
    public Persona(String nombre, Integer edad, Double peso, Double estatura, Reloj reloj) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.reloj = new Reloj("Casio", 9998760001L);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", estatura=" + estatura + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.edad);
        hash = 67 * hash + Objects.hashCode(this.peso);
        hash = 67 * hash + Objects.hashCode(this.estatura);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        return Objects.equals(this.estatura, other.estatura);
    }
    
    public void decirHora() {
        System.out.println("la hora es: " + reloj.getHora());
    }
    
}
