/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reloj;

/**
 *
 * @author santi
 */
public class Reloj {
    String dia;
    String hora;
    String modelo;
    long numSerie;

    public Reloj(String dia, String hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }
    
    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }
}
