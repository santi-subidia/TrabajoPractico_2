package reloj;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Reloj {
    private LocalDate dia;
    private LocalTime hora;
    private String modelo;
    private Long numSerie;

    
    public Reloj(String modelo, Long numSerie) {
        this.dia = LocalDate.now();
        this.hora = LocalTime.now();
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public LocalDate getDia() {
        return dia;
    }

    public LocalTime getHora() {
        return hora.withNano(0).withSecond(0);
    }
    
    public void incrementarDia(){
        dia = dia.plusDays(1);
    }
    
    public void incrementarHora(){
        hora = hora.plusHours(1);
    }
    
    public void limpiarPantalla(){
        dia = LocalDate.of(2000, Month.JANUARY, 1);
        hora = LocalTime.of(00, 00);
    }
    
    public void traducirFrecuencia(){       
        System.out.println("frecuencia: ---");
    }
    
}
