
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Atividade {

    /**
     * Default constructor
     */
    public Atividade(String nome, int duracao, String local, String objetivo, String resumo, int id) {
        this.nome = nome;
        this.duracao = duracao;
        this.local = local;
        this.objetivo = objetivo;
        this.resumo = resumo;
        this.id = id;
    }

    /**
     * 
     */
    private String nome;

    /**
     * 
     */
    private int duracao;

    /**
     * 
     */
    private String local;

    /**
     * 
     */
    private String objetivo;

    /**
     * 
     */
    private String resumo;

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
    public int getDuracao() {
        return this.duracao;
    }

    /**
     * @param value
     */
    public void setDuracao(int value) {
        this.duracao = value;
    }

    /**
     * @return
     */
    public String getLocal() {
        return this.local;
    }

    /**
     * @param value
     */
    public void setLocal(String value) {
        this.local = value;
    }

    /**
     * @return
     */
    public String getObjetivo() {
        return this.objetivo;
    }

    /**
     * @param value
     */
    public void setObjetivo(String value) {
        this.objetivo = value;
    }

    /**
     * @return
     */
    public String getResumo() {
        return this.resumo;
    }

    /**
     * @param value
     */
    public void setResumo(String value) {
        this.resumo = value;
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
