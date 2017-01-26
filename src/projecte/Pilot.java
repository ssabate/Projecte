/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

/**
 *
 * @author profe
 */
public class Pilot {
     // Les meues propietats 
    private String nom;
    private int dorsal;
    private boolean home;
    private double dinersGuanyats;
    private boolean omplit;

    public Pilot() {
    }
    
    public Pilot(String nom) {
        this.nom=nom;
    }
    
    public Pilot(String nom, int dorsal) {
        this.nom=nom;
        this.dorsal=dorsal;
    }

    @Override
    public String toString() {
        
        return "\nNom: "+nom+
               "\nDorsal: "+dorsal+
               "\nDiners guanyats: "+dinersGuanyats+
               (home?"\nÉs home":"\nÉs dona");
    }
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public boolean isHome() {
        return home;
    }

    public void setHome(boolean home) {
        this.home = home;
    }

    public double getDinersGuanyats() {
        return dinersGuanyats;
    }

    public void setDinersGuanyats(double dinersGuanyats) {
        if(dinersGuanyats<0) System.out.println("Els diners no poden ser negatius!!");
        else this.dinersGuanyats = dinersGuanyats;
    }

    public boolean isOmplit() {
        return omplit;
    }

    public void setOmplit(boolean omplit) {
        this.omplit = omplit;
    }

}
