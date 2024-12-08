
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Ecomp {

    /**
     * Default constructor
     */
    public Ecomp() {
    }

    /**
     * @return
     */
    public void iniciarCadastrarProjeto() {
    }

    /**
     * @return
     */
    public void iniciarUploadContrato() {
    }

    /**
     * @param nomeArq 
     * @param caminhoArq 
     * @return
     */
    public String uploadContrato(String nomeArq, String caminhoArq) {
        return "";
    }

    public void iniciarCadastrarAtividade() {

    }

    /**
     * @param cliente 
     * @param diaInicio 
     * @param prazo 
     * @param descricao 
     * @param contrato 
     * @return
     */
    public Projeto cadastrarProjeto(Cliente cliente, Date diaInicio, Date prazo, String descricao, String contrato) {
        return null;
    }

    /**
     * @return
     */
    public void iniciarCadastroEtapaProjeto() {
    }

    /**
     * @param cronograma 
     * @param status 
     * @param idProjeto 
     * @return
     */
    public void cadastrarEtapaProjeto(String cronograma, int status, int idProjeto) {
    }

    /**
     * @return
     */
    public void fimEtapaProjeto() {
    }

    /**
     * @return
     */
    public void iniciarGerarRelatorio() {
    }

    /**
     * @param tipo 
     * @param dataFiltragem 
     * @return
     */
    public String gerarRelatorio(int tipo, Date dataFiltragem) {
        return "";
    }

    /**
     * @param duracao 
     * @param local 
     * @param objetivo  
     * @param resumo  
     * @return
     */
    public Atividade cadastrarAtividade(int duracao, String local, String objetivo , String resumo ) {
        return null;
    }

    /**
     * @param data 
     * @param valor 
     * @param tipo 
     * @return
     */
    public ItemFiscal criarItemFiscal(Date data, double valor, int tipo) {
        return null;
    }

    /**
     * @return
     */
    public void iniciarCadastrarMembroEcomp() {
    }

    /**
     * @param nome 
     * @param CPF 
     * @param email 
     * @param cargo 
     * @return
     */
    public Ecomper cadastrarMembro(String nome, long CPF, String email, String cargo) {
        return null;
    }

    /**
     * @param proj  
     * @param ecomperId  
     * @return
     */
    public Ecomper cadastrarDesenvolvedor(Projeto proj , int ecomperId ) {
        return null;
    }

    /**
     * @param idProjeto 
     * @return
     */
    public void selecionarProjeto(int idProjeto) {
    }

    public void iniciarCadastrarItemFiscal() {

    }

    public void iniciarSelecionarProjeto() {

    }

}
