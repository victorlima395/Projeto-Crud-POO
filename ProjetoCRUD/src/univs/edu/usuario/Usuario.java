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
    private String loguin;
    
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
    public String getLoguin() {
        return loguin;
    }

    /**
     * @param loguin the loguin to set
     */
    public void setLoguin(String loguin) {
        this.loguin = loguin;
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
