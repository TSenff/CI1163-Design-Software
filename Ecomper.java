
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Ecomper implements Desenvolvedor, Participante {

    /**
     * Default constructor
     */
    public Ecomper(String nome, long cpf, String email, String cargo, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.id = id;
    }

    /**
     * 
     */
    private String nome;

    /**
     * 
     */
    private long cpf;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String cargo;

    /**
     * 
     */
    private int id;

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
    public long getCpf() {
        return this.cpf;
    }

    /**
     * @param value
     */
    public void setCpf(long value) {
        this.cpf = value;
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
    public String getCargo() {
        return this.cargo;
    }

    /**
     * @param value
     */
    public void setCargo(String value) {
        this.cargo = value;
    }

    /**
     * @return
     */
    public int getId() {
        return this.id;
    }

    /**
     * @param value
     */
    public void setId(int value) {
        this.id = value;
    }

}
