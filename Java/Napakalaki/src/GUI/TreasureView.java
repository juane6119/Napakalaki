package GUI;


import napakalaki.Treasure;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrianprodri
 */
public class TreasureView extends javax.swing.JPanel {
    
    private Treasure treasureModel;
    
    public void setTreasure(Treasure t){
        treasureModel = t;
        this.text_p.setText(treasureModel.getName());
        this.ind_level_treasure.setText(Integer.toString(treasureModel.getBonus()));
        this.ind_type_treasure.setText(treasureModel.getType().toString());
        repaint();
    }

    /**
     * Creates new form TreasureView
     */
    public TreasureView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ind_level_treasure = new javax.swing.JLabel();
        ind_type_treasure = new javax.swing.JLabel();
        text_p = new javax.swing.JTextField();

        ind_level_treasure.setText("jLabel2");

        ind_type_treasure.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        ind_type_treasure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ind_type_treasure.setText("jLabel3");

        text_p.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ind_type_treasure, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ind_level_treasure)
                            .addComponent(text_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(ind_level_treasure, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ind_type_treasure, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ind_level_treasure;
    private javax.swing.JLabel ind_type_treasure;
    private javax.swing.JTextField text_p;
    // End of variables declaration//GEN-END:variables
}