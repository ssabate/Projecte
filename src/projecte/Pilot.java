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
    private String nom = null;
    private int dorsal = 0;
    private boolean home = false;
    private double dinersGuanyats = 0.0;
    private boolean omplit = false;

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
        this.dinersGuanyats = dinersGuanyats;
    }

    public boolean isOmplit() {
        return omplit;
    }

    public void setOmplit(boolean omplit) {
        this.omplit = omplit;
    }

}
