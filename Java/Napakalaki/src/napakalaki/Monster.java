/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author juane619
 */
public class Monster {
    private String name;
    private int combatLevel;
    private Prize premio;
    private BadConsequence castigo;
    
    public Monster(String name, int level, BadConsequence bc, Prize prize){
       this.name= name;
       this.combatLevel= level;
       this.premio= prize;
       this.castigo= bc;             
    }

    public String getName() {
        return name;
    }

    public int getCombatLevel() {
        return combatLevel;
    }

    public int getLevelGained(){
        return premio.getLevel();
    }
    
    public int getTreasuresGained(){
        return premio.getTreasures();
    }

    public BadConsequence getCastigo() {
        return castigo;
    }
    
    public String toString(){
        return "\n\nNombre del monstruo= " +name + "\nNivel de combate= "+Integer.toString(combatLevel)+"\nPremio: " +premio.toString()+"\nCASTIGO: " + castigo.toString();
    }
}