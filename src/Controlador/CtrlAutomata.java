package Controlador;

import Modelo.Automata;

/**
 *
 * @author Andres Pino Vallejo.
 * @author Santiago Bedoya Betancur.
 */
public class CtrlAutomata {

    protected Automata automata = new Automata();
    private int[] visitados;

    public Automata getAutomata() {
        return automata;
    }

    public void setAutomata(Automata automata) {
        this.automata = automata;
    }

    public void convertDet() {

    }

    public void simplificar() {
        visitados = new int[automata.getTransiciones().size()];
        for (int i = 0; i < visitados.length; i++) {
            visitados[i] = 0;
        }
        verEstEx(0);
        for (int i = 0; i < visitados.length; i++) {
            if (visitados[i] == 0) {
                System.out.println(i);
            }
        }
    }

    public void verEstEx(int posicion) {
        visitados[posicion] = 1;
        for (int i = 0; i < automata.getSimbolos().size(); i++) {
            int a = (int) automata.getTransiciones().get(posicion).get(i);
            if (visitados[a] == 0) {
                verEstEx(a);
            }
        }
    }

}
