
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Etapa {

    /**
     * Default constructor
     */
    public Etapa(String cronograma, int status) {
        this.cronograma = cronograma;
        this.status = status;
    }

    /**
     * 
     */
    private String cronograma;

    /**
     * 
     */
    private int status;

    /**
     * @return
     */
    public String getCronograma() {
        return this.cronograma;
    }

    /**
     * @param value
     */
    public void setCronograma(String value ) {
        this.cronograma = value;
    }

    /**
     * @return
     */
    public int getStatus() {
        return this.status;
    }

    /**
     * @param value
     */
    public void setStatus(int value) {
        this.status = value;
    }

}
