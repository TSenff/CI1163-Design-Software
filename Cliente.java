
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Cliente {

    /**
     * Default constructor
     */
    public Cliente(String nome, String email, long cpfCnpj, String telefone, String contato) {
        this.nome = nome;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.telefone = telefone;     
        this.contato = contato;
    }

    /**
     *
     */
    private String nome;

    /**
     *
     */
    private String email;

    /**
     *
     */
    private long cpfCnpj;

    /**
     *
     */
    private String telefone;

    /**
     *
     */
    private String contato;

    /**
     * @return
     */
    public String getNome() {
        return this.nome; 
    }

    /**
     * @param value
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param value
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * @return
     */
    public long getCpfCnpj() {
        return this.cpfCnpj;
    }

    /**
     * @param value
     */
    public void setCpfCnpj(long value) {
        this.cpfCnpj = value;
    }

    /**
     * @return
     */
    public String getTelefone() {
        return this.telefone;
    }

    /**
     * @param value
     */
    public void setTelefone(String value) {
        this.telefone = value;
    }

    /**
     * @return
     */
    public String getContato() {
        return this.contato;
    }

    /**
     * @param value
     */
    public void setContato(String value) {
        this.contato = value;
    }

}
