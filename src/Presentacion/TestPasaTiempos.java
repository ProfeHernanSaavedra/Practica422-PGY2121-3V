
package Presentacion;

import Datos.Coleccion;
import Negocio.*;

/**
 *
 * @author USRVI-LC2
 */
public class TestPasaTiempos {
    
    public static void main(String[] args) {
        
        Coleccion lista = new Coleccion();
        Musica musiquita = new Musica("POP", 120, 5);
        musiquita.likes(5);
        RedSocial rs = new RedSocial("Instragram", 240,10);
        Netflix peli = new Netflix("Suspenso",300,7);
        
        lista.agregarPasaTiempo(musiquita);
        lista.agregarPasaTiempo(rs);
        lista.agregarPasaTiempo(peli);
        
        lista.verPasatiempos();
        System.out.println("**************");
        lista.masLikes();
        lista.masDuracion();
        
        
        
    }
    
}
