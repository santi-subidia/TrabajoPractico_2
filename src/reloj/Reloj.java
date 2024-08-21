/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reloj;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author santi
 */
public class Reloj {
    LocalDate dia;
    LocalTime hora;
    String modelo;
    Long numSerie;

    
    public Reloj(LocalDate dia, LocalTime hora, String modelo, Long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public LocalDate getDia() {
        return dia;
    }

    public LocalTime getHora() {
        return hora;
    }
    
    public void incrementarDia(){
        dia.plusDays(1);
    }
    
    public void incrementarHora(){
        hora.plusHours(1);
    }
    
    public void limpiarPantalla(){
        dia.atTime(0,0);
        //No pude setear a 0
        hora=null;
        
    }
    
    public void traducirFrecuencia(){
    }
}
