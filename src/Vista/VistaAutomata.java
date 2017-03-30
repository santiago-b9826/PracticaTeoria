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

    }//GEN-LAST:event_jButton1ActionPerformed

    //Ejemplo de agregar Filas
    private void agregarFilas() {
        this.tableModel.addRow(new Object[]{"Manuel", "Martinez", "Anillo"});
        this.tableModel.addRow(new Object[]{"Pedro", "Perez", "Puello"});
    }
 
    private void configurarTabla() {
        this.scrollPane.setSize(400, 400); 
        tableModel.addColumn("");//SASASASASASASASASAS
        for (int i = 0; i < automata.getSimbolos().size(); i++) {
            tableModel.addColumn(automata.getSimbolos().get(i));
        }
        this.table.setModel(tableModel);
        this.scrollPane.setViewportView(this.table);
        this.scrollPane.setBounds(45, 40, 400, 400);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
