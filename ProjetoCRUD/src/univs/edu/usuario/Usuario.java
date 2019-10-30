package univs.edu.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Usuario {
    
    @Id 
    @GeneratedValue
    private int idUsuario;
    
    @Column(length = 20, nullable = false)
    private String login;
    
    @Column(length = 20, nullable = false)
    private String senha;

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the loguin
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param loguin the loguin to set
     */
    public void setLogin(String loguin) {
        this.login = loguin;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
