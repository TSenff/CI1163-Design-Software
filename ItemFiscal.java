
import java.io.*;
import java.util.*;

/**
 * 
 */
public class ItemFiscal {

    /**
     * Default constructor
     */
    public ItemFiscal(Date data, double valor) {
        this.data = data;
        this.valor = valor;
    }

    /**
     * 
     */
    private Date data;

    /**
     * 
     */
    private double valor;

    /**
     * 
     */
    private int tipo;

    /**
     * @return
     */
    public Date getData() {
        return this.data;
    }

    /**
     * @param value
     */
    public void setData(Date value) {
        this.data = value;
    }

    /**
     * @return
     */
    public double getValor() {
        return this.valor;
    }

    /**
     * @param value
     */
    public void setValor(double value) {
        this.valor = value;
    }

    /**
     * @return
     */
    public int getTipo() {
        return this.tipo;
    }

    /**
     * @param value
     */
    public void setTipo(int value) {
        this.tipo = value;
    }

}
