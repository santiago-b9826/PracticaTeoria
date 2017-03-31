package Vista;

import Controlador.CtrlAutomata;
import Modelo.Automata;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andres Pino Vallejo.
 * @author Santiago Bedoya Betancur.
 */
public class VistaAutomata extends javax.swing.JFrame {

    private CtrlAutomata ctrlAutomata = new CtrlAutomata();
    private Automata automata = ctrlAutomata.getAutomata();
    private DefaultTableModel tableModel = new DefaultTableModel();
    private JTable table = new JTable();
    private JScrollPane scrollPane = new JScrollPane();

    public VistaAutomata(ArrayList simbolos) {
        initComponents();
        setLocationRelativeTo(null);
        automata.setSimbolos(simbolos);
        configurarTabla();
        agregarFilas();
        this.add(this.scrollPane);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(568, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(115, 115, 115))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ctrlAutomata.simplificar();
    }//GEN-LAST:event_jButton1ActionPerformed

    //Ejemplo de agregar Filas
    private void agregarFilas() {
        ArrayList<ArrayList> transiciones = new ArrayList<>();
        ArrayList transiciones2 = new ArrayList<>();
        this.tableModel.addRow(new Object[]{"0", "1", "5"});
        transiciones2.add(1);
        transiciones2.add(5);
        transiciones.add(transiciones2);
        this.tableModel.addRow(new Object[]{"1", "2", "7"});
        transiciones2 = new ArrayList<>();
        transiciones2.add(2);
        transiciones2.add(7);
        transiciones.add(transiciones2);
        this.tableModel.addRow(new Object[]{"2", "2", "5"});
        transiciones2 = new ArrayList<>();
        transiciones2.add(2);
        transiciones2.add(5);
        transiciones.add(transiciones2);
        this.tableModel.addRow(new Object[]{"3", "5", "7"});
        transiciones2 = new ArrayList<>();
        transiciones2.add(5);
        transiciones2.add(7);
        transiciones.add(transiciones2);
        this.tableModel.addRow(new Object[]{"4", "5", "6"});
        transiciones2 = new ArrayList<>();
        transiciones2.add(5);
        transiciones2.add(6);
        transiciones.add(transiciones2);
        this.tableModel.addRow(new Object[]{"5", "3", "1"});
        transiciones2 = new ArrayList<>();
        transiciones2.add(3);
        transiciones2.add(1);
        transiciones.add(transiciones2);
        this.tableModel.addRow(new Object[]{"6", "8", "0"});
        transiciones2 = new ArrayList<>();
        transiciones2.add(8);
        transiciones2.add(0);
        transiciones.add(transiciones2);
        this.tableModel.addRow(new Object[]{"7", "0", "1"});
        transiciones2 = new ArrayList<>();
        transiciones2.add(0);
        transiciones2.add(1);
        transiciones.add(transiciones2);
        this.tableModel.addRow(new Object[]{"8", "3", "6"});
        transiciones2 = new ArrayList<>();
        transiciones2.add(3);
        transiciones2.add(6);
        transiciones.add(transiciones2);
        automata.setTransiciones(transiciones);
    }

    private void configurarTabla() {
        this.scrollPane.setSize(400, 400);
        tableModel.addColumn("");
        for (int i = 0; i < automata.getSimbolos().size(); i++) {
            tableModel.addColumn(automata.getSimbolos().get(i));
        }
        this.table.setModel(tableModel);
        this.scrollPane.setViewportView(this.table);
        this.scrollPane.setBounds(45, 40, 500, 200);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
