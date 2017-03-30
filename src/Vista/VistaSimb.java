package Vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VistaSimb extends javax.swing.JFrame {

    public VistaSimb() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnContinuar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtASimbolos = new javax.swing.JTextArea();
        lblSimbolos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        txtASimbolos.setColumns(20);
        txtASimbolos.setRows(5);
        jScrollPane1.setViewportView(txtASimbolos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 230, -1));

        lblSimbolos.setText("Ingrese (separados por comas) los simbolos");
        getContentPane().add(lblSimbolos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel1.setText(" de entrada del Autómata:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (txtASimbolos.getText().length() > 0) {
            ArrayList simbolos = extraerSimb(txtASimbolos.getText());
            VistaAutomata vistaAutomata = new VistaAutomata(simbolos);
            vistaAutomata.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa los simbolos del autómata.", "Temblor", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    public static void main(String[] args) {
        VistaSimb vistaSimb = new VistaSimb();
        vistaSimb.setVisible(true);
    }

    public ArrayList extraerSimb(String entrada) {
        ArrayList simbolos = new ArrayList();
        int aux = 0;
        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) == ',') {
                simbolos.add(entrada.substring(aux, i));
                aux = i + 1;
            }
            if (i == entrada.length() - 1) {
                simbolos.add(entrada.substring(aux, i + 1));
            }
        }
        return simbolos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSimbolos;
    private javax.swing.JTextArea txtASimbolos;
    // End of variables declaration//GEN-END:variables
}
