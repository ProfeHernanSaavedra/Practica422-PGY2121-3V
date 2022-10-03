
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public class RedSocial extends PasaTiempos implements ILikes{
    
    protected String nombreRedSocial;

    public RedSocial() {
    }

    public RedSocial(String nombreRedSocial, String usuario, String pass, double tiempoConectado) {
        super(usuario, pass, tiempoConectado);
        this.nombreRedSocial = nombreRedSocial;
    }

    public RedSocial(String nombreRedSocial, double tiempoConectado, int likes) {
        super(tiempoConectado, likes);
        this.nombreRedSocial = nombreRedSocial;
    }

        
    public String getNombreRedSocial() {
        return nombreRedSocial;
    }

    public void setNombreRedSocial(String nombreRedSocial) {
        this.nombreRedSocial = nombreRedSocial;
    }

    @Override
    public String toString() {
        return super.toString() + " RedSocial{" + "nombreRedSocial=" + nombreRedSocial + '}';
    }

    @Override
    public void visualizar(String datos) {
        System.out.println("Usuario: " + this.getUsuario());
        System.out.println("Nombre Red Social : " + this.getNombreRedSocial());
    }

    @Override
    public void likes(int like) {
        System.out.println("Nombre de la clase: " + this.getClass().getSimpleName());
        System.out.println("Cantidad de Likes: " + like);
        System.out.println("Tiempo conectado: " + super.getTiempoConectado());
    }
    
    
    
    
    
}
