package persona;

import java.util.Random;
import reloj.Reloj;

public class RelojFit extends Reloj {
      
    private int pasos;

    public RelojFit(int pasos, String modelo, Long numSerie) {
        super(modelo, numSerie);
        this.pasos = pasos;
    }
  
    public void cuentaPasos(int x, int y) {
     // los pasos se suman de 1 en 1
        this.pasos += Math.abs(x) + Math.abs(y);
    }  
    
    public void frecuenciaAleatoria() {
        Random random = new Random();
        int frecuencia = 60 + random.nextInt(101); // Genera una frecuencia entre 60 y 160
        
        System.out.println("Frecuencia aleatoria: " + frecuencia + " bpm");
    }
}
