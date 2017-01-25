/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import javax.swing.JPanel;
import napakalaki.Player;
import napakalaki.Treasure;

/**
 *
 * @author adr_i
 */
public class PlayerView extends javax.swing.JPanel {
    
    Player playerModel = null;

    /**
     * Creates new form PlayerView
     */
    public PlayerView() {
        initComponents();
    }
    
    public void setPlayer (Player p) {
        playerModel = p;
        // Incluir instrucciones para actualizar su nombre, nivel, etc.
        this.ind_name_player.setText(playerModel.getName());
        this.ind_level_player.setText(Integer.toString(playerModel.getLevels()));
        this.ind_cLevel_player.setText(Integer.toString(playerModel.getCombatLevel()));
        //MUERTE: this.ind_dead.setText(playerModel.get());
        
        // A continuación se actualizan sus tesoros
        fillTreasurePanel (p_visT_player, playerModel.getVisibleTreasures());
        fillTreasurePanel (p_hidT_player, playerModel.getHiddenTreasures());
        //this.pendingBadConsequenceView1.setPendingBad(playerModel.getPendingBadConsequence());
        repaint();
        revalidate();
    }
    
    private void fillTreasurePanel (JPanel aPanel, ArrayList<Treasure> aList) {
        // Se elimina la información antigua
        aPanel.removeAll();
        // Se recorre la lista de tesoros construyendo y añadiendo sus vistas
        //al panel
        for (Treasure t : aList) {
            TreasureView aTreasureView= new TreasureView();
            aTreasureView.setTreasure(t);
            aTreasureView.setVisible (true);
            aPanel.add (aTreasureView);
            aPanel.setVisible(true);
        }
        // Se fuerza la actualización visual del panel
        aPanel.repaint();
        aPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ind_name_player = new javax.swing.JLabel();
        pan_levels_player = new javax.swing.JPanel();
        pan_level_player = new javax.swing.JPanel();
        l_level_player = new javax.swing.JLabel();
        ind_level_player = new javax.swing.JLabel();
        pan_cLevel_player = new javax.swing.JPanel();
        l_combLevel_player = new javax.swing.JLabel();
        ind_cLevel_player = new javax.swing.JLabel();
        pan_botones_player = new javax.swing.JPanel();
        p_visT_player = new javax.swing.JPanel();
        p_hidT_player = new javax.swing.JPanel();

        ind_name_player.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        ind_name_player.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ind_name_player.setText("Nombre: ");
        ind_name_player.setBorder(null);

        l_level_player.setText("Player Level");

        ind_level_player.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        ind_level_player.setText("jLabel3");

        javax.swing.GroupLayout pan_level_playerLayout = new javax.swing.GroupLayout(pan_level_player);
        pan_level_player.setLayout(pan_level_playerLayout);
        pan_level_playerLayout.setHorizontalGroup(
            pan_level_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_level_playerLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(pan_level_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ind_level_player)
                    .addComponent(l_level_player))
                .addGap(53, 53, 53))
        );
        pan_level_playerLayout.setVerticalGroup(
            pan_level_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_level_playerLayout.createSequentialGroup()
                .addComponent(l_level_player)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(ind_level_player)
                .addGap(28, 28, 28))
        );

        l_combLevel_player.setText("Combat Level");

        ind_cLevel_player.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        ind_cLevel_player.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ind_cLevel_player.setText("jLabel4");

        javax.swing.GroupLayout pan_cLevel_playerLayout = new javax.swing.GroupLayout(pan_cLevel_player);
        pan_cLevel_player.setLayout(pan_cLevel_playerLayout);
        pan_cLevel_playerLayout.setHorizontalGroup(
            pan_cLevel_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_cLevel_playerLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(ind_cLevel_player)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_cLevel_playerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l_combLevel_player)
                .addGap(28, 28, 28))
        );
        pan_cLevel_playerLayout.setVerticalGroup(
            pan_cLevel_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_cLevel_playerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_combLevel_player)
                .addGap(18, 18, 18)
                .addComponent(ind_cLevel_player)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pan_levels_playerLayout = new javax.swing.GroupLayout(pan_levels_player);
        pan_levels_player.setLayout(pan_levels_playerLayout);
        pan_levels_playerLayout.setHorizontalGroup(
            pan_levels_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_levels_playerLayout.createSequentialGroup()
                .addComponent(pan_level_player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pan_cLevel_player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pan_levels_playerLayout.setVerticalGroup(
            pan_levels_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_levels_playerLayout.createSequentialGroup()
                .addComponent(pan_cLevel_player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pan_levels_playerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pan_level_player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout pan_botones_playerLayout = new javax.swing.GroupLayout(pan_botones_player);
        pan_botones_player.setLayout(pan_botones_playerLayout);
        pan_botones_playerLayout.setHorizontalGroup(
            pan_botones_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pan_botones_playerLayout.setVerticalGroup(
            pan_botones_playerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        p_visT_player.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Visible Treasures", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        p_visT_player.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        p_hidT_player.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hidden Treasures", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        p_hidT_player.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pan_botones_player, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pan_levels_player, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p_hidT_player, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_visT_player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(ind_name_player, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ind_name_player, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(pan_levels_player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(p_visT_player, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pan_botones_player, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_hidT_player, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ind_cLevel_player;
    private javax.swing.JLabel ind_level_player;
    private javax.swing.JLabel ind_name_player;
    private javax.swing.JLabel l_combLevel_player;
    private javax.swing.JLabel l_level_player;
    private javax.swing.JPanel p_hidT_player;
    private javax.swing.JPanel p_visT_player;
    private javax.swing.JPanel pan_botones_player;
    private javax.swing.JPanel pan_cLevel_player;
    private javax.swing.JPanel pan_level_player;
    private javax.swing.JPanel pan_levels_player;
    // End of variables declaration//GEN-END:variables
}