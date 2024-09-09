package persona;

import reloj.Reloj;

public class ClaseMain {
    
    public static void main(String[] args) {
        
        Reloj casio = new Reloj("Casio", 123999123L);
        Persona juan = new Persona("Juan", 23, 78., 1.80, casio);

        juan.decirHora();
        
    }
    
}
