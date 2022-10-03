
package Negocio;

/**
 *
 * @author USRVI-LC2
 */
public abstract class PasaTiempos {
    
    private String usuario,pass;
    private double tiempoConectado;
    private int likes;

    public PasaTiempos() {
    }

    public PasaTiempos(String usuario, String pass, double tiempoConectado) {
        this.usuario = usuario;
        this.pass = pass;
        this.tiempoConectado = tiempoConectado;
        
    }

    public PasaTiempos(double tiempoConectado, int likes) {
        this.tiempoConectado = tiempoConectado;
        this.likes = likes;
    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getTiempoConectado() {
        return tiempoConectado;
    }

    public void setTiempoConectado(double tiempoConectado) {
        this.tiempoConectado = tiempoConectado;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    
    
    @Override
    public String toString() {
        return "PasaTiempos{" + "usuario=" + usuario + ", pass=" + pass + ", tiempoConectado=" + tiempoConectado + '}';
    }
    
    public abstract void visualizar(String datos);
    
}
