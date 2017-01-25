/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import napakalaki.Monster;

/**
 *
 * @author juane
 */
public class MonsterView extends javax.swing.JPanel {
    Monster monster_model;
    /**
     * Creates new form MonsterView
     */
    public MonsterView() {
        initComponents();
    }

    public void setMonster(Monster p_mons){
        monster_model= p_mons;
        
        this.ind_name_monster.setText(monster_model.getName());
        this.ind_level_monster.setText(Integer.toString(monster_model.getCombatLevel()));
        
        this.badView_monster.setBad(monster_model.getBadConsequence());
        this.prizeView_monster.setPrize(monster_model.getPrize());
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

        panel_prize_monster = new javax.swing.JPanel();
        prizeView_monster = new GUI.PrizeView();
        pan_bad_monster = new javax.swing.JPanel();
        badView_monster = new GUI.BadConsequenceView();
        pane_inf_monster = new javax.swing.JPanel();
        ind_level_monster = new javax.swing.JTextField();
        l_name_monster = new javax.swing.JLabel();
        ind_name_monster = new javax.swing.JTextField();
        l_tittle_monster = new javax.swing.JLabel();
        l_level_monster = new javax.swing.JLabel();

        javax.swing.GroupLayout panel_prize_monsterLayout = new javax.swing.GroupLayout(panel_prize_monster);
        panel_prize_monster.setLayout(panel_prize_monsterLayout);
        panel_prize_monsterLayout.setHorizontalGroup(
            panel_prize_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prize_monsterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(prizeView_monster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panel_prize_monsterLayout.setVerticalGroup(
            panel_prize_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_prize_monsterLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(prizeView_monster, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pan_bad_monsterLayout = new javax.swing.GroupLayout(pan_bad_monster);
        pan_bad_monster.setLayout(pan_bad_monsterLayout);
        pan_bad_monsterLayout.setHorizontalGroup(
            pan_bad_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan_bad_monsterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(badView_monster, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        pan_bad_monsterLayout.setVerticalGroup(
            pan_bad_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan_bad_monsterLayout.createSequentialGroup()
                .addComponent(badView_monster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        ind_level_monster.setText("jTextField2");

        l_name_monster.setText("Nombre: ");

        ind_name_monster.setText("jTextField1");

        l_tittle_monster.setText("MONSTRUO");

        l_level_monster.setText("Nivel de combate: ");

        javax.swing.GroupLayout pane_inf_monsterLayout = new javax.swing.GroupLayout(pane_inf_monster);
        pane_inf_monster.setLayout(pane_inf_monsterLayout);
        pane_inf_monsterLayout.setHorizontalGroup(
            pane_inf_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_inf_monsterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pane_inf_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_inf_monsterLayout.createSequentialGroup()
                        .addGroup(pane_inf_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pane_inf_monsterLayout.createSequentialGroup()
                                .addComponent(l_name_monster)
                                .addGap(76, 76, 76)
                                .addComponent(ind_name_monster))
                            .addGroup(pane_inf_monsterLayout.createSequentialGroup()
                                .addComponent(l_level_monster)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ind_level_monster)
                                .addGap(1, 1, 1)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_inf_monsterLayout.createSequentialGroup()
                        .addComponent(l_tittle_monster)
                        .addGap(56, 56, 56))))
        );
        pane_inf_monsterLayout.setVerticalGroup(
            pane_inf_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_inf_monsterLayout.createSequentialGroup()
                .addComponent(l_tittle_monster)
                .addGap(20, 20, 20)
                .addGroup(pane_inf_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_name_monster)
                    .addComponent(ind_name_monster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pane_inf_monsterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l_level_monster)
                    .addComponent(ind_level_monster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane_inf_monster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_prize_monster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pan_bad_monster, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pane_inf_monster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_prize_monster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pan_bad_monster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.BadConsequenceView badView_monster;
    private javax.swing.JTextField ind_level_monster;
    private javax.swing.JTextField ind_name_monster;
    private javax.swing.JLabel l_level_monster;
    private javax.swing.JLabel l_name_monster;
    private javax.swing.JLabel l_tittle_monster;
    private javax.swing.JPanel pan_bad_monster;
    private javax.swing.JPanel pane_inf_monster;
    private javax.swing.JPanel panel_prize_monster;
    private GUI.PrizeView prizeView_monster;
    // End of variables declaration//GEN-END:variables
}
