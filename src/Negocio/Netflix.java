
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Netflix extends PasaTiempos implements ILikes{
    
    protected String genero;

    public Netflix() {
    }

    public Netflix(String genero, String usuario, String pass, double tiempoConectado) {
        super(usuario, pass, tiempoConectado);
        this.genero = genero;
    }

    public Netflix(String genero, double tiempoConectado, int likes) {
        super(tiempoConectado, likes);
        this.genero = genero;
    }
    
    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() + " Netflix{" + "genero=" + genero + '}';
    }

    @Override
    public void visualizar(String datos) {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Género Película: " + this.getGenero());
    }

    @Override
    public void likes(int like) {
        System.out.println("Nombre de la clase: " + this.getClass().getSimpleName());
        System.out.println("Cantidad de Likes: " + like);
        System.out.println("Tiempo conectado: " + super.getTiempoConectado());
    }
    
    
    
    
    
    
    
}
