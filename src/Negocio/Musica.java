package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class Musica extends PasaTiempos implements ILikes{
    
    protected String tipoMusica;

    public Musica() {
    }

    public Musica(String tipoMusica, String usuario, String pass, double tiempoConectado) {
        super(usuario, pass, tiempoConectado);
        this.tipoMusica = tipoMusica;
    }

    public Musica(String tipoMusica, double tiempoConectado, int likes) {
        super(tiempoConectado, likes);
        this.tipoMusica = tipoMusica;
    }
    
    

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public String toString() {
        return super.toString() + " Musica{" + "tipoMusica=" + tipoMusica + '}';
    }

    @Override
    public void visualizar(String datos) {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("El tipo de musica es: " + this.getTipoMusica());
    }

    @Override
    public void likes(int like) {
        System.out.println("Nombre de la clase: " + this.getClass().getSimpleName());
        System.out.println("Cantidad de Likes: " + like);
        System.out.println("Tiempo conectado: " + super.getTiempoConectado());
    }
    
    
    
    
    
    
}
