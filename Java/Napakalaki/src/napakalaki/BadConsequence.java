/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author juane619
 */
public class BadConsequence {
    static final int MAXTREASURES=10;
    
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    private ArrayList<TreasureKind> specificHiddenTreasures= new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures= new ArrayList();
    
    public BadConsequence(String text, int levels, int nVIsible, int nHidden){
        this.text= text;
        this.levels= levels;
        this.nHiddenTreasures= nHidden;
        this.nVisibleTreasures= nVIsible;
    }
    
    public BadConsequence(String text, boolean death){
        this.text= text;
        this.death= death;
    }
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
        this.text= text;
        this.levels= levels;
        specificHiddenTreasures= tHidden;
        specificVisibleTreasures= tVisible;
    }
    
    public Boolean isEmpty(){
        return nVisibleTreasures==0 && 
                nHiddenTreasures==0 && 
                specificHiddenTreasures.isEmpty() && 
                specificVisibleTreasures.isEmpty();
    }
    
    public BadConsequence adjustToFitTreasureLists(ArrayList<Treasure> v, ArrayList<Treasure> h){}

    public String getText() {
        return text;
    }

    public int getLevels() {
        return levels;
    }

    public int getNVisibleTreasures() {
        return nVisibleTreasures;
    }

    public int getNHiddenTreasures() {
        return nHiddenTreasures;
    }

    public boolean isDeath() {
        return death;
    }

    public ArrayList<TreasureKind> getSpecificHiddenTreasures() {
        return specificHiddenTreasures;
    }

    public ArrayList<TreasureKind> getSpecificVisibleTreasures() {
        return specificVisibleTreasures;
    }
    
    public void substractVisibleTreasure(Treasure t){}
    
    public void substractHiddenTreasure(Treasure t){}
    
    public String toString(){
        return "\nMal rollo= " +text + 
                "\nPErderas niveles= "+Integer.toString(levels)+
                "\nPErderas tesoros visibles= " + Integer.toString(nVisibleTreasures)+
                "\nPErderas Tesoros ocultos: " +  Integer.toString(nHiddenTreasures)+
                "\nMoriras: " + Boolean.toString(death) +
                "\nPerderas estos tesoros especificos visibles: " + specificVisibleTreasures.toString() +
                "\nPerderas estos tesoros especificos ocultos: " + specificHiddenTreasures.toString();
    }
}