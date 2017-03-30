package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Andres Pino Vallejo.
 * @author Santiago Bedoya Betancur.
 */
public class Automata {

    private ArrayList<String> simbolos;
    private ArrayList<Estado> estados;
    private ArrayList<ArrayList> transiciones;

    public ArrayList<String> getSimbolos() {
        return simbolos;
    }

    public void setSimbolos(ArrayList<String> simbolos) {
        this.simbolos = simbolos;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public void setEstados(ArrayList<Estado> estados) {
        this.estados = estados;
    }

    public ArrayList<ArrayList> getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(ArrayList<ArrayList> transiciones) {
        this.transiciones = transiciones;
    }

}
