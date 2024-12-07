
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Relatorio {

    /**
     * Default constructor
     */
    public Relatorio(int tipo) {
        this.tipo = tipo;
    }


    /**
     * 
     */
    private int tipo;

    /**
     * @return
     */
    public String geraPdf() {
        return "";
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
