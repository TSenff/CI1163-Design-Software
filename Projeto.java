
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Projeto {

    /**
     * Default constructor
     */
    public Projeto(Date dataInicio, Date prazo, String descricao, String contrato) {
        this.dataInicio = dataInicio;
        this.prazo = prazo;
        this.descricao = descricao;
        this.contrato = contrato;
    }

    /**
     * 
     */
    private Date dataInicio;

    /**
     * 
     */
    private Date prazo;

    /**
     * 
     */
    private String descricao;

    /**
     * 
     */
    private String contrato;

    /**
     * 
     */
    private int id;

    /**
     * @param cronograma 
     * @param status 
     * @return
     */
    public Etapa cadastrarEtapa(String cronograma, int status) {
        return null;
    }

    /**
     * @param iF 
     * @return
     */
    public void associarItemFiscal(ItemFiscal iF) {
    }

    /**
     * @param ec  
     * @return
     */
    public void cadastraDesenvolvedor(Desenvolvedor ec ) {
    }

    /**
     * @return
     */
    public void imprimeTela() {
    }

    /**
     * @return
     */
    public Date getDataInicio() {
        return this.dataInicio;
    }

    /**
     * @param value
     */
    public void setDataInicio(Date value) {
        this.dataInicio = value;
    }

    /**
     * @return
     */
    public Date getPrazo() {
        return this.prazo;
    }

    /**
     * @param value
     */
    public void setPrazo(Date value) {
        this.prazo = value;
    }

    /**
     * @return
     */
    public String getDescricao() {
        return this.descricao ;
    }

    /**
     * @param value
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * @return
     */
    public String getContrato() {
        return this.contrato;
    }

    /**
     * @param value
     */
    public void setContrato(String value) {
        this.contrato = value;
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
        this.id = id;
    }

}
