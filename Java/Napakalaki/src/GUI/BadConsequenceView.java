/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import napakalaki.BadConsequence;

/**
 *
 * @author juane
 */
public class BadConsequenceView extends javax.swing.JPanel {
    BadConsequence bad_model;
    /**
     * Creates new form BadConsequenceView
     */
    public BadConsequenceView() {
        initComponents();
    }

    public void setBad(BadConsequence p_bad){
        bad_model= p_bad;
        
        this.ind_descr_bad.setText(bad_model.getText());
        this.ind_levels_bad.setText(Integer.toString(bad_model.getLevels()));
        
        repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l_tittle_bad = new javax.swing.JLabel();
        l_levels_bad = new javax.swing.JLabel();
        ind_descr_bad = new javax.swing.JLabel();
        ind_levels_bad = new javax.swing.JLabel();

        l_tittle_bad.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        l_tittle_bad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_tittle_bad.setText("BAD CONSEQUENCE");

        l_levels_bad.setText("Niveles que perderás:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ind_descr_bad, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addComponent(l_tittle_bad)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_levels_bad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ind_levels_bad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_tittle_bad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ind_levels_bad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_levels_bad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ind_descr_bad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ind_descr_bad;
    private javax.swing.JLabel ind_levels_bad;
    private javax.swing.JLabel l_levels_bad;
    private javax.swing.JLabel l_tittle_bad;
    // End of variables declaration//GEN-END:variables
}
