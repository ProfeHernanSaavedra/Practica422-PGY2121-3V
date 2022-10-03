
package Datos;

import Negocio.PasaTiempos;
import java.util.ArrayList;

/**
 *
 * @author USRVI-LC2
 */
public class Coleccion {
    
    private ArrayList<PasaTiempos> listaPasaTiempos;
    
    public Coleccion() {
        
        listaPasaTiempos = new ArrayList<>();
    }
    
    public void agregarPasaTiempo(PasaTiempos pt)
    {
        listaPasaTiempos.add(pt);
    }
    
    public void verPasatiempos()
    {
        for (PasaTiempos pasaTiempo : listaPasaTiempos) {
            System.out.println("Clase: " + pasaTiempo.getClass().getSimpleName());
            System.out.println("Tiempo Conectado: " + pasaTiempo.getTiempoConectado());
            System.out.println("Likes: "+pasaTiempo.getLikes());
        }
    }
    
    
    public void masLikes()
    {
        int max = 0;
        String clase ="";
        for (PasaTiempos pasaTiempo : listaPasaTiempos) {
            
            if (pasaTiempo.getLikes() > max) {
                max = pasaTiempo.getLikes();
                clase =  pasaTiempo.getClass().getSimpleName();
            }
            
        }
        System.out.println("Clase con mas Likes es: " + clase);
    }
    
    public void masDuracion()
    {
        double max = 0;
        String clase ="";
        for (PasaTiempos pasaTiempo : listaPasaTiempos) {
            
            if (pasaTiempo.getTiempoConectado() > max) {
                max = pasaTiempo.getTiempoConectado();
                clase =  pasaTiempo.getClass().getSimpleName();
            }
            
        }
        System.out.println("Clase con mas Tiempo conectado es: " + clase);
    }
    
    
    
    
    
    
    
    
}
